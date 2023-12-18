package ru.mirea.lab8.task11;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOnes = recursion(scanner);
        System.out.println(countOnes);
    }

    public static int recursion(Scanner scanner) {
        String number = scanner.nextLine();

        if (number.equals("00")) {
            return 0;
        }

        if (number.equals("1")) {
            return 1 + recursion(scanner);
        } else {
            return recursion(scanner);
        }
    }
}
