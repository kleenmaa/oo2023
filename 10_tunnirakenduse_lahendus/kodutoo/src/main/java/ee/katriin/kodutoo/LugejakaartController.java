package ee.katriin.kodutoo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class LugejakaartController {

    Isik laenutaja1 = new Isik(1, "katriin@gmail.com", "Katriin Liselle",
            "Eenmaa", "Asunduse 4-25", "54567843");

    Isik laenutaja2 = new Isik(2,"kristo@gmail.com", "Kristo",
            "Viidas", "Oksa 6", "54567842");
    Isik laenutaja3 = new Isik(3,"kerli@gmail.com", "Kerli",
            "Viidas", "Oksa 8", "54565555");
    List<Lugejakaart> lugejakaardid = new ArrayList<>(Arrays.asList(
            new Lugejakaart(1, laenutaja1, "123456", true, LocalDate.now(),
                    LocalDate.now().plusYears(2), null),
            new Lugejakaart(2, laenutaja2, "123457", true, LocalDate.now(),
                    LocalDate.now().plusYears(2), null),
            new Lugejakaart(3, laenutaja3, "123459", true, LocalDate.now(),
                    LocalDate.now().plusYears(2), null)
    ));

    @GetMapping("lugejakaardid")
    public List<Lugejakaart> saaLugejakaardid() {

        return lugejakaardid;
    }

    // DELETE localhost:8080/kustuta-lugejakaart/1
    @DeleteMapping ("kustuta-lugejakaart/{index}")
    public String kustutaLugejakaart(@PathVariable int index) {
        lugejakaardid.remove(index);
        return "Lugejakaart kustutatud!";
}

}
