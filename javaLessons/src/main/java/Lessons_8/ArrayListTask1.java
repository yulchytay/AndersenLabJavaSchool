package Lessons_8;

import java.util.*;

public class ArrayListTask1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("яблуко", "груша", "апельсин", "ананас", "ківі", "манго", "кавун", "диня", "яблуко", "груша", "диня");
        Set<String> unique = new HashSet<>(words);

        System.out.println("Початковий масив");
        System.out.println(words.toString());
        System.out.println("Унікальні слова");
        System.out.println(unique.toString());
        System.out.println("Слово зустрічається:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

    }
}
