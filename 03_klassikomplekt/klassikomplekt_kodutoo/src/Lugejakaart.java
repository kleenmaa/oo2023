import java.time.LocalDate;
import java.util.Date;

public class Lugejakaart {

    Isik isik;

    String kaardiNumber;

    boolean aktiivne;

    LocalDate loomiseAeg;

    LocalDate kehtivusAeg;

    LocalDate deaktiveerimiseAeg;

    public Lugejakaart(Isik isik, String kaardiNumber) {
        this.isik = isik;
        this.kaardiNumber = kaardiNumber;
        this.aktiivne = true;
        this.loomiseAeg = LocalDate.now();
        this.kehtivusAeg = loomiseAeg.plusYears(2);
        this.deaktiveerimiseAeg = null;
    }

    public void isikustaLugejakaart(Isik isik) {
        this.isik = isik;
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
