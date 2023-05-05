public class Kuup extends RuumilisedKujundid implements Arvutused{
    double kyljePikkus;

    public Kuup (String kujundiNimetus, double kyljePikkus) {
        super(kujundiNimetus);
        this.kyljePikkus = kyljePikkus;
    }

    @Override
    public double arvutaPindala() {
        return 6 * Math.pow(kyljePikkus, 2);
    }

    @Override
    public double arvutaRuumala() {
        return Math.pow(kyljePikkus, 3);
    }
}
