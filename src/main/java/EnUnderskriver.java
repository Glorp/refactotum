import java.util.Objects;

public final class EnUnderskriver implements Verifisering {

    private final Verifisert underskriver;

    public EnUnderskriver(Verifisert underskriver) {
        this.underskriver = underskriver;
    }


    @Override
    public String verifikasjonTekst() {
        return String.format(
                "Signert av: %s",
                underskriver.verifikasjonString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnUnderskriver that = (EnUnderskriver) o;
        return underskriver.equals(that.underskriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(underskriver);
    }
}
