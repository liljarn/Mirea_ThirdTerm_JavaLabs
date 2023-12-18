package ru.mirea.lab11.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Array List");
        long start = System.nanoTime();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        long timeWorkCode = System.nanoTime() - start;
        System.out.println("Операция вставки 3 чисел: " + timeWorkCode + " наносекунд");

        start = System.nanoTime();
        list1.remove(Integer.valueOf(1));
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Операция удаления: " + timeWorkCode + " наносекунд");

        start = System.nanoTime();
        list1.contains(3);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Поиск по образцу: " + timeWorkCode + " наносекунд");


        LinkedList<Integer> list2 = new LinkedList<>();
        System.out.println("LinkedList");
        start = System.nanoTime();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Операция вставки 3 чисел: " + timeWorkCode + " наносекунд");

        start = System.nanoTime();
        list2.remove(Integer.valueOf(1));
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Операция удаления: " + timeWorkCode + " наносекунд");

        start = System.nanoTime();
        list2.contains(3);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Поиск по образцу: " + timeWorkCode + " наносекунд");
    }
}
