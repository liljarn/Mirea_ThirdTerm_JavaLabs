package ru.mirea.lab4_1.task1;

public class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(2, 3);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр квадрата: " + square.getPerimeter());
        System.out.println("Тип фигуры объекта rectangle: " + rectangle.getType());
        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);
    }
}
