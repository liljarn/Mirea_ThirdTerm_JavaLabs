package ru.mirea.lab2.circle;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: n = ");
        n = scanner.nextInt();
        Circle[] circles = new Circle[n];
        double x, y, radius;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите координаты точек: ");
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            Point p = new Point(x, y);
            System.out.print("Введите радиус окружности: ");
            radius = scanner.nextDouble();
            Circle circle = new Circle(p, radius);
            circles[i] = circle;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(circles[i]);
        }
    }
}
