package HomeWork6;

public class HomeWork6 {

    public static void main(String[] args) {
        Animal cat1 = new Cat("Федор", "белый", 15);
        Animal cat2 = new Cat("Барсик", "Рыжий", 5);
        Animal cat3 = new Cat("Фридрих");

        Animal dog1 = new Dog("Шкипер", "Черный", 7);
        Animal dog2 = new Dog("Рекс", "Пятнистый", 8);

        cat1.run(150);
        cat2.run(300);
        cat3.run(100);
        dog1.run(600);
        dog2.run(300);

        System.out.println("===============");

        int sum = 0;

        Animal[] animals = {cat1, cat2, cat3, dog1, dog2};
        for (int i = 0; i < animals.length; i++) {
            animals[i].printInfo();
            sum = ++i;
        }
        System.out.println("===============");
        System.out.println("У нас " + sum + " животных");
    }
}
