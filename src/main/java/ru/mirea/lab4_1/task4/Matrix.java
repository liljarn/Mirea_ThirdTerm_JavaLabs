package ru.mirea.lab4_1.task4;

public class Matrix {
    private double[][] matrix;
    private int rows;
    private int columns;

    public Matrix(double[][] matrix, int rows, int columns) {
        this.matrix = matrix;
        this.rows = rows;
        this.columns = columns;
    }

    public void addMatrix(Matrix matrix2) {
        if (this.rows != matrix2.rows ||this.columns != matrix2.columns){
            System.out.println("Невозможно сложить матрицы");
            return;
        }
        for (int i = 0; i < columns; i++)
            for (int j = 0; j < rows; j++)
                matrix[i][j] += matrix2.matrix[i][j];
    }

    public void multiplyMatrixByNum(double num) {
        for (int i = 0; i < columns; i++)
            for (int j = 0; j < rows; j++)
                matrix[i][j] *= num;
    }

    public Matrix matrixMultiplication(Matrix matrix2) {
        if (columns != matrix2.rows) {
            System.out.println("Невозможно перемножить матрицы");
        }
        double[][] newMatrix = new double[rows][matrix2.columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix2.columns; j++) {
                for (int k = 0; k < columns; k++) {
                    newMatrix[i][j] += matrix[i][k] * matrix2.matrix[k][j];
                }
            }
        }
        return new Matrix(newMatrix, matrix2.columns, rows);
    }

    public void printMatrix() {
        for (int i = 0; i < columns; i++) {
            System.out.print("[ ");
            for (int j = 0; j < rows; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println(']');
        }
    }
}
