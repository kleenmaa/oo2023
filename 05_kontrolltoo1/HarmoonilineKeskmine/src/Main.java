import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String vastus = keskmiseKiiruseLeidmine(30, 70.5);
        System.out.println(vastus);


        double[] sisend = {76, 55, 80, 10, 34};
        String vastus2 = loikudeKeskmineKiirus(sisend);
        System.out.println(vastus2);

    }

    private static String keskmiseKiiruseLeidmine(double kiirus1, double kiirus2) {
        double keskmineKiirus = (kiirus1 + kiirus2) / 2;
        return ("Nende kahe keskmine kiirus on " + keskmineKiirus + " km/h");
    }

    private static String loikudeKeskmineKiirus(double[] kiirused) {
        double koikideKeskmineKiirus = 0;
        for (int i = 0; i < kiirused.length; i++) {
            koikideKeskmineKiirus = koikideKeskmineKiirus + kiirused[i] / kiirused.length;
        }
        return ("Kogu selle tee läbimise keskmine kiirus on " + koikideKeskmineKiirus + " km/h");
    }

}

