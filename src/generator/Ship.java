package generator;

import java.util.*;

public class Ship {

    public enum Cargo {
        LOOSE, //зыбучий
        LIQUID, //жидкий
        SOLID // твердый
    }

    public Cargo transportedCargo;
    public int dimension;
    private String nameOfShip;

    public Ship(String ship, Cargo cargo, int weight) {
        transportedCargo = cargo;
        dimension = weight;
        nameOfShip = ship;
    }

    public Ship(Cargo cargo, int weight) {
        transportedCargo = cargo;
        dimension = weight;
        nameOfShip = getRandomNameOfShip();
    }

    public Ship() {
        this.transportedCargo = getRandomCargo();
        this.nameOfShip = getRandomNameOfShip();
        this.dimension = getRandomWeight();
    }

    public void setNameOfShip(String ship) {
        nameOfShip = ship;
    }

    public String getNameOfShip() {
        return nameOfShip;
    }

    private String getRandomNameOfShip() throws ArrayIndexOutOfBoundsException {
        if (Schedule.namesOfShips.isEmpty()) {
            System.out.println("Список с именами пуст, создавай ручками корабль");
            return "";
        }
        Random random = new Random(System.currentTimeMillis());
        int numberOurName = random.nextInt(Schedule.namesOfShips.size() - 1);
        String name = Schedule.namesOfShips.get(numberOurName);
        Schedule.namesOfShips.remove(numberOurName);
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
