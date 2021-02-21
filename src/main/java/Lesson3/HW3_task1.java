package Lesson3;

import java.util.Scanner;

public class HW3_task1 {
    public static void main (String[] args) {
        guessingGame();
    }

    public static void guessingGame() {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Сыграем в угадайку? да/ нет");
            String again = keyboard.nextLine();
            if (again.toLowerCase().equals("да")) {
                int number = (int) (Math.random() * 10 + 1);
                //System.out.println("Загаданное число: " + number);
                System.out.println("Угадайте число от 1 до 10:");
                int n = 2;
                while (n >= 0) {
                    int playerNumber = keyboard.nextInt();

                    if (number == playerNumber) {
                        System.out.println("Поздравляем, вы угадали число!");
                        break;
                    } else if (playerNumber < number) {
                        System.out.println("Вы ввели меньшее число! Осталось попыток: " + n);
                        n--;
                    } else if (playerNumber > number) {
                        System.out.println("Вы ввели большее число! Осталось попыток: " + n);
                        n--;
                    }
                }
                System.out.println("Игра окончена!");
            } else if (again.toLowerCase().equals("нет")) {
                System.out.println("Игра окончена!");
                break;
            }
        }
        keyboard.close();
    }
}
