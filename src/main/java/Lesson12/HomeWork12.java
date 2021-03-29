package Lesson12;

import java.util.Arrays;

public class HomeWork12 {
    public static void main(String[] args) throws InterruptedException {
        task1();
    }

    public static void task1() throws InterruptedException {
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];

        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        System.out.print("Время заполнения массива единицами: ");
        System.out.println(System.currentTimeMillis() - a);

        singleThread(arr);
        multiThread(arr);
    }

    private static void singleThread(float[] arr) {
        long b = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.print("Время заполнения массива по формуле в один поток: ");
        System.out.println(System.currentTimeMillis() - b);
        //System.out.println(Arrays.toString(arr));

    }

    private static void multiThread(float[] arr) throws InterruptedException {
        float[] arr1 = new float[arr.length / 2];
        float[] arr2 = new float[arr.length];
        long c = System.currentTimeMillis();
        // разбиваем расчеты на два потока
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = arr2.length / 2; i < arr2.length; i++) {
                arr2[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        long d = System.currentTimeMillis();
        //склеиваем два массива в один:
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        //от 2го массива нужна только 2ая половина
        for (int i = arr2.length / 2; i < arr2.length; i++) {
            arr[i] = arr2[i];
        }


        //Thread.sleep(2000);
        System.out.print("Время заполнения массива по формуле в 2 потока: ");
        System.out.println(System.currentTimeMillis() - c);
        System.out.print("Время заполнения массива по формуле в 2 потока без учета склейки: ");
        System.out.println(d - c);

/*        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));*/

    }
}
