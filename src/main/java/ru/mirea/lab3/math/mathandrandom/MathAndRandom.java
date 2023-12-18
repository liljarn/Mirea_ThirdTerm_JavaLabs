package ru.mirea.lab3.math.mathandrandom;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.sort;

public class MathAndRandom {
    public static void main(String[] args) {
        int size = (int) (Math.random() * 10);
        double[] arr = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextDouble();
        }
        System.out.println("Размер массива: " + size);
        System.out.println("Массив: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}
