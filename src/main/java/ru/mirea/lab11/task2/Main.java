package ru.mirea.lab11.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Введите дату в фомате гггг-мм-дд: ");
        String inpDate = scanner.nextLine();

        try {
            Date date = formatter.parse(inpDate);
            Date curDate = new Date();
            System.out.println("Текущая дата: " + curDate);
            System.out.println("Введённая дата: " + date);
            if (curDate.getTime() - date.getTime() >= 24 * 60 * 60 * 1000)
                System.out.println("Текущая дата больше");
            else if (curDate.getTime() - date.getTime() < 24 * 60 * 60 * 1000 && curDate.getTime() - date.getTime() >= 0)
                System.out.println("Это одна и та же дата");
            else
                System.out.println("Введенная дата больше");

        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
        }

    }
}
