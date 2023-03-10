import java.util.Arrays;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        Laenutus laenutus1 = new Laenutus("Katriin Liselle Eenmaa", Arrays.asList("Tõde ja Õigus", "Vennad Lõvisüdamed"));
        Laenutus laenutus2 = new Laenutus("Kristo Viidas", Arrays.asList("Näljamängud", "Harry Potter"));
        Laenutus laenutus3 = new Laenutus("Kerli Viidas", Arrays.asList("Bullerby lapsed", "Rikkaks saamise Õpik"));

        laenutus1.muudaTagastatuks();

        String raamatuTagastus = laenutus1.kasOnTagastatud();
        System.out.println(raamatuTagastus);

        laenutus2.pikendaTagastamiseAega();

        String tagastamiseAjaPikendus = laenutus2.tagastamiseAegPikendatud();
        System.out.println(tagastamiseAjaPikendus);

        Lugejakaart lugejakaart1 = new Lugejakaart("katriin@gmail.com", "Katriin Liselle", "Eenmaa",
                "Asunduse 4-25, Tallinn", "54535567", "1234567");

        Lugejakaart lugejakaart2 = new Lugejakaart("kristo@gmail.com", "Kristo", "Viidas",
                "Oksa 6, Keila", "54535337", "1234568");

        Lugejakaart lugejakaart3 = new Lugejakaart("kerli@gmail.com", "Kerli", "Viidas",
                "Oksa 6, Keila", "54515337", "1234569");

        String kehtivusaegPikendatud = lugejakaart1.pikendaKehtivusaega();
        System.out.println(kehtivusaegPikendatud);

        String lugejakaartDeaktiveeritud = lugejakaart2.deaktiveeriLugejakaart();
        System.out.println(lugejakaartDeaktiveeritud);
    }
}