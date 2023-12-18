package ru.mirea.lab1;

import java.util.Scanner;

public class LabFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double sum = 0;
        double mid;
        System.out.print("Введите размер массива: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Введите " + n + " элементов массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        mid = sum / n;
        System.out.println("Сумма элементов массива: " + sum);
        System.out.print("Среднее арифметическое элементов массива: " + mid);
    }
}
