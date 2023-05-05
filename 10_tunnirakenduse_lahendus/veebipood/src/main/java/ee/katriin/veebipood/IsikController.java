package ee.katriin.veebipood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class IsikController {
    @Autowired
    IsikRepository isikRepository;
    List<Isik> isikud = new ArrayList<>(Arrays.asList(
            new Isik(1, "Peeter", "Koola", new Date()),
            new Isik(2, "Mari", "Fanta", new Date()),
            new Isik(3, "Priit", "Sprite", new Date()),
            new Isik(4, "Malle", "Vichy", new Date()),
            new Isik(5, "Triin", "Vitamin", new Date())
    ));

    @GetMapping("isikud")
    public List<Isik> saaIsikud() {
        return isikRepository.findAll();
        //return isikud;
    }

    // DELETE localhost:8080/kustuta-isik/1
    @GetMapping("kustuta-isik-variant-2/{id}")
    public String kustutaIsikVariant2(@PathVariable int id) {
        //isikud.remove(index);
        isikRepository.deleteById(id);
        return "Isik kustutatud!";
    }


    //POST localhost:8080/lisa-isik?id=1&eesnimi=Ees&perenimi=Pere
    @GetMapping("lisa-isik")
    public List<Isik> lisaIsikURLParameetritega(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi) {
        //isikud.add(new Isik(id, eesnimi, perenimi, new Date()));
        isikRepository.save(new Isik(id, eesnimi, perenimi, new Date()));
        return isikRepository.findAll();
        //return isikud;
    }

    //localhost:8080/lisa-isik?id=8&nimi=Mullivesi&hind=2.3&aktiivne=true

}

