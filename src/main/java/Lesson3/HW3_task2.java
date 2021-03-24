package Lesson3;

import java.util.Scanner;

public class HW3_task2 {
    public static void main(String[] args) {
        wordGuess();
    }

    public static void wordGuess() {
        System.out.println("Игра УГАДАЙ СЛОВО");
        Scanner keyword = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //String[] words2 = {"ap*****", "or*****", "le*****", "ba*****", "ap*****", "av*****", "br*****", "ca*****", "ch*****", "ga*****", "gr*****", "me*****", "le*****", "ki*****", "ma*****", "mu*****", "nu*****", "ol*****", "pe*****", "pe*****", "pe*****", "pe*****", "pi*****", "pu*****", "po*****"};
        while (true) {
            int n = 3;
            int number = (int) (Math.random() * words.length);
            String str = words[number];
            char a = str.charAt(0);
            System.out.println("Сыграем? да/нет");
            String again = keyword.next();
            if (again.toLowerCase().equals("да")) {

            while (n >= 0) {
                System.out.println("Угадайте загаданное слово!");
                String playerWord = keyword.next();

                if (playerWord.toLowerCase().equals(words[number])) {
                    System.out.println("Вы угадали! Игра окончена.");
                    break;
                } else {
                    System.out.println("Вы не угадали! Подсказка: " + a + str.charAt(1) + "#############");
                    System.out.println("Осталось попыток: " + n);
                    n--;
                }


            }
            } else if (again.toLowerCase().equals("нет")) {
                System.out.println("Игра окончена!");
                break;
            }
        }

        keyword.close();
    }
}


