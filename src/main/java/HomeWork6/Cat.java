package HomeWork6;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
    public Cat(String name) {
        super(name);
    }


    public void run(int distance) {
        if (distance < 200) {
            System.out.println("Кот " + name + " бежит " + distance + " метров");
        } else if ( distance > 200) {
            System.out.println("Кот " + name + " пробежал 200 метров, он устал и больше бежать не может");
        }
    }

    public void swim(int distance) {
        System.out.println("Кот не умеет плавать!");
    }
}
