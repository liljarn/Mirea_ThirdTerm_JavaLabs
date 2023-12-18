package ru.mirea.lab20.task4;

public class Main {
    public static void main(String[] args) {
        Integer a = 5;
        Double b = 2.5;

        System.out.println("Сумма: " + Calculator.sum(a, b));
        System.out.println("Умножение: " + Calculator.multiply(a, b));
        System.out.println("Деление: " + Calculator.divide(a, b));
        System.out.println("Вычитание: " + Calculator.subtract(a, b));

        Integer[] integers = {5, 2, 8, 1, 9, 4, 6};

        MinMax<Integer> minMax = new MinMax<>(integers);
        Integer min = minMax.findMin();
        Integer max = minMax.findMax();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }
}
