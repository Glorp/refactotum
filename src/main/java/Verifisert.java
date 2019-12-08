import java.util.Objects;

public final class Verifisert {

    private final String tekst;
    private final BrukerTimestamp brukerTimestamp;

    public Verifisert(String tekst, BrukerTimestamp brukerTimestamp) {
        this.tekst = tekst;
        this.brukerTimestamp = brukerTimestamp;
    }

    public String getTekst() {
        return tekst;
    }

    public BrukerTimestamp getBrukerTimestamp() {
        return brukerTimestamp;
    }

    public String verifikasjonString() {
        return String.format(
                "%s (%s), %s",
                tekst,
                brukerTimestamp.getBrukerId(),
                brukerTimestamp.getTimestamp());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Verifisert that = (Verifisert) o;
        return tekst.equals(that.tekst) &&
                brukerTimestamp.equals(that.brukerTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tekst, brukerTimestamp);
    }
}
