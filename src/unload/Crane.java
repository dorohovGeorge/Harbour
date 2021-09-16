package unload;

import generator.Ship;

public interface Crane {
    public final int countOfCrane = 1;

    public long getTimeOfUnloading(Ship ship);
}
