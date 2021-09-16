import generator.Schedule;
import generator.Ship;
import unload.CraneForLoose;

public class Main {

    public static void main(String[] args) {
        int ships = 10;
        Schedule schedule = new Schedule(ships);
        for (int i = 0; i < ships; i++) {
            System.out.println(schedule.getElem(i).getShip().getNameOfShip());
            if (schedule.getElem(i).getShip().transportedCargo == Ship.Cargo.LOOSE) {
                CraneForLoose craneForLoose = new CraneForLoose();
                System.out.println(craneForLoose.getTimeOfUnloading(schedule.getElem(i).getShip()));
            }
        }

    }
}
