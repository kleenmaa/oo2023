public class Silinder extends RuumilisedKujundid implements Arvutused{

    double raadius;
    double korgus;
    public Silinder(String kujundiNimetus, double raadius, double korgus) {
        super(kujundiNimetus);
        this.raadius = raadius;
        this.korgus = korgus;
    }

    @Override
    public double arvutaPindala() {
        return 2 * Math.PI * raadius * korgus + 2 * Math.PI * Math.pow(raadius, 2);
    }

    @Override
    public double arvutaRuumala() {
        return Math.PI * Math.pow(raadius, 2) * korgus;
    }
}
