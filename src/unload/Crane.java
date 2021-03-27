package unload;

import generator.Sheep;

import java.time.LocalDateTime;

public interface Crane {
    public final int countOfCrane = 1;

    public long getTimeOfUnloading(Sheep sheep);
}
