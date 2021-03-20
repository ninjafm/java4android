package Lesson8.HomeWork8;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        Cat cat = new Cat("Мурзик");
        Human human = new Human("Федор");
        Robot robot = new Robot("R2D2");

        Track track = new Track(1000);
        Wall wall = new Wall(1);
        Finish finish = new Finish();

        Player[] player = {cat, human, robot};
        Barrier[] barrier = {track, wall, wall, track, track, finish};

        for (int i = 0; i < player.length; i++) {
            for (int j = 0; j < barrier.length; j++) {
                if (barrier[j] == track) {
                    player[i].run(track);
                    if (track.isRunOn() == false) {
                        System.out.println("Сошёл с дистанции");
                        break;
                    }
                } else if (barrier[j] == wall){
                    player[i].jump(wall);
                    if (wall.isJumpWall() == false) {
                        System.out.println("Сошёл с дистанции");
                        break;
                    }
                } else  {
                    System.out.println("Участник ПОБЕДИЛ!!! ");
                }
            }
            System.out.println();
        }
    }
}
