import java.util.Objects;

public final class Godkjent implements Verifisering {

    private final Verifisert godkjenner;

    public Godkjent(Verifisert godkjenner) {
        this.godkjenner = godkjenner;
    }

    @Override
    public String verifikasjonTekst() {
        return String.format(
                "Godkjent av: %s",
                godkjenner.verifikasjonString());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Godkjent godkjent = (Godkjent) o;
        return godkjenner.equals(godkjent.godkjenner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(godkjenner);
    }
}
