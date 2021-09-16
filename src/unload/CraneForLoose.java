package unload;

import generator.Ship;

public class CraneForLoose implements Crane {
    private long oneTonUnloadingInSeconds = 600; // 1 тонна за 10 минут

    @Override
    public long getTimeOfUnloading(Ship ship) {
        return oneTonUnloadingInSeconds * ship.dimension;
    }


}
