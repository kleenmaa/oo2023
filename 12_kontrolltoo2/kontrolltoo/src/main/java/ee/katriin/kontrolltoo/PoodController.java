package ee.katriin.kontrolltoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PoodController {
    @Autowired
    ToodeController toodeController;
    List<Toode> poeTooted = new ArrayList<>(Arrays.asList(
            new Toode(1, "Vesi", 0.80, 10, 37 ),
            new Toode(2, "Piim", 1, 0, 10),
            new Toode(3, "Keefir", 2, 0, 22)
    ));

    List<Toode> poeTooted2 = new ArrayList<>(Arrays.asList(
            new Toode(2, "Piim", 1, 0, 10)
            ));


    List<Pood> poed = new ArrayList<>(Arrays.asList(
            new Pood(1, "Selver", poeTooted),
            new Pood(2, "Prisma", poeTooted2)
    ));

    @PostMapping("lisa-pood-ja-tooted")
    public List<Pood> lisaPoodJaTooted(
            @RequestBody  Pood pood) {
        poed.add(pood);
        return poed;

    }

//    {
//            "id": 7,
//            "nimetus": "Maxima",
//
//            "tooted": [
//                {
//                    "id": 1,
//                    "nimetus": "Coca",
//                    "hind": 2,
//                    "allahindlus": 0,
//                    "kogus_laos": 17
//
//
//                },
//                {
//                    "id": 2,
//                    "nimetus": "Fanta",
//                    "hind": 1.9,
//                    "allahindlus": 0,
//                    "kogus_laos": 18
//                }
//            ]
//        }

//    // localhost:8080/leia-nime-alusel1?nimetus=Prisma
    @GetMapping("leia-nime-alusel1")
    public List<Toode> leiaNimeAlusel1(
            @RequestParam String nimetus
    ) {
        List<Toode> tooted = poed.get(0).getTooted();
        List<Toode> tagastatavadTooted = new ArrayList<>();
        for (int i = 0; i < poed.size(); i++) {
            if (poed.get(i).getNimetus().equals(nimetus)) {
                if (poed.get(i).getNimetus().equals(nimetus)) {
                    tagastatavadTooted.add(tooted.get(i));
                }
            }
        }
        return tagastatavadTooted;
    }


//    @GetMapping("leia-nime-alusel1")
//    public List<Toode> leiaNimeAlusel1(
//            @RequestParam String nimetus
//    ) {
//        List<Pood> poed = new ArrayList<>(Arrays.asList(
//                new Pood(1, "Selver", Arrays.asList()),
//                new Pood(2, "Prisma", poeTooted2)
//        ));
//        List<Toode> tagastatavadTooted = new ArrayList<>();
//        for (int i = 0; i < poed.size(); i++) {
//            if (poed.get(i).getNimetus().equals(nimetus)) {
//                if (poed.get(i).getNimetus().equals(nimetus)) {
//                    tagastatavadTooted.add(tooted.get(i));
//                }
//            }
//        }
//        return tagastatavadTooted;
   // }


   // localhost:8080/leia-nime-alusel?nimetus=Vesi
    @GetMapping("leia-nime-alusel")
    public List<Toode> leiaNimeAlusel(
            @RequestParam String nimetus
    ) {

        List<Toode> poeTooted3 = new ArrayList<>(Arrays.asList(
                new Toode(1, "Vesi", 0.80, 10, 37 ),
                new Toode(2, "Piim", 1, 0, 10),
                new Toode(3, "Keefir", 2, 0, 22)
        ));
        List<Toode> tagastatavadTooted = new ArrayList<>();
        for (int i = 0; i < poeTooted3.size(); i++) {
            if (poeTooted3.get(i).getNimetus().equals(nimetus)) {
                if (poeTooted3.get(i).getNimetus().equals(nimetus)) {
                    tagastatavadTooted.add(poeTooted3.get(i));
                }
            }
        }
        return tagastatavadTooted;
    }

    // localhost:8080/leia-soodushinnaga
    @GetMapping("leia-soodushinnaga")
    public List<Toode> leiaSoodushinnaga(
    ) {

        List<Toode> poeTooted3 = new ArrayList<>(Arrays.asList(
                new Toode(1, "Vesi", 0.80, 10, 37 ),
                new Toode(2, "Piim", 1, 0, 10),
                new Toode(3, "Keefir", 2, 0, 22),
                new Toode(3, "Kaerahelbepuder", 3.2, 12, 25)
        ));
        List<Toode> tagastatavadTooted = new ArrayList<>();
        for (int i = 0; i < poeTooted3.size(); i++) {
            if (poeTooted3.get(i).getAllahindlus() > 0) {
                if (poeTooted3.get(i).getAllahindlus() > 0) {
                    tagastatavadTooted.add(poeTooted3.get(i));
                }
            }
        }
        return tagastatavadTooted;
    }

    // localhost:8080/hind-vaiksem?summa=2
    @GetMapping("hind-vaiksem")
    public List<Toode> hindVaiksem(
            @RequestParam double summa
    ) {

        List<Toode> poeTooted3 = new ArrayList<>(Arrays.asList(
                new Toode(1, "Vesi", 0.80, 10, 37 ),
                new Toode(2, "Piim", 1, 0, 10),
                new Toode(3, "Keefir", 2, 0, 22),
                new Toode(3, "Kaerahelbepuder", 3.2, 12, 25)
        ));
        List<Toode> tagastatavadTooted = new ArrayList<>();
        for (int i = 0; i < poeTooted3.size(); i++) {
            if (poeTooted3.get(i).getHind() < summa) {
                if (poeTooted3.get(i).getHind() < summa) {
                    tagastatavadTooted.add(poeTooted3.get(i));
                }
            }
        }
        return tagastatavadTooted;
    }

    // localhost:8080/kontroll
    @GetMapping("kontroll")
    public List<Toode> kontoll(
    ) throws Exception {

        List<Toode> poeTooted3 = new ArrayList<>(Arrays.asList(
                new Toode(1, "Vesi", 0.80, 10, 37 ),
                new Toode(2, "Piim", 1, 0, 10),
                new Toode(3, "Keefir", 2, 0, 22),
                new Toode(3, "Kaerahelbepuder", 3.2, 0, 25)
        ));
        List<Toode> tagastatavadTooted = new ArrayList<>();
        for (int i = 0; i < poeTooted3.size(); i++) {
            if (poeTooted3.get(i).getHind() < poeTooted3.get(i).getAllahindlus()) {
                if (poeTooted3.get(i).getHind() < poeTooted3.get(i).getAllahindlus()) {
                    throw new Exception("Allahindlus ei saa olla suurem kui hind!");
                }
            }
        }
        return tagastatavadTooted;
    }






//    // localhost:8080/leia-rasva-alusel2?alg=1&l6pp=5
//    @GetMapping("leia-nime-alusel")
//    public List<Toiduaine> leiaRasvaAlusel2(
//            @RequestParam int alg,
//            @RequestParam int l6pp
//    ) {
//        List<Toiduaine> toiduained = toiduaineRepository.findAll();
//        List<Toiduaine> tagastatavadToiduained = new ArrayList<>();
//        for (int i = 0; i < toiduained.size(); i++) {
//            if (toiduained.get(i).getRasv() > alg && toiduained.get(i).getRasv() < l6pp) {
//                if (toiduained.get(i).getRasv() > alg && toiduained.get(i).getRasv() < l6pp) {
//                    tagastatavadToiduained.add(toiduained.get(i));
//                }
//            }
//        }
//        return tagastatavadToiduained;
    }


