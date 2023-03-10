import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Isik isik = new Isik("katriin@gmail.com", "Katriin Liselle",
                "Eenmaa", "Asunduse 4-25", "54567843");

        Isik isik2 = new Isik("kristo@gmail.com", "Kristo",
                "Viidas", "Oksa 6", "54567842");

        Lugejakaart lugejakaart = new Lugejakaart(isik, "1234567");

        Lugejakaart lugejakaart2 = new Lugejakaart(isik2, "1234569");

        Laenutus laenutus = new Laenutus(lugejakaart, Arrays.asList("Vemmad Lõvisüdamed", "Tõde ja Õigus"));

        Laenutus laenutus2 = new Laenutus(lugejakaart2, Arrays.asList("Rikkaks saamise Õpik", "Harry Potter"));

        laenutus2.muudaTagastatuks();

        String raamatuTagastus = laenutus2.kasOnTagastatud();
        System.out.println(raamatuTagastus);

        laenutus.pikendaTagastamiseAega();

        String tagastamiseAjaPikendus = laenutus.tagastamiseAegPikendatud();
        System.out.println(tagastamiseAjaPikendus);

        String kehtivusaegPikendatud = lugejakaart.pikendaKehtivusaega();
        System.out.println(kehtivusaegPikendatud);

        String lugejakaartDeaktiveeritud = lugejakaart2.deaktiveeriLugejakaart();
        System.out.println(lugejakaartDeaktiveeritud);

        isik.muudaEmaili("katriinliselle@gmail.com");
        System.out.println(isik.muudaEmaili("katriinliselle@gmail.com"));
        System.out.println(isik.kysiTelefoni());
    }
}