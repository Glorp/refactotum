public final class IngenVerifisering implements Verifisering {

    @Override
    public String verifikasjonTekst() {
        return "";
    }

    @Override
    public int hashCode() {
        return IngenVerifisering.class.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;

    }
}
