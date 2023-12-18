package ru.mirea.lab4_1.task1;

public class Circle extends Shape {
    private double radius;

    @Override
    public String getType() {
        return "Круг";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Круг {" +
                "радиус = " + radius +
                ", площадь = " + getArea() +
                ", периметр = " + getPerimeter() +
                ", тип: " + getType() +
                '}';
    }
}