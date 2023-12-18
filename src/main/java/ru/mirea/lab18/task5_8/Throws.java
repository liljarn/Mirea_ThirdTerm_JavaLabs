package ru.mirea.lab18.task5_8;

import java.util.Objects;
import java.util.Scanner;

public class Throws {
    static public void getKey() {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            getKey();
        }
    }

    static public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    static private String getDetails(String key) {
        if (Objects.equals(key, "pup")) {
            throw new IllegalArgumentException("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            getKey();
        }
    }
}