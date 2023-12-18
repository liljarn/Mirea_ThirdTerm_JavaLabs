package ru.mirea.lab4_1.task8;

public class Circle extends Shape{
    protected double radius = 0;
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (filled)
            return Math.PI * radius * radius;
        System.out.println("Невозможно вычислить площадь пустой фигуры");
        return -1;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
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
                ", цвет = " + getColor() +
                ", заполненный цветом = " + isFilled() +
                '}';
    }
}
