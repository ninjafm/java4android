package HomeWork6;

public class Dog extends Animal{
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    public Dog(String name) {
        super(name);
    }

    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Пёс " + name + " бежит " + distance + " метров");
        } else if ( distance > 200) {
            System.out.println("Пёс " + name + " пробежал 500 метров, он устал и больше бежать не может");
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Пёс " + name + " проплыл " + distance + " метров");
        } else if ( distance > 10) {
            System.out.println("Пёс " + name + " проплыл 10 метров и устал");
        }
    }
}
