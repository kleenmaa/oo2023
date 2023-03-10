public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String vastus = paarisPaarituMaaramine(20);
        String vastus1 = paarisPaarituMaaramine(11);
        System.out.println(vastus);
        System.out.println(vastus1);
    }

    private static String paarisPaarituMaaramine(int arv) {
        if (arv % 2 == 0) {
            return "Tegu on paaris arvuga";
        } else {
            return "Tegu on paaritu arvuga";
        }
    }
}