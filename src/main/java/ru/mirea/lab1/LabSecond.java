package ru.mirea.lab1;

import java.util.Scanner;

public class LabSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива, который будет заполняться через цикл while: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Введите " + n + " элементов массива: ");
        int i = 0;
        int maximum = -100000000;
        int minimum = 1000000000;
        int sum = 0;
        while (i < n) {
            arr[i] = scanner.nextInt();
            if (maximum < arr[i])
                maximum = arr[i];
            if (minimum > arr[i])
                minimum = arr[i];
            sum += arr[i++];
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент массива: " + maximum);
        System.out.println("Минимальный элемент массива: " + minimum);

        System.out.print("Введите размер массива, который будет заполняться через цикл do while: ");
        n = scanner.nextInt();
        System.out.print("Введите " + n + " элементов массива: ");
        i = 0;
        maximum = -100000000;
        minimum = 1000000000;
        sum = 0;
        do {
            if (n > 0) {
                arr[i] = scanner.nextInt();
                if (maximum < arr[i])
                    maximum = arr[i];
                if (minimum > arr[i])
                    minimum = arr[i];
                sum += arr[i++];
            }
        } while (i < n);
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент массива: " + maximum);
        System.out.print("Минимальный элемент массива: " + minimum);
    }
}
