package ee.katriin.kontrolltoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class KorvController {

    @Autowired
    ToodeController toodeController;

    List<Toode> tooted = new ArrayList<>(Arrays.asList(
            new Toode(1, "Vesi", 0.80, 10, 37 ),
            new Toode(2, "Piim", 1, 0, 10),
            new Toode(3, "Keefir", 2, 0, 22),
            new Toode(4, "Kanafilee", 4.5, 25, 22)
    ));

    Toode toode1 = new Toode(1, "Vesi", 0.80, 10, 37 );
    Toode toode2 =  new Toode(2, "Piim", 1, 0, 10);

    List<Korv> korvid = new ArrayList<>(Arrays.asList(
//            new Korv(1, Arrays.asList(toode1, toode2)),
//            new Korv(2, Arrays.asList(toode1, toode2))
    ));

    // localhost:8080/lisa-tooteid
    @PostMapping("lisa-tooteid")
    public List<Korv> lisaTooteidURLParameetritega4(
            @RequestBody Korv korv) {
        System.out.println(korv.getId());
        System.out.println(korv.getTooted());
        //Isik isik = isikController.isikud.get(tellimus.getTellija().getId());

        List<Toode> ostetudTooted = new ArrayList<>();
        for (Toode t: korv.getTooted()) {
            Toode toode = tooted.get(t.getId());
            //Toode toode = tooted.findById(t.getId()).get();
            ostetudTooted.add(toode);
        }

        korvid.add(new Korv(korv.getId(), ostetudTooted));
        return korvid;
    }

    @GetMapping("saa-kogusumma")
    public double saaKoguSumma() {
        List<Toode> tooted1 = new ArrayList<>(Arrays.asList(
                new Toode(1, "Vesi", 0.80, 10, 37 ),
                new Toode(2, "Piim", 1, 0, 10),
                new Toode(3, "Keefir", 2, 0, 22),
                new Toode(4, "Kanafilee", 4.5, 25, 22)
        ));


        List<Korv> korvid = new ArrayList<>(Arrays.asList(
           new Korv(1, tooted)
        ));
        double kogusumma = 0;
        for (Korv t: korvid) {
            for (Toode toode: t.getTooted()) {
                // kogusumma = kogusumma + toode.getHind(); //see sama asi nagu alumine

                kogusumma += (toode.getHind() - ((toode.getAllahindlus()/100.0) * toode.getHind()));
            }
        }
        return kogusumma;
    }

    @GetMapping("saa-tagasi")
    public double saaRahaTagasi(
            @RequestParam double raha,
            @RequestParam int ostukorv

    ) {

        List<Toode> tooted1 = new ArrayList<>(Arrays.asList(
                new Toode(1, "Vesi", 0.80, 10, 37 ),
                new Toode(2, "Piim", 1, 0, 10),
                new Toode(3, "Keefir", 2, 0, 22),
                new Toode(4, "Kanafilee", 4.5, 25, 22)
        ));


        List<Korv> korvid = new ArrayList<>(Arrays.asList(
                new Korv(1, tooted)
        ));
        double kogusumma = 0;
        for (Korv t: korvid) {
            for (Toode toode: t.getTooted()) {
                // kogusumma = kogusumma + toode.getHind(); //see sama asi nagu alumine

                kogusumma += (toode.getHind() - ((toode.getAllahindlus()/100.0) * toode.getHind()));
            }
        }
        return kogusumma;
    }
}
