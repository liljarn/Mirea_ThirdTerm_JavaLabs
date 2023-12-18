package ru.mirea.lab4_1.task1;

public class Square extends Shape {
    private double side;

    @Override
    public String getType() {
        return "Квадрта";
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Квадрат {" +
                "сторона = " + side +
                ", площадь = " + getArea() +
                ", периметр = " + getPerimeter() +
                ", тип: " + getType() +
                '}';
    }
}