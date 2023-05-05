package ee.katriin.veebipood;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity // see andmebaasitabeliks kuulutamine

public class Toode {  // andmebaasi nimi on klassi nimi
    @Id // see on primaarvõti
    private int id;
    // private Long Id;
    // standard on panna andmebaasi ID Long
    private String nimi;
    private double hind;

}
