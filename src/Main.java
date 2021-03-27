import generator.Schedule;
import generator.Sheep;
import unload.CraneForLiquid;
import unload.CraneForLoose;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int sheeps = 10;
        Schedule schedule = new Schedule(sheeps);
        for (int i = 0; i < sheeps; i++) {
            System.out.println(schedule.getElementOfSchedule(i).getSheep().getNameOfSheep());
            if (schedule.getElementOfSchedule(i).getSheep().transportedCargo == Sheep.Cargo.LOOSE) {
                CraneForLoose craneForLoose = new CraneForLoose();
                System.out.println(craneForLoose.getTimeOfUnloading(schedule.getElementOfSchedule(i).getSheep()));
            }
        }

    }
}
