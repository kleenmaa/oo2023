public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double pindala = arvutaRuuduPindala(5);
        double pindala2 = arvutaRuuduPindala(11.8);
        System.out.println(pindala);
        System.out.println(pindala2);
    }

    private static double arvutaRuuduPindala(double kulg) {
        return kulg * kulg;
    }

}