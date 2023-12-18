package ru.mirea.lab20.task5;

import ru.mirea.lab20.task4.Calculator;

public class Main {
    public static void main(String[] args) {
        // Создаем две матрицы
        Integer[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Integer[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        Matrix<Integer> matrixA = new Matrix<>(matrix1);
        Matrix<Integer> matrixB = new Matrix<>(matrix2);

        // Сложение матриц
        Matrix<Integer> sumResult = matrixA.add(matrixB);

        System.out.println("Сумма матриц:");
        sumResult.printMatrix();

        // Вычитание матриц
        Matrix<Integer> subResult = matrixA.subtract(matrixB);

        System.out.println("Разность матриц:");
        subResult.printMatrix();

        // Умножение матриц
        Matrix<Integer> mulResult = matrixA.multiply(matrixB);

        System.out.println("Произведение матриц:");
        mulResult.printMatrix();

        // Вычисление с использованием калькулятора
        Integer a = 5;
        Double b = 2.5;

        System.out.println("Сумма: " + Calculator.sum(a, b));
        System.out.println("Умножение: " + Calculator.multiply(a, b));
    }
}