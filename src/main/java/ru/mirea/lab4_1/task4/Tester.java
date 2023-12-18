package ru.mirea.lab4_1.task4;

import java.util.Locale;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double[][]matrix1={{1,4},{2,6}};
        double[][]matrix2={{3,7},{9,2}};
        Matrix matr1 = new Matrix(matrix1,2, 2);
        Matrix matr2 = new Matrix(matrix2,2, 2);
        System.out.println("Первая матрица:");
        matr1.printMatrix();
        System.out.println("Вторая матрица:");
        matr2.printMatrix();
        System.out.println("Первая матрица после сложения со второй: " );
        matr1.addMatrix(matr2);
        matr1.printMatrix();
        System.out.println("Введите число, на которое хотите умножить матрицу: " );
        double n = scanner.nextDouble();
        System.out.println("Результат умножения матрицы на число " + n + " :");
        matr1.multiplyMatrixByNum(n);
        matr1.printMatrix();
        System.out.println("Произведение матрицы 1 и матрицы 2:");
        Matrix mul12=matr1.matrixMultiplication(matr2);
        mul12.printMatrix();
    }
}