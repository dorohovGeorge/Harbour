package generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.*;


public class Schedule {
    public static class ElementOfSchedule {
        private Sheep sheep;
        private TimeOfArrival time;

        ElementOfSchedule() {
            this.sheep = new Sheep();
            this.time = new TimeOfArrival();
        }

        public Sheep getSheep() {
            return sheep;
        }

        public LocalDateTime getTime() {
            return time.randomDateTime;
        }
    }

    public static List<String> namesOfSheeps = new ArrayList<>();
    public List<ElementOfSchedule> elementsOfSchedule = new ArrayList<>();
    private int countOfSheeps;

    public Schedule(int countOfSheeps) {
        this.countOfSheeps = countOfSheeps;
        fillListOfNamesSheeps();
        for (int i = 0; i < countOfSheeps; i++) {
            elementsOfSchedule.add(new ElementOfSchedule());
        }
    }

    public ElementOfSchedule getElementOfSchedule(int number) {
        return elementsOfSchedule.get(number);
    }

    private void fillListOfNamesSheeps() {
        try {
            File fileWithNames = new File("resources/NamesOfSheeps.txt");
            Scanner reader = new Scanner(fileWithNames);
            while (reader.hasNextLine()) {
                namesOfSheeps.add(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
