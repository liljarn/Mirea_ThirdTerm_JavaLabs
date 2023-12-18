package ru.mirea.lab1;

import java.util.Scanner;

public class LabFifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, факториал которого хотите получить: ");
        int n = scanner.nextInt();
        System.out.print("Факториал числа " + n + " = " + countFactorial(n));
    }

    public static int countFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++)
            factorial *= i;
        return factorial;
    }
}
