import java.time.LocalDate;
import java.util.Date;

public class Isik {

    String eesnimi;
    String perenimi;
    String email;
    String aadress;
    String telefon;

    public Isik(String email, String eesnimi, String perenimi, String aadress, String telefon) {
        this.email = email;
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.aadress = aadress;
        this.telefon = telefon;
    }


    public String muudaEmaili(String uusEmail) {
        this.email= uusEmail;
        return uusEmail;
    }

    public String kysiTelefoni() {
        return telefon;
    }

}
