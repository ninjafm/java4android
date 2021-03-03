package Lesson7;

import java.util.Random;

public class Cat {
    private String name;
    private Boolean fullness;
    private Random random = new Random();

    public Cat(String name, Boolean fullness) {
        this.name = name;
        this.fullness = fullness;

    }

    public void eat(Plate plate) {
        fullness = plate.decreaseFood(random.nextInt(10) + 10);

    }

    public void printInfo() {
        System.out.println("Котик " + name + " покушал: " + fullness );
    }
}
