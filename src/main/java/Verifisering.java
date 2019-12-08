public class Verifisering {

    private boolean verifisert;
    private Verifisert underskriver1;
    private Verifisert underskriver2;
    private Verifisert godkjenner;

    public Verifisering(boolean verifisert, Verifisert underskriver1, Verifisert underskriver2, Verifisert godkjenner) {
        this.verifisert = verifisert;
        this.underskriver1 = underskriver1;
        this.underskriver2 = underskriver2;
        this.godkjenner = godkjenner;
    }

    public static Verifisering ingenVerifisering() {
        return new Verifisering(false, null, null, null);
    }

    public static Verifisering godkjent(Verifisert godkjenner) {
        return new Verifisering(true, null, null, godkjenner);
    }

    public static Verifisering enUnderskriver(Verifisert underskriver) {
        return new Verifisering(true, underskriver, null, null);
    }

    public static Verifisering toUnderskriver(Verifisert underskriver1, Verifisert underskriver2) {
        return new Verifisering(true, underskriver1, underskriver2, null);
    }

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
