package generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.*;


public class Schedule {
    public static class ElementOfSchedule {
        private Ship ship;
        private TimeOfArrival time;

        ElementOfSchedule() {
            this.ship = new Ship();
            this.time = new TimeOfArrival();
        }

        public Ship getShip() {
            return ship;
        }

        public LocalDateTime getTime() {
            return time.randomDateTime;
        }
    }

    public static List<String> namesOfShips = new ArrayList<>();
    public List<ElementOfSchedule> elementsOfSchedule = new ArrayList<>();
    private int countOfShips;

    public Schedule(int countOfShips) {
        this.countOfShips = countOfShips;
        fillListOfNamesShips();
        for (int i = 0; i < countOfShips; i++) {
            elementsOfSchedule.add(new ElementOfSchedule());
        }
    }

    public ElementOfSchedule getElem(int number) {
        return elementsOfSchedule.get(number);
    }

    private void fillListOfNamesShips() {
        try {
            File fileWithNames = new File("resources/NamesOfShips.txt");
            Scanner reader = new Scanner(fileWithNames);
            while (reader.hasNextLine()) {
                namesOfShips.add(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
