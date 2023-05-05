public class IsikukoodSW extends Isikukood implements Andmed {

    public IsikukoodSW(String nimi, String isikukood) {
        super(nimi, isikukood);
    }

    @Override
    public String getSugu() {
        return null;
    }

    @Override
    public String getKuupaev() {
        return null;
    }

    @Override
    public int getVanus() {
        return 0;
    }
}

// eelviimane arv näitab kas on mees või naine, paaritud mehed ja paaris naised
// 890201-3286
// 811228-9874
// 670919-9530
