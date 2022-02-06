package Lessons_2;

import com.sun.jdi.Value;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println("Задание 1: " + within10and20(6, 5));
        System.out.println("Задание 2: ");
        PositiveOrNegative(4);
        System.out.println("Задание 3: " + PositiveOrNegative2(-5));
        System.out.println("Задание 4: ");
        printWordNTimes("Hello, my HomeWork2!", 3);
        System.out.println("Задание 5: " + Year(2022));
        System.out.println("Задание 6:");
        ArrayChange();
        System.out.println();
        System.out.println("Задание 7:");
        Array100chisel();
        System.out.println();
        System.out.println("Задание 8: ");
        ArrayMnozna2();
        System.out.println("Задание 9: ");
        DvymerniyArray(6, 6);
        System.out.println("Задание 10: ");
        ArrayFill(3, 4);
        System.out.println("Задание 11:");
        ArrayMove();
    }

    public static boolean within10and20(int x1, int x2) {

        if (x1 + x2 < 10 || x1 + x2 > 20) {
            return false;
        } else
            return true;

    }

    public static void PositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное = " + x);
        } else {
            System.out.println("Число отрицательное = " + x);
        }
    }

    public static boolean PositiveOrNegative2(int x) {
        if (x >= 0) {
            return true;
        } else
            return false;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static boolean Year(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            return true;
        } else
            return false;

    }

    public static void ArrayChange() {

        int[] array = {0, 1, 1, 1, 0, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.print(array[i]);

        }
    }

    public static void Array100chisel() {
        int[] array100 = new int[100];
        for (int i = 0; i < 100; i++) {
            array100[i] = i;
            System.out.print(array100[i]);
        }

    }

    public static void ArrayMnozna2() {
        int[] arraymnoz = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arraymnoz.length; i++) {
            if (arraymnoz[i] < 6) {
                arraymnoz[i] *= 2;
            }
            System.out.println(arraymnoz[i]);


        }

    }

    public static void DvymerniyArray(int a, int b) {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, x = array[i].length - 1; j < array[i].length;
                 j++, x--) {
                if (i == j || i == x) array[i][j] = 1;
                else array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    public static void ArrayFill(int len, int initialValue) {
        int[] arrayfill = new int[len];
        for (int i = 0; i < arrayfill.length; i++) {
            arrayfill[i] = initialValue;
            System.out.println(arrayfill[i]);
        }
    }



    public static void ArrayMove() {

    int[] array = { 3, 5, 6, 1};
    int k = 2;
                for (int i = 0; i < k; i++) {
        int tmp = array[0];
        for (int j = 0; j < array.length - 1; j++)
            array[j] = array[j+1];
        array[array.length - 1] = tmp;
    }
                System.out.println(Arrays.toString(array));

}}









