public class Verifisering {

    private boolean verifisert;
    private Verifisert underskriver1;
    private Verifisert underskriver2;
    private Verifisert godkjenner;

    public Verifisert getUnderskriver1() {
        return underskriver1;
    }

    public void setUnderskriver1(Verifisert underskriver1) {
        this.underskriver1 = underskriver1;
    }

    public Verifisert getUnderskriver2() {
        return underskriver2;
    }

    public void setUnderskriver2(Verifisert underskriver2) {
        this.underskriver2 = underskriver2;
    }

    public Verifisert getGodkjenner() {
        return godkjenner;
    }

    public void setGodkjenner(Verifisert godkjenner) {
        this.godkjenner = godkjenner;
    }

    public void setVerifisert(boolean verifisert) {
        this.verifisert = verifisert;
    }

    public boolean isVerifisert() {
        return verifisert;
    }

    public String verifikasjonTekst() {
        if (!verifisert) {
            return "";
        }
        if (getGodkjenner() != null) {
            return String.format(
                    "Godkjent av: %s",
                    godkjenner.verifikasjonString());
        }
        if (getUnderskriver2() != null) {
            return String.format(
                    "Signert av: %s og %s",
                    underskriver1.verifikasjonString(),
                    underskriver2.verifikasjonString());        }

        return String.format(
                "Signert av: %s",
                underskriver1.verifikasjonString());
    }
}
