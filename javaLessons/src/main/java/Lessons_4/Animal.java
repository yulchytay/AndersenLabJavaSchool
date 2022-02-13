package Lessons_4;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Lessons_4.EatCate.sc;


public class Animal implements AnimalInterface {
    private double animalDistanceRun, animalDistanceSwim;

    Animal(double animalDistanceRun, double animalDistanceSwim) {
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceSwim = animalDistanceSwim;
    }

    private static int count;

    public Animal() {
        count++;
    }


    public static int getCount() {
        return count;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        count++;
        return super.clone();
    }

    @Override
    public boolean run(double value) {
        return animalDistanceRun > value;
    }


    @Override
    public boolean swim(double value) {
        return animalDistanceSwim > value;
    }

    double getAnimalDistanceRun() {
        return animalDistanceRun;
    }

    double getAnimalDistanceSwim() {
        return animalDistanceSwim;
    }


    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = Math.random() * 200;

        double distanceSwim = Math.random();
        Cat cat = new Cat(distanceRun, distanceSwim);

        distanceRun = Math.random() * 500;
        distanceSwim = Math.random() * 10;
        Animal dog = new Dog(distanceRun, distanceSwim);


        System.out.println("Введите дистанцию для бега:");
        double distance = scanner.nextDouble();

        System.out.println("Кошка бежит (" + distance + "). Результат: " + cat.run(distance));
        System.out.println("Собака бежит (" + distance + "). Результат: " + dog.run(distance));
        System.out.println("\n++++++++++++\n");


        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextDouble();

        System.out.println("Кошка плывет(" + distance + "). Результат: " + "кот не умеет плавать!!");
        System.out.println("Собака плывет(" + distance + "). Результат: " + dog.swim(distance));
        System.out.println("Кормим котов!!");

        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Марсик", 5, false);
        allCats[1] = new Cat("Венера", 30, false);
        allCats[2] = new Cat("Мушка", 10, false);
        allCats[3] = new Cat("Черныш", 45, false);
        Plate plate = new Plate(55);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite < plate.food) {
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Котик " + allCats[i].name + " покушал!");
            } else {
                System.out.println("Котик " + allCats[i].name + " не поел!");
            }
        }

        plate.info();
        System.out.println("Сколько грамм вискаса добавить еще в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}

