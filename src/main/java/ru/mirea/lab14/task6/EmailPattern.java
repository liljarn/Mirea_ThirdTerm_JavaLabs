package ru.mirea.lab14.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPattern {
    public static void main(String[] args) {
        String regex = "^(\\w+)@(\\w+)(\\.\\w+)?" ;
        Pattern pattern = Pattern.compile(regex);
        String email1 = "myhost@@@com.ru";
        String email2 = "user@example.com";
        String email3 = "root@localhost";
        String email4 = "@my.ru";
        Matcher matcher = pattern.matcher(email1);
        System.out.println(email1 + " " + matcher.find());
        matcher.reset(email2);
        System.out.println(email2 + " " + matcher.find());
        matcher.reset(email3);
        System.out.println(email3 + " " + matcher.find());
        matcher.reset(email4);
        System.out.println(email4 + " " + matcher.find());
    }
}
