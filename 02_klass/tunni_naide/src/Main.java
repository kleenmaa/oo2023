import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    Kasutaja katriin = new Kasutaja("katriin", "parool123", "kleenmaa@tlu.ee", "katriin", "eenmaa");

    Kasutaja katriin1 = new Kasutaja("katriin", "parool123", "kleenmaa@tlu.ee", "katriin", "eenmaa");

    Kasutaja katriin2 = new Kasutaja("katriin", "parool123", "kleenmaa@tlu.ee", "katriin", "eenmaa");

    String sonum = katriin.kustutaKasutaja();
    System.out.println(sonum);

    katriin1.muudaParool("uusparool123");

    Tellimus tellimus1 = new Tellimus("Katriin", Arrays.asList("Coca", "Fanta"));

    Tellimus tellimus2 = new Tellimus("Katriin", Arrays.asList("Coca", "Fanta"));

    Tellimus tellimus3 = new Tellimus("Katriin", Arrays.asList("Coca", "Fanta"));

    tellimus1.muudaMakstuks();

    String vastus = tellimus1.kasOnMakstud();
        System.out.println(vastus);

    }
}