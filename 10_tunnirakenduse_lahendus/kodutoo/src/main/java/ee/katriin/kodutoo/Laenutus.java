package ee.katriin.kodutoo;

import java.util.Date;
import java.util.List;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Laenutus {
    private int id;
    private LocalDate laenutamiseAeg;

    private LocalDate tagastamiseAeg;

    private Lugejakaart lugejakaart;

    private List<String> raamatud;

    private boolean tagastatud;

    private boolean pikendatud;

}
