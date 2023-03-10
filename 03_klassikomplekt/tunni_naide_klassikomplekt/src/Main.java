public class Main {
    public static void main(String[] args) {
        //1 variant ja parem variant
        Info info = new Info("Mac", "16gb", "Mac");
        Arvuti arvuti1 = new Arvuti(info, 1000);
        arvuti1.suurendaMaksumus(100);

        info.muudaRami("18 gb");
        System.out.println(info.muudaRami("18 gb"));
        System.out.println(info.kysiOpSysteemi());

        //2 variant
        Arvuti arvuti2 = new Arvuti(new Info("Windows", "8gb", "Windows"), 1000);
        arvuti2.paneDollaritesse();
    }
}