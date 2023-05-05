import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4() {
        IsikukoodEE ee = new IsikukoodEE("Katriin", "60107240236");
        assertEquals("N", ee.getSugu());
    }

    @Test
    public void kontrolli_kas_on_vigane_kui_isikukoodi_alguses_on_7() {
        IsikukoodEE ee = new IsikukoodEE("Kristo", "70003041524");
        assertEquals("Vigane isikukood!", ee.getSugu());
    }

    @Test
    public void kontrolli_kas_kuupaev_on_24_07_2001_kui_isikukood_on_60107240236() {
        IsikukoodEE ee = new IsikukoodEE("Katriin", "60107240236");
        assertEquals("24.07.2001", ee.getKuupaev());
    }

    @Test
    public void kontrolli_kas_kuupaev_on_04_03_2000_kui_isikukood_on_50003041524() {
        IsikukoodEE ee = new IsikukoodEE("Kristo", "50003041524");
        assertEquals("04.03.2000", ee.getKuupaev());
    }
}
