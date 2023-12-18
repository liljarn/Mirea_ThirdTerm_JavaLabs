package ru.mirea.lab4_1.task1;

public class Rectangle extends Shape {
    private double height;
    private double width;

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Прямоугольник {" +
                "высота = " + height + ", ширина = " + width +
                ", площадь = " + getArea() +
                ", периметр = " + getPerimeter() +
                ", тип: " + getType() +
                '}';
    }
}