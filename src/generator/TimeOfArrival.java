package generator;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;
import java.util.concurrent.ThreadLocalRandom;

public class TimeOfArrival {
    final static int NUMBER_OF_MONTHS_FOR_PLANE = 1;
    public LocalDateTime randomDateTime;

    TimeOfArrival() {
        this.randomDateTime = getRandomTime();
    }

    private LocalDateTime getRandomTime() {
        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime finalDate = currentDate.plusMonths(NUMBER_OF_MONTHS_FOR_PLANE);
        ZoneId zoneId = ZoneId.systemDefault();

        long minDayWithHours = LocalDateTime.of(currentDate.toLocalDate(), currentDate.toLocalTime())
                .atZone(zoneId)
                .toEpochSecond();
        long maxDayWithHours = LocalDateTime.of(finalDate.toLocalDate(), finalDate.toLocalTime())
                .atZone(zoneId)
                .toEpochSecond();

        long randomDay = ThreadLocalRandom.current().nextLong(minDayWithHours, maxDayWithHours);
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(randomDay),
                TimeZone.getDefault().toZoneId());
    }

}
