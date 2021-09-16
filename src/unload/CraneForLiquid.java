package unload;

import generator.Ship;

public class CraneForLiquid implements Crane {
    @Override
    public long getTimeOfUnloading(Ship ship) {
        return 0;
    }
}
