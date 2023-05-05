package ee.katriin.kodutoo;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class LaenutusListController {
    List<Laenutus> laenutused = new ArrayList<>(Arrays.asList(
            new Laenutus(1, "123455", Arrays.asList("Vemmad Lõvisüdamed", "Tõde ja Õigus")),
            new Laenutus(2, "234567", Arrays.asList("Süü on tähtedel", "Harry Potter")),
            new Laenutus(3, "345678", Arrays.asList("Suhkrust ja jahust")),
            new Laenutus(4, "456789", Arrays.asList("Kui ainult", "Lootusetu"))

    ));

    @GetMapping("laenutused")
    public List<Laenutus> saaLaenutused() {
        return laenutused;
    }

    @GetMapping ("kustuta-laenutus/{index}")
    public List<Laenutus> kustutaLaenutus(@PathVariable int index) {
        laenutused.remove(index);
        return laenutused;
    }

    @GetMapping("lisa-laenutus")
    public List<Laenutus> lisaLaenutusURLParameetritega(
            @RequestParam int id,
            @RequestParam String lugejaKaardiNumber,
            @RequestParam List<String> raamatud) {
        laenutused.add(new Laenutus(id, lugejaKaardiNumber, raamatud));
        return laenutused;
    }
    //localhost:8080/lisa-laenutus?id=5&lugejaKaardiNumber=567890&raamatud=Pihtimused

    @GetMapping("pikenda-tagastamisekuupaevad/{paevad}")
    public List<Laenutus> pikendaTagastamiseKuupaevad(@PathVariable int paevad) {
        for (Laenutus laenutus : laenutused) {
            LocalDate vanaKuupaev = laenutus.getTagastamiseAeg();
            LocalDate uusKuupaev = vanaKuupaev.plusDays(paevad);
            laenutus.setTagastamiseAeg(uusKuupaev);
        }
        return laenutused;
    }

}
