import static org.assertj.core.api.Assertions.*;

import net.jqwik.api.*;

import java.time.LocalDateTime;

public class DocumentTest {

    @Example
    public void testIngenVerifikasjon() {
        Document doc = new Document();
        assertThat(doc.verifikasjonTekst()).isEqualTo("");
    }

    @Example
    public void testGodkjent() {
        Document doc = new Document();
        doc.setGodkjenner(new Verifisert("Benny Nilsen", new BrukerTimestamp("BN", LocalDateTime.of(2019, 11, 20, 14, 12))));
        doc.setVerifisert(true);
        assertThat(doc.verifikasjonTekst()).isEqualTo("Godkjent av: Benny Nilsen (BN), 2019-11-20T14:12");
    }

    @Example
    public void testEnUnderskriver() {
        Document doc = new Document();
        doc.setUnderskriver1(new Verifisert("Benny Nilsen", new BrukerTimestamp("BN", LocalDateTime.of(2019, 11, 20, 14, 12))));
        doc.setVerifisert(true);
        assertThat(doc.verifikasjonTekst()).isEqualTo("Signert av: Benny Nilsen (BN), 2019-11-20T14:12");
    }

    @Example
    public void testToUnderskrivere() {
        Document doc = new Document();
        doc.setUnderskriver1(new Verifisert("Benny Nilsen", new BrukerTimestamp("BN", LocalDateTime.of(2019, 11, 20, 14, 12))));
        doc.setUnderskriver2(new Verifisert("Roar Hansen", new BrukerTimestamp("RH", LocalDateTime.of(2019, 11, 20, 14, 15))));
        doc.setVerifisert(true);
        assertThat(doc.verifikasjonTekst()).isEqualTo("Signert av: Benny Nilsen (BN), 2019-11-20T14:12 og Roar Hansen (RH), 2019-11-20T14:15");
    }

}
