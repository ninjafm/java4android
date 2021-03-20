package HomeWork6;

public class Animal {
    protected String name;
    private String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal(String name){
        this(name, "серый", 0);
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public void run (int distance){
        System.out.println("Животное бежит " + distance + " м");
    }

    public void swim(int distance){
        System.out.println("Животное не умеет плавать");
    }

    public void printInfo(){
        System.out.println(this.toString());
    }
}
