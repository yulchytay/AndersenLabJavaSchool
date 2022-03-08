package Lessons_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Телефонний довідник");
        Phonebook phonebook = new Phonebook();

        phonebook.add("Шевченко", "223344");
        phonebook.add("Шевченко", "22334411");
        phonebook.add("Коваленко", "22334499");
        phonebook.add("Бондаренко", "22334488");
        phonebook.add("Мельник", "22334422");


        System.out.println("Шевченко");
        System.out.println(phonebook.get("Шевченко"));
        System.out.println("Шевченко");
        System.out.println(phonebook.get("Коваленко"));
        System.out.println("Коваленко");
        System.out.println(phonebook.get("Бондаренко"));


        System.out.println("Мельник");
        System.out.println(phonebook.get("Мельник"));


        System.out.println(" записати існуючий номер");
        phonebook.add("Шевченко", "223344");
        System.out.println("Шевченко");
        System.out.println(phonebook.get("Шевченко"));
    }


}

