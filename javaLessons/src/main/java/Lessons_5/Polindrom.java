package Lessons_5;


import java.util.Arrays;

public class Polindrom {


    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        String[] arr = {"Можливість", "чогось", "навчитися", "не", "можна", "упускати"};

        System.out.println( Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));

            }



}