package Lessons_4;

public class Dog extends Animal {
    private static int count;
    private static int countClone;

    Dog(double animalDistanceRun, double animalDistanceSwim) {

        super(animalDistanceRun, animalDistanceSwim);
    }

    public static int getCount() {
        return count;
    }

    public static int getCountClone() {
        return countClone;
    }
}



