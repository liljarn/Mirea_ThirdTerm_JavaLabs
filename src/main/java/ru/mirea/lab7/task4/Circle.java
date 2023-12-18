package ru.mirea.lab7.task4;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void area() {
        double area = radius * radius * MathCalculable.PI;
        System.out.println("Площадь круга: " + area);
    }
}
