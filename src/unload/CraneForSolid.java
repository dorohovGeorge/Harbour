package unload;

import generator.Sheep;

import java.time.LocalDateTime;

public class CraneForSolid implements Crane {
    @Override
    public long getTimeOfUnloading(Sheep sheep) {
        return 0;
    }
}
