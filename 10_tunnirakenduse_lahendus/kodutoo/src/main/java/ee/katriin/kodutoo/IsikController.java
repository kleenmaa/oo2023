package ee.katriin.kodutoo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class IsikController {
    List<Isik> isikud = new ArrayList<>(Arrays.asList(
            new Isik(1,"katriin@gmail.com", "Katriin Liselle", "Eenmaa",
                    "Asunduse 4-25", "54567843"),
            new Isik(2,"kristo@gmail.com", "Kristo", "Viidas",
                    "Oksa 6", "54567842"),
            new Isik(3,"kerli@gmail.com", "Kerli", "Viidas",
                    "Oksa 8", "54567555")
    ));

    @GetMapping("isikud")
    public List<Isik> saaIsikud() {

        return isikud;
    }

    // DELETE localhost:8080/kustuta-isik/1
    @DeleteMapping ("kustuta-isik/{index}")
    public String kustutaIsikVariant2(@PathVariable int index) {
        isikud.remove(index);
        return "Isik kustutatud!";
    }


    //POST localhost:8080/lisa-isik?id=5&eesnimi=Mari&perenimi=Maasikas&email=mari@gmail.com&aadress=Pikk 22&telefon=54545454
    @PostMapping("lisa-isik")
    public List<Isik> lisaIsikURLParameetritega(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi,
            @RequestParam String email,
            @RequestParam String aadress,
            @RequestParam String telefon) {
        isikud.add(new Isik(id, eesnimi, perenimi, email, aadress, telefon));
        return isikud;
    }
}
