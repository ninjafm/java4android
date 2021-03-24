package Lesson8.HomeWork8;

public class Track implements Barrier{
    private int distance;
    private boolean runOn;

    public Track(int distance) {
        this.distance = distance;
    }

    public boolean isRunOn() {
        return runOn;
    }

    public void randomRun(boolean random) {
        if (random == true) {
            System.out.println("и пробегает её");
            runOn = true;
        } else {
            System.out.println("не смоге её преодолеть");
            runOn = false;
        }

    }

}
