import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private LocalDateTime time;
    
    public Gigasecond(LocalDate moment) {
        this.time = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.time = moment;
    }

    public LocalDateTime getDateTime() {
        return this.time.plusSeconds(1000000000);
    }
}
