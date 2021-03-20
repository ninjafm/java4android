package Lesson7;

import Lesson5.cat;

public class Plate {
    private int food;

    public Plate(int countFoods){
        food = countFoods;
    }


    //проверка а достаточно ли еды в миске
    public boolean decreaseFood(int countFoods) {
        if (food >= countFoods) {
            food -= countFoods;
            return true;
        } else if ( food < countFoods) {
            System.out.println("Еды в миске недостаточно, котик не покушал");
        }
            return false;
    }
    //метод который добавляет еду в миску
    public void addFood(int foodQuantity) {
        food += foodQuantity;
        System.out.println("В миску добавлена еда в размере " + foodQuantity + " единиц");
    }

    public void printInfo() {
        System.out.println("    Еды в миске: " + food);
    }


}
