package Lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HomeWork10 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        Map<String, Integer> map = new HashMap<>();

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("собака");
        arrayList.add("кошка");
        arrayList.add("лощадь");
        arrayList.add("собака");
        arrayList.add("кошка");
        arrayList.add("петух");
        arrayList.add("корова");
        arrayList.add("овца");
        arrayList.add("корова");
        arrayList.add("овца");
        arrayList.add("мышь");

        for (String item: arrayList) {

            if (map.containsKey(item))
                map.put(item, map.get(item) + 1);
            else
                map.put(item, 1);
        }
        System.out.println(map);
    }


    private static void task2() {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "89996665544");
        phonebook.add("Иванов", "89996665543");
        phonebook.add("Иванов", "89996665549");
        phonebook.add("Петров", "89996665533");
        phonebook.add("Петров", "89996665532");
        phonebook.add("Сидоров", "89996665522");
        phonebook.add("Сидоров", "89996665511");

        System.out.println("Иванов - " + phonebook.getFamily("Иванов"));
        System.out.println("Петров - " + phonebook.getFamily("Петров"));
        System.out.println("Сидоров - " + phonebook.getFamily("Сидоров"));
    }

}
