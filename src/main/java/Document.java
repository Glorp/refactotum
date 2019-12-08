public class Document {

    private String tittel;
    private byte[] innhold;
    private BrukerTimestamp opprettetAv;
    private Verifisering verifisering;

    public Document() {
        verifisering = new Verifisering();
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public Verifisert getUnderskriver1() {
        return verifisering.getUnderskriver1();
    }

    public void setUnderskriver1(Verifisert underskriver1) {
        this.verifisering.setUnderskriver1(underskriver1);
    }

    public Verifisert getUnderskriver2() {
        return verifisering.getUnderskriver2();
    }

    public void setUnderskriver2(Verifisert underskriver2) {
        this.verifisering.setUnderskriver2(underskriver2);
    }

    public Verifisert getGodkjenner() {
        return verifisering.getGodkjenner();
    }

    public void setGodkjenner(Verifisert godkjenner) {
        this.verifisering.setGodkjenner(godkjenner);
    }

    public byte[] getInnhold() {
        return innhold;
    }

    public void setInnhold(byte[] innhold) {
        this.innhold = innhold;
    }

    public BrukerTimestamp getOpprettetAv() {
        return opprettetAv;
    }

    public void setOpprettetAv(BrukerTimestamp opprettetAv) {
        this.opprettetAv = opprettetAv;
    }

    public void setVerifisert(boolean verifisert) {
        this.verifisering.setVerifisert(verifisert);
    }

    public boolean isVerifisert() {
        return verifisering.isVerifisert();
    }

    public String verifikasjonTekst() {
        return verifisering.verifikasjonTekst();
    }
}
