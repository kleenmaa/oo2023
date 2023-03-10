public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        prindiForTsükkel(5);
        prindiForTsükkel(10);
    }

    private static void prindiForTsükkel(int kordadeArv) {
        for (int i = 1; i < kordadeArv; i++) {
            System.out.println(i);
        }
    }
}