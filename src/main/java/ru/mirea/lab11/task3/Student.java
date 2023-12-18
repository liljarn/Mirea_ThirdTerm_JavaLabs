package ru.mirea.lab11.task3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    Date date;

    public Student(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите один из предложенных форматов:");
        System.out.println("1 - ДД-ММ-ГГГГ");
        System.out.println("2 - ММ-ГГГГ");
        System.out.println("3 - ГГГГ");
        System.out.println("4 - ДД-ММ-ГГ");
        int format = sc.nextInt();
        SimpleDateFormat formatter = switch (format) {
            case 2 -> new SimpleDateFormat("MM.yyyy");
            case 3 -> new SimpleDateFormat("yyyy");
            case 4 -> new SimpleDateFormat("dd.MM.yy");
            default -> new SimpleDateFormat("dd.MM.yyyy");
        };

        return formatter.format(date);
    }

    public static void main(String[] args) {
        Student s = new Student(new Date());
        System.out.println(s);
    }
}