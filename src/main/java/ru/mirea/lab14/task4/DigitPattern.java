package ru.mirea.lab14.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitPattern {
    public static void main(String[] args) {
        String line1 = "(1 + 8) – 9 / 4";
        String line2 = "6 / 5 – 2 * 9";
        Pattern pattern = Pattern.compile("\\d ?\\+");
        Matcher matcher = pattern.matcher(line1);
        System.out.println(line1 + " " + matcher.find());
        matcher.reset(line2);
        System.out.println(line2 + " " + matcher.find());
    }
}
