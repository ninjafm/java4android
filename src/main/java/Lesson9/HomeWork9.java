package Lesson9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork9 {
    public static void main(String[] args) {
        homework9(new String[][]{{"1", "d", "3"}, {"1", "e", "3"}, {"1", "2", "3"}});
    }

    private static void homework9(String[][] arr) {

        if (arr.length == 4) {
            System.out.println("Массив 4x4");
        } else {
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
            System.out.println("Продолжение");
        }
        int[][] myArray = new int[arr.length][arr.length];

        System.out.println("Начальный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
                System.out.print("");
            }
            System.out.println();
        }

        try {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    try {
                        myArray[i][j] = Integer.parseInt(arr[i][j]);

                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка в элементе " + i + "  " + j);

                    }

                }
            }
            throw new MyArrayDataException();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            //System.out.println("Ошибка. Вместо числа буква или текст");
        }

        int sum = 0;
        System.out.println("Измененный массив:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[i][j] + " ");
                System.out.print("");
            }
            System.out.println();
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                sum += myArray[i][j];
            }
        }
        System.out.println("Сумма массива: " + sum);
        //System.out.println(arr.length);
    }
}
