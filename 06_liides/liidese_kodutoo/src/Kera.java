public class Kera extends RuumilisedKujundid implements Arvutused{
    double raadius;

    public Kera (String kujundiNimetus, double raadius) {
        super(kujundiNimetus);
        this.raadius = raadius;
    }

    @Override
    public double arvutaPindala() {
        return 4 * Math.PI * Math.pow(raadius, 2);
    }

    @Override
    public double arvutaRuumala() {
        return (4/3.0) * Math.PI * Math.pow(raadius, 3);
    }
}
