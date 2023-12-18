package ru.mirea.lab4_1.task8;

public class Rectangle extends Shape {
    protected double length = 0;
    protected double width = 0;
    @Override
    public double getArea() {
        if (filled)
            return length * width;
        System.out.println("Невозможно вычислить площадь пустой фигуры");
        return -1;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Прямоугольник{" +
                "длина = " + length +
                ", ширина = " + width +
                ", площадь = " + getArea() +
                ", периметр = " + getPerimeter() +
                ", цвет = " + getColor() +
                ", заполненный цветом = " + isFilled() +
                '}';
    }
}