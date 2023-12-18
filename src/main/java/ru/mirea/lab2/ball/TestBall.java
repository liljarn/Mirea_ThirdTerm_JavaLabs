package ru.mirea.lab2.ball;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.print("Введите координаты x: ");
        x = scanner.nextDouble();
        System.out.print("Введите координаты y: ");
        y = scanner.nextDouble();
        Ball ball = new Ball(x, y);
        System.out.println("Координаты мяча: x = " + ball.getX() + ", y = " + ball.getY());
        System.out.print("Введите изменённые координаты мяча: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        ball.setX(x);
        ball.setY(y);
        System.out.println("Координаты мяча после изменений: x = " + ball.getX() + ", y = " + ball.getY());
        System.out.print("Передвиньте мяч на введённые координаты: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        ball.move(x, y);
        System.out.println("Координаты мяча после изменений: x = " + ball.getX() + ", y = " + ball.getY());
        System.out.println(ball);
    }
}
