package Lessons_5;

import java.util.Arrays;
import java.util.List;

public class MainFruikt {

        public static void main(String[] args) {

            System.out.println("Task 3");
            Orange orange = new Orange();
            Apple apple = new Apple();
            Box<Orange> orangeBox1 = new Box();
            Box<Orange> orangeBox2 = new Box();
            Box<Apple> appleBox = new Box();
            orangeBox1.add(new Orange());
            orangeBox1.add(new Orange());
            orangeBox1.add(new Orange());

            for (int i = 0; i < 4; i++) {
                orangeBox2.add(new Orange());
            }
            for (int i = 0; i < 6; i++) {
                appleBox.add(new Apple());
            }


            orangeBox1.info();
            orangeBox2.info();
            appleBox.info();

            Float orange1Weigth = orangeBox1.getWeight();
            Float orange2Weigth = orangeBox2.getWeight();
            Float appleWeigth = appleBox.getWeight();
            System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
            System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
            System.out.println("Вес коробки с яблоками: " + appleWeigth);

            System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
            System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

            orangeBox1.moveAt(orangeBox2);


            orangeBox1.info();
            orangeBox2.info();
            appleBox.info();
        }

        private static <T> void swapElements(T[] array, int index1, int index2) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }

        private static <E> List<E> convertToList(E[] array) {
            return Arrays.asList(array);
        }
    }


