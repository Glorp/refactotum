import java.util.Objects;

public final class ToUnderskrivere implements Verifisering {

    private final Verifisert underskriver1;
    private final Verifisert underskriver2;

    public ToUnderskrivere(Verifisert underskriver1, Verifisert underskriver2) {
        this.underskriver1 = underskriver1;
        this.underskriver2 = underskriver2;
    }


    @Override
    public String verifikasjonTekst() {
        return String.format(
                "Signert av: %s og %s",
                underskriver1.verifikasjonString(),
                underskriver2.verifikasjonString());        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToUnderskrivere that = (ToUnderskrivere) o;
        return underskriver1.equals(that.underskriver1) &&
                underskriver2.equals(that.underskriver2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(underskriver1, underskriver2);
    }
}

