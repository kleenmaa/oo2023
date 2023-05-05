public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        IsikukoodEE ee1 = new IsikukoodEE("Peeter", "50001029996");
        System.out.println(ee1.getVanus());
        System.out.println(ee1.getKuupaev());
        System.out.println(ee1.getSugu());

        IsikukoodEE ee2 = new IsikukoodEE("Katriin", "60107240236");
        System.out.println(ee2.getVanus());
        System.out.println(ee2.getKuupaev());
        System.out.println(ee2.getSugu());

        IsikukoodEE ee3 = new IsikukoodEE("Kristo", "50003041524");
        System.out.println(ee3.getVanus());
        System.out.println(ee3.getKuupaev());
        System.out.println(ee3.getSugu());

        IsikukoodEE ee4 = new IsikukoodEE("Kerli", "60003041514");
        System.out.println(ee4.getVanus());
        System.out.println(ee4.getKuupaev());
        System.out.println(ee4.getSugu());

        IsikukoodEE ee5 = new IsikukoodEE("Mart", "30303039914");
        System.out.println(ee5.getVanus());
        System.out.println(ee5.getKuupaev());
        System.out.println(ee5.getSugu());

        IsikukoodFI fi1 = new IsikukoodFI("Peeter", "111111-111C");
        System.out.println(fi1.getSugu());
        System.out.println(fi1.getKuupaev());

        IsikukoodFI fi2 = new IsikukoodFI("Maire", "010101-0101");
        System.out.println(fi2.getSugu());
        System.out.println(fi2.getKuupaev());

    }
}