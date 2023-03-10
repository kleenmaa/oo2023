import java.util.Date;
import java.util.List; //need peab mõlemad importima
public class Tellimus {
    Date tegemiseAeg;

    String tellija;

    List<String> tooted;

    boolean makstud;

    public Tellimus(String tellija, List<String> tooted) {
        this.tegemiseAeg = new Date();
        this.tellija = tellija;
        this.tooted = tooted;
        this.makstud = false;
    }

    public void muudaMakstuks() {

        this.makstud = true;
    }

    public String kasOnMakstud() {
        if (makstud == true) {
            return "Makstud!";
        } else {
            return "Maksmata!";
        }
    }
}
