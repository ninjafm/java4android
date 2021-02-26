package Lesson5;

import java.util.Random;

public class HomeWork5 {
    public static void main (String[] args) {
        Employee Employee1 = new Employee("Виктор Петрович Сидоров", "бухгалтер", "petrov@yandex.ru", "+79999999999", 30000, 30);
        Employee Employee2 = new Employee("Иван Иванович Иванов");
        Employee Employee3 = new Employee("Иван Петрович Иванов");
        Employee Employee4 = new Employee("Игорь Васильевич Ананасов", "инженер", "ananasov@yandex.ru", "+79276664455", 50000, 45);
        Employee Employee5 = new Employee("Петр Андреевич Игнатенко", 56);

        /*Employee1.printInfo();
        Employee2.printInfo();
        Employee3.printInfo();
        Employee4.printInfo();
        Employee5.printInfo();*/




        System.out.println("====================== Сотрудники с возрастом больше 40 лет ====================");

        Employee[] Employees = {Employee1, Employee2, Employee3, Employee4, Employee5};

        for (int i = 0; i < Employees.length; i++) {
            Employees[i].setAge((int)(Math.random()*110));
        }


        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i].getAge() >= 40) {
                Employees[i].printInfo();
            }
        }
    }
}
