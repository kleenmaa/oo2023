import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


    }

    public static double[] test1() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("keskmisedkiirused.txt"));
        String rida = br.readLine();
        //System.out.println(rida);
        double[] numbrid = new double[0];
        while (rida != null) {
            String[] tykeldus = rida.split(",");
            numbrid = new double[tykeldus.length];
            for (int i = 0; i < tykeldus.length; i++) {
                numbrid[i] = Double.parseDouble(tykeldus[i]);
            }
        }
        return numbrid;

    }

        public static String loikudeKeskmineKiirus ( double[] numbrid){
            double koikideKeskmineKiirus = 0;
            for (int i = 0; i < numbrid.length; i++) {
                koikideKeskmineKiirus = koikideKeskmineKiirus + numbrid[i] / numbrid.length;
            }
            return ("Kogu selle tee läbimise keskmine kiirus on " + koikideKeskmineKiirus + " km/h");
        }


        
}