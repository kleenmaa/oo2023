package ee.katriin.kontrolltoo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Toode {
    private int id;
    private String nimetus;
    private double hind;
    private int allahindlus;
    private double allahinnatud_hind;

    private int kogus_laos;

    public Toode(int id, String nimetus, double hind, int allahindlus, int kogus_laos) {
        this.id = id;
        this.nimetus = nimetus;
        this.hind = hind;
        this.allahindlus = allahindlus;
        this.allahinnatud_hind = this.hind - (this.allahindlus / 100 * this.hind);
        this.kogus_laos = kogus_laos;
    }

}
