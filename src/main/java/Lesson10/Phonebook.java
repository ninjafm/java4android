package Lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phonebook = new HashMap<>();
    private ArrayList<String> phonesList;

    public void add(String family, String phone) {
        if (phonebook.containsKey(family)) {
            phonesList = phonebook.get(family);
            phonesList.add(phone);
            phonebook.put(family, phonesList);
        } else {
            phonesList = new ArrayList<>();
            phonesList.add(phone);
            phonebook.put(family, phonesList);
        }

    }

    public ArrayList<String> getFamily(String family) {
        return phonebook.get(family);
    }
}
