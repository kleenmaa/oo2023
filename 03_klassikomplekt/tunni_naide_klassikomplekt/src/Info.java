public class Info {
    String nimetus;
    String ram;
    String opSysteem;

    public Info(String nimetus, String ram, String opSysteem) {
        this.nimetus = nimetus;
        this.ram = ram;
        this.opSysteem = opSysteem;
    }
    public String muudaRami(String uusRam) {
        this.ram = uusRam;
        return ram;
    }
    public String kysiOpSysteemi() {
        return opSysteem;
    }
}
