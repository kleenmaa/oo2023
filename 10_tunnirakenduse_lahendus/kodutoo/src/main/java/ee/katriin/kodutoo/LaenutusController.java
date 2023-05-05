package ee.katriin.kodutoo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LaenutusController {

    @Autowired
    IsikController isikController;
    @Autowired
    LugejakaartController lugejakaartController;


    Isik laenutaja1 = new Isik(1, "katriin@gmail.com", "Katriin Liselle",
            "Eenmaa", "Asunduse 4-25", "54567843");

    Isik laenutaja2 = new Isik(2,"kristo@gmail.com", "Kristo",
            "Viidas", "Oksa 6", "54567842");
    Isik laenutaja3 = new Isik(3,"kerli@gmail.com", "Kerli",
            "Viidas", "Oksa 8", "54565555");


    Lugejakaart lugejakaart1 = new Lugejakaart(1, laenutaja1, "123456", true, LocalDate.now(),
                    LocalDate.now().plusYears(2), null);
    Lugejakaart lugejakaart2 = new Lugejakaart(2, laenutaja2, "123457", true, LocalDate.now(),
                    LocalDate.now().plusYears(2), null);
    Lugejakaart lugejakaart3 = new Lugejakaart(3, laenutaja3, "123459", true, LocalDate.now(),
                    LocalDate.now().plusYears(2), null);

    List<Laenutus> laenutused = new ArrayList<>(Arrays.asList(
            new Laenutus (1, LocalDate.now(), LocalDate.now().plusDays(30), lugejakaart1,
                    Arrays.asList("Vemmad Lõvisüdamed", "Tõde ja Õigus"), false, false),
            new Laenutus (2, LocalDate.now(), LocalDate.now().plusDays(30), lugejakaart2,
                    Arrays.asList("Süü on tähtedel", "Harry Potter"), false, false),
            new Laenutus (3, LocalDate.now(), LocalDate.now().plusDays(30), lugejakaart3,
                    Arrays.asList("Suhkrust ja jahust"), false, false)
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

    @GetMapping("pikenda-tagastamisekuupaevad/{paevad}")
    public List<Laenutus> pikendaTagastamiseKuupaevad(@PathVariable int paevad) {
        for (Laenutus laenutus : laenutused) {
            LocalDate vanaKuupaev = laenutus.getTagastamiseAeg();
            LocalDate uusKuupaev = vanaKuupaev.plusDays(paevad);
            laenutus.setTagastamiseAeg(uusKuupaev);
        }
        return laenutused;
    }
//
//     localhost:8080/lisa-laenutus
//     {
//        "id": 77,
//        "lugejakaart": {
//            "id": 1
//        }
//    }

    @PostMapping("lisa-laenutus")
    public List<Laenutus> lisaLaenutusURLParameetritega4(
            @RequestBody Laenutus laenutus) {
        //System.out.println(laenutus.getId());
        //System.out.println(laenutus.getLugejakaart());
        //System.out.println(laenutus.getRaamatud());
        Lugejakaart lugejakaart = lugejakaartController.lugejakaardid.get(laenutus.getLugejakaart().getId());


        laenutused.add(new Laenutus(laenutus.getId(), LocalDate.now(), LocalDate.now().plusDays(30),
                lugejakaart, Arrays.asList("Peeter Paan", "Nõid"), false, false));
        return laenutused;
    }


}
