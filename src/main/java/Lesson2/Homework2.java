package Lesson2;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        //Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0.
        task1();

        //Задание 2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.
        task2();

        //Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        // пройти по нему циклом и числа меньшие 6 умножить на 2.
        task3();

        //Задание 4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое) и с помощью цикла (-ов)
        // заполнить его диагональные элементы единицами.
        task4();

        //**Задание 5. Задать одномерный массив и найти в нем минимальный
        // и максимальный элементы (без помощи интернета);
        task5();

        //**Задание 6. Написать метод, в который передается не пустой одномерный целочисленный
        // массив, метод должен вернуть true, если в массиве есть место, в котором
        // сумма левой и правой части массива равны. Примеры:
        // checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана
        // символами ||, эти символы в массив не входят.
        //System.out.println(task6(new int[]{10, 2, 2, 2, 2, 2}));
        //System.out.println(task6(new int[]{2, 2, 4, 2, 6, 16}));
        System.out.println(task6test(new int[]{2, 2, 4, 2, 6, 16}));
        System.out.println(task6test(new int[]{1, 3, 5, 2, 6, 16}));
        System.out.println(task6test(new int[]{1, 1, 1, 3}));
        System.out.println(task6test(new int[]{16, 1, 12, 3}));
        System.out.println(task6test(new int[]{0, 0, 0, 0}));

        //Задание 7.  **** Написать метод, которому на вход подается
        // одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все
        // элементымассива на n позиций. Для усложнения задачи
        // нельзя пользоваться вспомогательными массивами.
        task7(new int[]{1, 2, 3, 4, 5},1);
        task7(new int[]{1, 2, 3, 4, 5},3);
        task7(new int[]{1, 2, 3, 4, 5},-1);
        task7(new int[]{1, 2, 3, 4, 5},-3);

        //Задание 8.
        // Задать размерность матрицы от 5 до 7
        // Создать матрицу с указанной размерностью
        // Заполнить матрицу по спирали (числа увеличиваются на 1) (число начинается с 1)
        task8();

    }

        public static void task1() {
            int[] arr = {1, 0, 1, 0, 1, 1, 0, 0, 1, 0};
            System.out.println("Задание 1.");
            System.out.println("Изначальный массив " + Arrays.toString(arr));
            for(int i = 0; i < arr.length; i++){
                if (arr[i] == 0) {
                    arr[i] = 1;
                } else {
                    arr[i] = 0;
                }
            }
            System.out.println("Измененный массив  " + Arrays.toString(arr));
            System.out.println();
        }

        public static void task2 () {
            System.out.println("Задание 2.");
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++) {
            arr[i] = 0 + j;
            j = j + 3;
        }
            System.out.println("Массив: " + Arrays.toString(arr));
            System.out.println();
        }

        public static void task3 () {
            System.out.println("Задание 3.");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println("Изначальный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
            System.out.println("Конечный массив: " + Arrays.toString(arr));
            System.out.println();
        }

        public static void task4() {
            System.out.println("Задание 4.");
            int [] [] array = new int [4] [4];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0, j2 = array.length; j < array.length; j++, j2--) {
                    if (i == j || i == (j2 - 1)) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.printf("%3d",array[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }

        public static void task5() {
            System.out.println("Задание 5");
            int [] arr = {3, 50, 3, 6, 20, 30, 11};
            int min = arr[0];
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Массив: " + Arrays.toString(arr));
            System.out.println("Минимальное значение в массиве: " + min);
            System.out.println("Максимальное значение в массиве: " + max);
        }

    public static boolean task6(int[] arr) {
        System.out.println();
        System.out.println("Задание 6");
        int sumRight = 0;
        int sumLeft = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            sumRight += arr[i + 1];
        }
        if (sumLeft == sumRight) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean task6test (int[] arr) {
        System.out.println();
        System.out.println("Задание 6 тест");
        int sum = 0;
        int sumLeft = 0;
        int sumRight = 0;
        int sumLeftResault = 0;
        int sumRightResault = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            sumLeft += arr[i];
            sumRight = sum - sumLeft;
            if (sumRight == sumLeft) {
                sumLeftResault = sumLeft;
                sumRightResault = sumRight;
            }
        }
         if ((sumRightResault == sumLeftResault && sumLeftResault != 0) || (sum == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void task7(int[] arr, int n) {
        System.out.println();
        System.out.println("Задание 7.");
        System.out.println("Текущий массив: " + Arrays.toString(arr));
        System.out.println("Значение n: " + n);
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int lastElement = arr[arr.length - 1];
                System.arraycopy(arr, 0, arr, 1, arr.length - 1);
                arr[0] = lastElement;
            }
            System.out.println("Измененный массив: " + Arrays.toString(arr));
        }

        if (n < 0) {
            for (int i = 0; i > n; i--) {
                int firstElement = arr[0];
                System.arraycopy(arr, 1, arr, 0, arr.length - 1);
                arr[arr.length - 1] = firstElement;
            }
            System.out.println("Измененный массив: " + Arrays.toString(arr));
        }
    }

    public static void task8 () {
        System.out.println();
        System.out.println("Задание 8");
        int n = 0;
        int[][] arr = new int[5][5];
        System.out.println("Длина массива: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
                int j = 0;
                arr[j][i] = ++n;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            int j = arr.length - 1;
            arr[i][j] = ++n;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int j = arr.length - 1;
            arr[j][i] = ++n;
        }
        for (int i = arr.length - 2; i > 0; i--) {
            int j = 0;
            arr[i][j] = ++n;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            int j = 1;
            arr[j][i] = ++n;
        }
        for (int i = 2; i < arr.length - 1; i++) {
            int j = arr.length - 2;
            arr[i][j] = ++n;
        }
        for (int i = arr.length - 3; i >= 1; i--) {
            int j = arr.length - 2;
            arr[j][i] = ++n;
        }
        for (int i = arr.length - 3; i > 1; i--) {
            int j = 1;
            arr[i][j] = ++n;
        }
        for (int i = 2; i < arr.length - 2; i++) {
            int j = 2;
            arr[j][i] = ++n;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
