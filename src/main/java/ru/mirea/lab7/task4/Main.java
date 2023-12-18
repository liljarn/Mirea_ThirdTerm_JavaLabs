package ru.mirea.lab7.task4;

public class Main {
    public static void main(String[] args) {
        MathCalculable func = new MathFunc(3, 4);
        System.out.println(func.findModule());
        System.out.println(func);

        Circle circle = new Circle(3);
        circle.area();
    }
}
