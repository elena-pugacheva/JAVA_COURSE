
import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addPerson(String name, String phoneNumber) {
        List<String> phoneList = phoneBook.getOrDefault(name, new ArrayList<>());
        phoneList.add(phoneNumber);
        phoneBook.put(name, phoneList);
    }

    public List<String> getPhoneNumbers(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public void printAll() {
        for (String name : phoneBook.keySet()) {
            List<String> phoneList = phoneBook.get(name);
            System.out.println(name + ": " + phoneList);
        }
    }
}

