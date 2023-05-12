package ee.katriin.kontrolltoo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ToodeController {
    List<Toode> poeTooted = new ArrayList<>(Arrays.asList(
            new Toode(1, "Vesi", 0.80, 10, 37 ),
            new Toode(2, "Piim", 1, 0, 10),
            new Toode(3, "Keefir", 2, 0, 22)
    ));

    List<Toode> poeTooted2 = new ArrayList<>(Arrays.asList(
            new Toode(1, "Shokolaad", 2.3, 10, 22 ),
            new Toode(2, "Mullivesi", 1.3, 0, 10),
            new Toode(3, "Pasteet", 3, 25, 25)
    ));
}
