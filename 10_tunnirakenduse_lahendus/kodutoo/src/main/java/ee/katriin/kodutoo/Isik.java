package ee.katriin.kodutoo;

import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Isik {

    private int id;
    private String eesnimi;
    private String perenimi;
    private String email;
    private String aadress;
    private String telefon;

    }