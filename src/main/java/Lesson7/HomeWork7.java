package Lesson7;

public class HomeWork7 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Пушок", false);
        Cat cat2 = new Cat("Марти", false);
        Cat cat3 = new Cat("Фед", false);
        Plate plate = new Plate(10);

        plate.printInfo();
        cat1.eat(plate);
        plate.addFood(150);
        cat2.eat(plate);
        cat3.eat(plate);

        plate.printInfo();

        Cat[] cats = {cat1, cat2, cat3};
        for (int i = 0; i < cats.length; i++) {
            cats[i].printInfo();
        }
    }
}
