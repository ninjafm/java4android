package Lesson8.HomeWork8;

import java.util.Random;

public class Cat implements Player{
    private String name;
    private Random random = new Random();

    public Cat(String name) {
        this.name = name;
    }

    public void run(Track track) {
        System.out.println("Котик " + name + " бежит по дорожке");
        track.randomRun(random.nextBoolean());
    }

    public void jump(Wall wall) {
        System.out.println("Котик " + name + " прыгает через стену");
        wall.randomJump(random.nextBoolean());
    }
}
