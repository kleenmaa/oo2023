import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("keskmisedkiirused.txt"));
        String rida = br.readLine();
        //System.out.println(rida);
        while (rida != null){
            String[] tykeldus = rida.split(",");
            double[] numbrid = new double[tykeldus.length];
            for (int i = 0; i < tykeldus.length; i++) {
                numbrid[i]= Double.parseDouble(tykeldus[i]);
            }

            String vastus2 = loikudeKeskmineKiirus(numbrid);
            System.out.println(vastus2);
            PrintWriter pw = new PrintWriter(new FileWriter("vastused5.txt"));
            pw.println("");
            pw.print(vastus2);
            pw.close();
            rida = br.readLine();
        }

    }

    private static String loikudeKeskmineKiirus(double[] numbrid) {
        double koikideKeskmineKiirus = 0;
        for (int i = 0; i < numbrid.length; i++) {
            koikideKeskmineKiirus = koikideKeskmineKiirus + numbrid[i] / numbrid.length;
        }
        return ("Kogu selle tee läbimise keskmine kiirus on " + koikideKeskmineKiirus + " km/h");
    }

}