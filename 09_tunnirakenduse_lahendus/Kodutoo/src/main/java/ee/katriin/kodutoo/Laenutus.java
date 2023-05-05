package ee.katriin.kodutoo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Laenutus {

    private int id;

    private LocalDate laenutamiseAeg;

    private LocalDate tagastamiseAeg;

    private String lugejaKaardiNumber;

    private List<String> raamatud;

    private boolean tagastatud;

    private boolean pikendatud;

    public Laenutus(int id, String lugejaKaardiNumber, List<String> raamatud) {
        this.id = id;
        this.laenutamiseAeg = LocalDate.now();
        this.tagastamiseAeg = laenutamiseAeg.plusDays(30);
        this.lugejaKaardiNumber = lugejaKaardiNumber;
        this.raamatud = raamatud;
        this.tagastatud = false;
        this.pikendatud = false;
    }

}
