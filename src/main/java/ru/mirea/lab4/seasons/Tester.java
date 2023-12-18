package ru.mirea.lab4.seasons;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Введите интересующее время года на английском языке капсом: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Seasons season = Seasons.valueOf(name);
        System.out.println(season.getDescription());
        System.out.println("Средняя температура: " + Seasons.getTempearture(season));
        Seasons.getPreference(season);
        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons);
        }
    }
}
