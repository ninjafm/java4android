package Lesson11;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();
    double sum = 0.0;

    public double getWeight() {
        for (T o : box) {
            sum += o.getWeight();
        }
        return sum;
    }

    public boolean compare(Box anotherBox) {
        if (getWeight() == anotherBox.getWeight()) return true;
        return false;
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }

    }

    public void changeBox(Box<T> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }
}
