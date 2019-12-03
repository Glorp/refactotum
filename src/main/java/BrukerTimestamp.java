import java.time.LocalDateTime;
import java.util.Objects;

final public class BrukerTimestamp {

    private final String brukerId;
    private final LocalDateTime timestamp;

    public BrukerTimestamp(String brukerId, LocalDateTime timestamp) {
        this.brukerId = brukerId;
        this.timestamp = timestamp;
    }

    public String getBrukerId() {
        return brukerId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrukerTimestamp that = (BrukerTimestamp) o;
        return brukerId.equals(that.brukerId) &&
                timestamp.equals(that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brukerId, timestamp);
    }
}
