package school.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printTreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();

    }

    public static void checkSumSign() {
        int a=5;
        int b=6;
        int c=a+b;
        if (c>=0) {
            System.out.println("Сумма положительная");
                    }
        else
            System.out.println("Сумма отрицательная");
        System.out.println();
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value>0 && value <=100) {
            System.out.println("Желтый");
        }
        if (value>100){
            System.out.println("Зеленый");
        }
        System.out.println();
    }

    public static void compareNumbers() {
        int a=12;
        int b=93;
        if (a>=b){
            System.out.println("a >= b");
        }
        else
            System.out.println("a < b");

    }

}
