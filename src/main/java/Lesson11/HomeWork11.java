package Lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HomeWork11 {
    public static void main(String[] args) {
//        1. Написать метод, который меняет два элемента массива местами
//        ]\
//        (массив может быть любого ссылочного типа);
        System.out.println("Задание №1");
        task1(new Integer[]{1, 2, 3, 4, 5}, 1, 3);
        task1(new String[]{"кот", "собака", "конь", "овца", "петух"}, 0, 4);
//        2. Написать метод, который преобразует массив в ArrayList;
        System.out.println();
        System.out.println("Задание №2");
        task2(new String[]{"A", "B", "C", "D", "E"});

        System.out.println("Задача №3");
        task3();
    }

    public static void task1(Object[] arr, int position1, int position2) {
        System.out.println("Первоначальный массив: " + Arrays.toString(arr));
        Object number = arr[position1];
        arr[position1] = arr[position2];
        arr[position2] = number;
        System.out.println("Конечный массив: " + Arrays.toString(arr));
        System.out.println("Измененные позиции: " + position1 + " и " + position2);

    }

    private static void task2(String[] arr) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, arr);
        System.out.println(arrayList);
    }

    public static void task3() {
        Box boxOrange = new Box();
        Box boxOrange1 = new Box();
        Box boxApple = new Box();
        Box boxApple1 = new Box();
        Apple apple = new Apple(1);
        Orange orange = new Orange(1.5);

        boxOrange.addFruit(orange, 10);
        boxApple.addFruit(apple,15);

        System.out.println("Вес коробоки с яблоками: " + boxApple.getWeight());
        System.out.println("Вес коробки с апельсинами: " + boxOrange.getWeight());

        System.out.println("Вес коробок одинаковый? " + boxApple.compare(boxOrange));

        System.out.println("Вес коробки Box1: " + boxApple1.getWeight());
        System.out.println("Вес коробки Box1: " + boxOrange1.getWeight());


        boxOrange.changeBox(boxOrange1);
        boxApple.changeBox(boxApple1);

        System.out.println("Вес коробки Box1: " + boxApple1.getWeight());
        System.out.println("Вес коробки Box1: " + boxOrange1.getWeight());

    }
}
