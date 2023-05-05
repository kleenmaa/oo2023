package ee.katriin.kodutoo;
import java.time.LocalDate;
import java.util.List;
import java.util.Arrays;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaenutusController {
    Laenutus laenutus = new Laenutus(1, "12345", Arrays.asList("Vemmad Lõvisüdamed", "Tõde ja Õigus"));

    @GetMapping("laenutus")
    public Laenutus saaLaenutus() {
        return laenutus;
    }

    @GetMapping("kustuta-laenutus")
    public String kustutaLaenutus() {
        laenutus = null;
        return "Laenutus on edukalt kustutatud!";
    }

    @GetMapping("muuda-tagastatuks")
    public Laenutus muudaTagastatuks() {
        laenutus.setTagastatud(!laenutus.isTagastatud());
        return laenutus;
    }

    @GetMapping("pikenda-tagastamiseaega")
    public Laenutus pikendaTagastamiseAega() {
        laenutus.setPikendatud(!laenutus.isPikendatud());
        laenutus.setTagastamiseAeg(laenutus.getTagastamiseAeg().plusDays(14));
        return laenutus;
    }
}
