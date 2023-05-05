package ee.katriin.kodutoo;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Lugejakaart {
    private int id;
    private Isik laenutaja;

    private String kaardiNumber;

    private boolean aktiivne;

    private LocalDate loomiseAeg;

    private LocalDate kehtivusAeg;

    private LocalDate deaktiveerimiseAeg;


}
