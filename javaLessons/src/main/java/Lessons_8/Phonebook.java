package Lessons_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Phonebook {

    private HashMap<String, List<String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (book.containsKey(surname)) {
            List<String> numbers = book.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println(String.format("Номер %s доданий для прізвища %s", number, surname));
            } else {
                System.out.println(String.format("Номер %s  існує  %s", number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер %s доданий для прізвища    %s", number, surname));
        }
    }

    public List<String> get(String surname) {
        if (book.containsKey(surname)) {
            return book.get(surname);
        } else {
            System.out.println(String.format(" немає запису для прізвища %s", surname));
            return new ArrayList<>();
        }
    }
}
