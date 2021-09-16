package unload;

import generator.Ship;

public class CraneForSolid implements Crane {
    @Override
    public long getTimeOfUnloading(Ship ship) {
        return 0;
    }
}
