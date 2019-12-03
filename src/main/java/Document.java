public class Document {

    private String tittel;
    private byte[] innhold;
    private BrukerTimestamp opprettetAv;
    private boolean verifisert;
    private String underskriver1Tekst;
    private BrukerTimestamp underskriver1;
    private String underskriver2Tekst;
    private BrukerTimestamp underskriver2;
    private String godkjennerTekst;
    private BrukerTimestamp godkjenner;

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

    public void setVerifisert(boolean verifisert) {
        this.verifisert = verifisert;
    }

    public String getUnderskriver1Tekst() {
        return underskriver1Tekst;
    }

    public void setUnderskriver1Tekst(String underskriver1Tekst) {
        this.underskriver1Tekst = underskriver1Tekst;
    }

    public BrukerTimestamp getUnderskriver1() {
        return underskriver1;
    }

    public void setUnderskriver1(BrukerTimestamp underskriver1) {
        this.underskriver1 = underskriver1;
    }

    public String getUnderskriver2Tekst() {
        return underskriver2Tekst;
    }

    public void setUnderskriver2Tekst(String underskriver2Tekst) {
        this.underskriver2Tekst = underskriver2Tekst;
    }

    public BrukerTimestamp getUnderskriver2() {
        return underskriver2;
    }

    public void setUnderskriver2(BrukerTimestamp underskriver2) {
        this.underskriver2 = underskriver2;
    }

    public String getGodkjennerTekst() {
        return godkjennerTekst;
    }

    public void setGodkjennerTekst(String godkjennerTekst) {
        this.godkjennerTekst = godkjennerTekst;
    }

    public BrukerTimestamp getGodkjenner() {
        return godkjenner;
    }

    public void setGodkjenner(BrukerTimestamp godkjenner) {
        this.godkjenner = godkjenner;
    }

    public boolean isVerifisert() {
        return verifisert;
    }

    private static String verifikasjonBrukerString(String tekst, BrukerTimestamp brukerTimestamp) {
        return String.format(
                "%s (%s), %s",
                tekst,
                brukerTimestamp.getBrukerId(),
                brukerTimestamp.getTimestamp());
    }

    public String verifikasjonTekst() {
        if (!verifisert) {
            return "";
        }
        if (godkjenner != null) {
            return String.format(
                    "Godkjent av: %s",
                    verifikasjonBrukerString(godkjennerTekst, godkjenner));
        }
        if (underskriver2 != null) {
            return String.format(
                    "Signert av: %s og %s",
                    verifikasjonBrukerString(underskriver1Tekst, underskriver1),
                    verifikasjonBrukerString(underskriver2Tekst, underskriver2));        }

        return String.format(
                "Signert av: %s",
                verifikasjonBrukerString(underskriver1Tekst, underskriver1));
    }
}
