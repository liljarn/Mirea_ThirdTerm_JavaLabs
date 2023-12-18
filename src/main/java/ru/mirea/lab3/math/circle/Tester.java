package ru.mirea.lab3.math.circle;

import java.util.ArrayList;
import java.util.Random;

public class Tester {
    ArrayList<Circle> circles = new ArrayList<>();
    int count = 0;

    public Circle getSmallest() {
        double min = Double.MAX_VALUE;
        Circle minCircle = null;
        for (Circle circle : circles) {
            if (circle.getRadius() <= min) {
                min = circle.getRadius();
                minCircle = circle;
            }
        }
        return minCircle;
    }
    public Circle getBiggest() {
        double max = Double.MIN_VALUE;
        Circle maxCircle = null;
        for (Circle circle : circles) {
            if (circle.getRadius() >= max) {
                max = circle.getRadius();
                maxCircle = circle;
            }
        }
        return maxCircle;
    }

    public void sortCircles() {
        circles.sort(Circle::compareTo);
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        Random random = new Random();
        Circle circle1 = new Circle(random.nextDouble(), new Point(random.nextDouble(), random.nextDouble()));
        Circle circle2 = new Circle(random.nextDouble(), new Point(random.nextDouble(), random.nextDouble()));
        Circle circle3 = new Circle(random.nextDouble(), new Point(random.nextDouble(), random.nextDouble()));
        System.out.println("1. " + circle1.toString());
        System.out.println("2. " + circle2.toString());
        System.out.println("3. " + circle3.toString());
        tester.circles.add(circle1);
        tester.circles.add(circle2);
        tester.circles.add(circle3);
        System.out.println("Наибольшая окружность: " + tester.getBiggest());
        System.out.println("Наименьшая окружность: " + tester.getSmallest());
        tester.sortCircles();
        System.out.println("После сортировки: ");
        System.out.println("1. " + tester.circles.get(0).toString());
        System.out.println("2. " + tester.circles.get(1).toString());
        System.out.println("3. " + tester.circles.get(2).toString());
    }

}
