package generator;

import java.util.*;

public class Sheep {

    public enum Cargo {
        LOOSE, //зыбучий
        LIQUID, //жидкий
        SOLID // твердый
    }

    public Cargo transportedCargo;
    public int dimension;
    private String nameOfSheep;

    public Sheep(String sheep, Cargo cargo, int weight) {
        transportedCargo = cargo;
        dimension = weight;
        nameOfSheep = sheep;
    }

    public Sheep(Cargo cargo, int weight) {
        transportedCargo = cargo;
        dimension = weight;
        nameOfSheep = getRandomNameOfSheep();
    }

    public Sheep() {
        this.transportedCargo = getRandomCargo();
        this.nameOfSheep = getRandomNameOfSheep();
        this.dimension = getRandomWeight();
    }

    public void setNameOfSheep(String sheep) {
        nameOfSheep = sheep;
    }

    public String getNameOfSheep() {
        return nameOfSheep;
    }

    private String getRandomNameOfSheep() throws ArrayIndexOutOfBoundsException {
        if (Schedule.namesOfSheeps.isEmpty()) {
            System.out.println("Список с именами пуст, создавай ручками корабль");
            return "";
        }
        Random random = new Random(System.currentTimeMillis());
        int numberOurName = random.nextInt(Schedule.namesOfSheeps.size() - 1);
        String name = Schedule.namesOfSheeps.get(numberOurName);
        Schedule.namesOfSheeps.remove(numberOurName);
        return name;
    }

    private Cargo getRandomCargo() {
        Random random = new Random(System.currentTimeMillis());
        int numberRandomCargo = (int) (Math.random() * (Cargo.values().length));
        return Cargo.values()[numberRandomCargo];
    }

    private int getRandomWeight() {
        Random random = new Random(System.currentTimeMillis());
        return (int) (Math.random() * (80 + 1)) + 20;
    }


}
