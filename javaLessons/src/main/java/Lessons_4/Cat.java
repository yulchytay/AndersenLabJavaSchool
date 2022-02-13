package Lessons_4;

class Cat extends Animal {
    private static int count;
    private static int countClone;

    Cat(double animalDistanceRun, double animalDistanceSwim) {
        super(animalDistanceRun, animalDistanceSwim);
    }

    public static int getCount() {
        return count;
    }

    public static int getCountClone() {
        return countClone;
    }

    public String name;
    public int appetite;
    public boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}