import java.util.Date;
import java.util.List;
import java.time.LocalDate;

public class Laenutus {
    LocalDate laenutamiseAeg;

    LocalDate tagastamiseAeg;

    String laenutaja;

    List<String> raamatud;

    boolean tagastatud;

    boolean pikendatud;

    public Laenutus(String laenutaja, List<String> raamatud) {
        this.laenutamiseAeg = LocalDate.now();
        this.tagastamiseAeg = laenutamiseAeg.plusDays(30);
        this.laenutaja = laenutaja;
        this.raamatud = raamatud;
        this.tagastatud = false;
        this.pikendatud = false;
    }

    public void muudaTagastatuks() {

        this.tagastatud = true;
    }

    public void pikendaTagastamiseAega() {

        this.tagastamiseAeg = tagastamiseAeg.plusDays(14);
        this.pikendatud = true;
    }

    public String tagastamiseAegPikendatud() {
        if (pikendatud == true) {
            String uusAeg = String.valueOf(tagastamiseAeg);
            return "Pikendatud! Uus tagastamise kuupäev on " + uusAeg;
        } else {
            return "Pikendamata";
        }
    }

    public String kasOnTagastatud() {
        if (tagastatud == true) {
            return "Tagastatud!";
        } else {
            return "Tagastamata!";
        }

    }
}
