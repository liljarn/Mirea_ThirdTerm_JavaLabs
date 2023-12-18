package ru.mirea.lab11.task1;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dev = scanner.nextLine();
        System.out.println("Разработчик: " + dev);
        Date start = new Date();
        System.out.println("Задание выдано: " + start);
        Date finish = new Date(start.getTime() + 60 * 60 * 24 * 1000 * 7);
        System.out.println("задание завершено: " + finish);
    }
}
