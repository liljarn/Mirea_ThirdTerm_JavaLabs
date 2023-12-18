package ru.mirea.lab2.howmany;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        String text = scanner.nextLine();
        String[] splittedText = text.split(" ");
        System.out.println("Слова в предложении: ");
        for (String word: splittedText) {
            System.out.println(word);
            n++;
        }
        System.out.println("Количество слов: " + n);
    }
}
