public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String vastus = kasTeguOnKolmnurgaga(10.7, 12.2, 15.8);
        String vastus2 = kasTeguOnKolmnurgaga(3.9, 7.2, 15.1);
        System.out.println(vastus);
        System.out.println(vastus2);
    }

    private static String kasTeguOnKolmnurgaga(double kulg1, double kulg2, double kulg3) {
        if (kulg1 + kulg2 > kulg3 && kulg2 + kulg3 > kulg1 && kulg3 + kulg1 > kulg2) {
            double umbermoot = kulg1 + kulg2 + kulg3;
            return ("Tegu on kolmnurgaga ja selle ümbermõõt on " + umbermoot);


        } else {
            return "Tegu ei ole kolmnurgaga";
        }
    }
}