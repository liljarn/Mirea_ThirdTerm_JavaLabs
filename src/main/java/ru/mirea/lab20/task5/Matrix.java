package ru.mirea.lab20.task5;

import ru.mirea.lab20.task4.Calculator;

import java.util.Arrays;

public class Matrix<T extends Number> {
    private final T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix<T> add(Matrix<T> other) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != other.matrix.length || cols != other.matrix[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }

        T[][] result = (T[][]) new Number[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = Calculator.sum(matrix[i][j], other.matrix[i][j]);
            }
        }

        return new Matrix<>(result);
    }

    public Matrix<T> subtract(Matrix<T> other) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != other.matrix.length || cols != other.matrix[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for subtraction.");
        }

        T[][] result = (T[][]) new Number[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = Calculator.subtraction(matrix[i][j], other.matrix[i][j]);
            }
        }

        return new Matrix<>(result);
    }

    public Matrix<T> multiply(Matrix<T> other) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int otherCols = other.matrix[0].length;

        if (cols != other.matrix.length) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication.");
        }

        T[][] result = (T[][]) new Number[rows][otherCols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < otherCols; j++) {
                T sum = (T) Integer.valueOf(0); // Инициализация сумматора

                for (int k = 0; k < cols; k++) {
                    sum = Calculator.sum(sum, Calculator.multiply(matrix[i][k], other.matrix[k][j]));
                }

                result[i][j] = sum;
            }
        }

        return new Matrix<>(result);
    }

    public void printMatrix() {
        for (T[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}