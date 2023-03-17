import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String vastus = keskmiseKiiruseLeidmine(30,70.5);
        System.out.println(vastus);
    }

    double[] sisend = {3,4,5,6};
    System.out.println(Arrays.toString(loikudeKeskmineKiirus(sisend)));

    private static String keskmiseKiiruseLeidmine(double kiirus1, double kiirus2) {
        double keskmineKiirus = (kiirus1 + kiirus2) / 2;
        return ("Nende kahe keskmine kiirus on " + keskmineKiirus + " km/h");
    }

    private static double[] loikudeKeskmineKiirus(double[] kiirused) {
        double koikideKeskmineKiirus = 0;
        for (int i = 0; i < kiirused.length; i++) {
            koikideKeskmineKiirus = koikideKeskmineKiirus + kiirused[i] / kiirused.length;
        }
        return koikideKeskmineKiirus;
    }
}