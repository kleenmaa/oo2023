package ee.katriin.veebipood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class TellimusController {

    @Autowired
    IsikRepository isikRepository;
    //IsikController isikController; //nii ta ei tee kogu aeg uusi mälukohti
    @Autowired
    ToodeRepository toodeRepository;
    //ToodeController toodeController; //nii ta ei tee kogu aeg uusi mälukohti

    @Autowired
    TellimusRepository tellimusRepository;

    List<Toode> tellimuseTooted = new ArrayList<>(Arrays.asList(
            new Toode(3, "Sprite", 1.7),
            new Toode(3, "Sprite", 1.7)
    ));

    List<Toode> tellimuse2Tooted = new ArrayList<>(Arrays.asList(
            new Toode(3, "Sprite", 1.7),
            new Toode(4, "Vichy", 2.0),
            new Toode(5, "Vitamin well", 2.5)
    ));

    Isik tellija = new Isik(1, "Ees", "Pere", new Date());
    List<Tellimus> tellimused = new ArrayList<>(Arrays.asList(
            new Tellimus(1, tellija, tellimuseTooted),
            new Tellimus(2, tellija, tellimuse2Tooted)
    ));

    @GetMapping("tellimused")
    public List<Tellimus> saaTellimused() {
        //return tellimused;
        return tellimusRepository.findAll();
    }

    // DELETE localhost:8080/kustuta-tellimus/1
    @DeleteMapping ("kustuta-tellimus/{id}")
    public String kustutaTellimus(@PathVariable int id) {
        tellimusRepository.deleteById(id);
        return "Tellimus kustutatud!";
    }


//    //POST localhost:8080/lisa-tellimus?id=9&tellijaIndex=3&tooteIndex=2
//    @PostMapping("lisa-tellimus")
//    public List<Tellimus> lisaTellimusURLParameetritega(
//            @RequestParam int id,
//            @RequestParam int tellijaIndex,
//            @RequestParam int tooteIndex) {
//        //tellimused.add(new Tellimus(id, nimi, hind));
//        //IsikController isikController = new IsikController();
//        //System.out.println(isikController); // prindib välja MÄLUKOHA Dependency Injection
//        Isik tellija = isikController.isikud.get(tellijaIndex);
//
//        //ToodeController toodeController = new ToodeController();
//        Toode tellitudToode = toodeController.tooted.get(tooteIndex);
//        List<Toode> tellitudTooted = new ArrayList<>(Arrays.asList(tellitudToode));
//
//        tellimused.add(new Tellimus(id, tellija, tellitudTooted));
//        return tellimused;
//    }

    //POST localhost:8080/lisa-tellimus2?id=9&tellijaId=1&tooteIds=1,2
    @PostMapping("lisa-tellimus2")
    public List<Tellimus> lisaTellimusURLParameetritega2(
            @RequestParam int id,
            @RequestParam int tellijaId,
            //@RequestParam List<Integer> tooteIndexid,
            @RequestParam int[] tooteIds) throws Exception {

        Isik tellija = isikRepository.findById(tellijaId).get();

        List<Toode> tellitudTooted = new ArrayList<>();
        for (Integer i: tooteIds) {
//            if (i != 4) {
//                Toode toode = toodeRepository.findById(i).get();
//                tellitudTooted.add(toode);
//            }  <----- see lahendus lisab andmebaasi kõik tooted peale 4-a
//            if (i == 4) {
//                return tellimusRepository.findAll();
//            } <------- see lahendus ei lisa mitte midagi andmebaasi aga ta ei ütle et ei õnnestu
            if (i==4) {
                throw new Exception("ID-ga 4 ei saa andmebaasi lisada!"); //lõppeb, ei lisa midagi andmebaasi ja tuleb ka sõnum
            }
            Toode toode = toodeRepository.findById(i).get();
            tellitudTooted.add(toode);
        }

        //tellimused.add(new Tellimus(id, tellija, tellitudTooted));
        tellimusRepository.save(new Tellimus(id, tellija, tellitudTooted));
        //return tellimused;
        return tellimusRepository.findAll();
    }

    //POST localhost:8080/lisa-tellimus3
    // body raw ja json :
    // {
    //    "id": 77,
    //    "tellija": {
    //        "id": 1,
    //        "eesnimi": "Mari",
    //        "perenimi": "Vaarikas"
    //    },
    //    "tooted": [
    //        {
    //            "id": 2,
    //            "nimi": "coca",
    //            "hind": 0.1
    //        },
    //        {
    //            "id": 3,
    //            "nimi": "fanta",
    //            "hind": 0.2
    //        }
    //    ]
    //}
    @PostMapping("lisa-tellimus3")
    public List<Tellimus> lisaTellimusURLParameetritega3(
            @RequestBody Tellimus tellimus) {

        //tellimused.add(tellimus);
       // return tellimused;
        tellimusRepository.save(tellimus);
       return tellimusRepository.findAll();
    }

    //POST localhost:8080/lisa-tellimus4
    // body raw json
    // {
    //    "id": 77,
    //    "tellija": {
    //        "id": 1
    //    },
    //    "tooted": [
    //        {
    //            "id": 2
    //        },
    //        {
    //            "id": 3
    //        }
    //    ]
    //}

    @PostMapping("lisa-tellimus4")
    public List<Tellimus> lisaTellimusURLParameetritega4(
            @RequestBody Tellimus tellimus) {
        System.out.println(tellimus.getId());
        System.out.println(tellimus.getTellija());
        System.out.println(tellimus.getTooted());
        //Isik isik = isikController.isikud.get(tellimus.getTellija().getId());
        Isik isik = isikRepository.findById(tellimus.getTellija().getId()).get();

        List<Toode> tellitudTooted = new ArrayList<>();
        for (Toode t: tellimus.getTooted()) {
            //Toode toode = toodeController.tooted.get(t.getId());
            Toode toode = toodeRepository.findById(t.getId()).get();
            tellitudTooted.add(toode);
        }

        //tellimused.add(new Tellimus(tellimus.getId(), isik, tellitudTooted));
        tellimusRepository.save(new Tellimus(tellimus.getId(), isik, tellitudTooted));
        //return tellimused;
        return tellimusRepository.findAll();
    }

    @GetMapping("saa-kogusumma")
    public double saaKoguSumma() {
        List<Tellimus> tellimused = tellimusRepository.findAll();
        double kogusumma = 0;
        for (Tellimus t: tellimused) {
            for (Toode toode: t.getTooted()) {
               // kogusumma = kogusumma + toode.getHind(); //see sama asi nagu alumine
                kogusumma += toode.getHind();
            }
        }
        return kogusumma;
    }
}
