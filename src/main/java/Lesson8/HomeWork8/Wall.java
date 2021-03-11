package Lesson8.HomeWork8;

public class Wall implements Barrier{
    private int height;
    private boolean jumpWall;

    public Wall(int height) {
        this.height = height;
    }

    public boolean isJumpWall() {
        return jumpWall;
    }

    public void randomJump(boolean random) {
        if (random == true) {
            System.out.println("и перепрыгивает её");
            jumpWall = true;
        } else {
            System.out.println("и не перепрыгивает её");
            jumpWall = false;
        }


    }
}
