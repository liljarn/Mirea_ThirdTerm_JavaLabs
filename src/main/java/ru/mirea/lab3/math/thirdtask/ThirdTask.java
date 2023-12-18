package ru.mirea.lab3.math.thirdtask;

import java.util.Arrays;
import java.util.Random;

public class ThirdTask {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = random.nextInt(90) + 10;
        }
        System.out.println(Arrays.toString(arr));
        boolean increase = true;
        for (int i = 0; i < 3; i++) {
            if (arr[i + 1] < arr[i]) {
                increase = false;
                break;
            }
        }
        if (increase)
            System.out.println("Массив является строго возрастающей последовательносью");
        else
            System.out.println("Массив не является строго возрастающей последовательносью");
    }
}
