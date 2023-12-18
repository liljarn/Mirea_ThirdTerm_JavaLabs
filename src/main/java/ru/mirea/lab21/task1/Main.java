package ru.mirea.lab21.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример конвертации массива строк в список
        String[] stringArray = {"apple", "banana", "cherry"};
        List<String> stringList = ArrayToListConverter.convertArrayToList(stringArray);

        System.out.println("Список строк:");
        for (String s : stringList) {
            System.out.println(s);
        }

        // Пример конвертации массива чисел в список
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = ArrayToListConverter.convertArrayToList(intArray);

        System.out.println("Список чисел:");
        for (Integer num : intList) {
            System.out.print(num + ", ");
        }
    }
}