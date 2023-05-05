import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTest {
    @Test
    public void kontrolli_kera_pindala() {
        Kera kera1 = new Kera("Kera", 10.5);
        assertEquals(1385.44, kera1.arvutaPindala(), 0.1);
    }

    @Test
    public void kontrolli_kera_ruumala() {
        Kera kera2 = new Kera("Kera", 11);
        assertEquals(5575.28, kera2.arvutaRuumala(), 0.1);
    }

    @Test
    public void kontrolli_kuubi_pindala() {
        Kuup kuup1 = new Kuup("Kuup", 7);
        assertEquals(294, kuup1.arvutaPindala(), 0.1);
    }

    @Test
    public void kontrolli_kuubi_ruumala() {
        Kuup kuup2 = new Kuup("Kuup", 10 );
        assertEquals(1000, kuup2.arvutaRuumala(), 0.1);
    }

    @Test
    public void kontrolli_silindri_pindala() {
        Silinder silinder1 = new Silinder("Silinder", 5.4, 9);
        assertEquals(488.58, silinder1.arvutaPindala(), 0.1);
    }

    @Test
    public void kontrolli_silindri_ruumala(){
        Silinder silinder2 = new Silinder("Silinder", 3, 6.7);
        assertEquals(189.44, silinder2.arvutaRuumala(), 0.1);
    }
}

