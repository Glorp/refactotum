public class Document {

    private String tittel;
    private byte[] innhold;
    private BrukerTimestamp opprettetAv;
    private Verifisering verifisering;

    public Verifisering getVerifisering() {
        return verifisering;
    }

    public void setVerifisering(Verifisering verifisering) {
        this.verifisering = verifisering;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
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

    public String verifikasjonTekst() {
        return verifisering.verifikasjonTekst();
    }
}
