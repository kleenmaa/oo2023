import java.time.LocalDate;
import java.util.Date;

public class Lugejakaart {

    String eesnimi;

    String perenimi;
    String email;
    String aadress;
    String telefon;
    String kaardiNumber;

    boolean aktiivne;

    LocalDate loomiseAeg;

    LocalDate kehtivusAeg;

    LocalDate deaktiveerimiseAeg;

    public Lugejakaart(String email, String eesnimi, String perenimi, String aadress, String telefon, String kaardiNumber) {
        this.email = email;
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.aadress = aadress;
        this.telefon = telefon;
        this.kaardiNumber = kaardiNumber;
        this.aktiivne = true;
        this.loomiseAeg = LocalDate.now();
        this.kehtivusAeg = loomiseAeg.plusYears(2);
        this.deaktiveerimiseAeg = null;
    }


    public String pikendaKehtivusaega() {
        this.kehtivusAeg = kehtivusAeg.plusYears(1);
        String uusKehtivusAeg = String.valueOf(kehtivusAeg);
        return "Lugejakaardi kehtivusaega on pikendatud! Uus kehtivuskuupäev on " + uusKehtivusAeg;
    }

    public String deaktiveeriLugejakaart() {
        this.aktiivne = false;
        this.deaktiveerimiseAeg = LocalDate.now();
        return "Lugejakaart on deaktiveeritud!";
    }

}
