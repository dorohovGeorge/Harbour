package unload;

import generator.Sheep;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

public class CraneForLoose implements Crane {
    private long oneTonUnloadingInSeconds = 600; // 1 тонна за 10 минут

    @Override
    public long getTimeOfUnloading(Sheep sheep) {
        return oneTonUnloadingInSeconds * sheep.dimension;
    }


}
