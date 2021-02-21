package Lesson1;

import java.sql.SQLOutput;

public class Homework1 {
    public static void main(String[] args) {
        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        task2();

        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        // где a, b, c, d – входные параметры этого метода. Помните про типы данных и их приведение
        task3();

        //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
        // в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        task4();

        //5. Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль положительное ли число передали, или отрицательное;
        // Замечание: ноль считаем положительным числом.
        task5(10);
        task5(-5);

        //6. Написать метод, которому в качестве параметра передается целое число,
        // метод должен вернуть true, если число отрицательное;
        task6(-10);
        task6(50);

        //7. Написать метод, которому в качестве параметра передается строка,
        // обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        task7("Кирилл");

        //8. * Написать метод, который определяет является ли год високосным,
        // и выводит сообщение в консоль. Каждый 4-й год является високосным,
        // кроме каждого 100-го, при этом каждый 400-й – високосный.
        task8(2000);
        task8(2004);
        task8(2100);
        task8(2021);
    }

    public static void task2() {
        byte varA = 5;
        short varB = 10150;
        int varC = 700100;
        long varD = 1000000000;
        char varE = 'c';
        boolean varF = true;
        String varG = "Помидор";
        double varH = 10.7;
        float varI = 1.7f;
        System.out.println("Задание 2");
        System.out.println(varA);
        System.out.println(varB);
        System.out.println(varC);
        System.out.println(varD);
        System.out.println(varE);
        System.out.println(varF);
        System.out.println(varG);
        System.out.println(varH);
        System.out.println(varI);
        System.out.println();

    }

    public static void task3() {
        System.out.println("Задание 3");
        System.out.println(answer3(3,2,1,5));
        System.out.println(answer3(10,-7,5,2));
        System.out.println(answer3(5,3,10,-2));
        System.out.println();
    }

    public static double answer3 (int a, int b, double c, int d)
    {
        double f = (a * (b + (c / d)));
        return f;
    }

    public static void task4(){

        System.out.println("Задание 4");
        System.out.println(sumVarAVarB(5,10));
        System.out.println(sumVarAVarB(10,-7));
        System.out.println(sumVarAVarB(15,7));
        System.out.println(sumVarAVarB(3,17));
        System.out.println();
    }
    public static boolean sumVarAVarB (int varA, int varB){
        if ((varA + varB) >= 10 && (varA + varB) <= 20) {
            return true;
        } else {
            return false;


        }
    }


    public static void task5(int varA) {
        System.out.println("Задание 5");
        if (varA >= 0) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");

        }
    }

    public static boolean task6(int varA){


        System.out.println("Задание 6");
        if (varA < 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }

    }

    public static void task7(String name) {
        System.out.println();
        System.out.println("Задание 7");
        System.out.println("Привет, " + name);
        System.out.println();
        System.out.println("Задание 8");
    }

    public static void task8(int year){
        if ((year % 400) == 0) {
            System.out.println(year + " год является високосным");
        } else if ((year % 100) == 0) {
            System.out.println(year + " год является не високосным");
        } else if ((year % 4) == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
}