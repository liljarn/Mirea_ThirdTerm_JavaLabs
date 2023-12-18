package ru.mirea.lab14.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordPattern {
    public static void main(String[] args) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$"; // ?= для проверки вхождения после любого символа .*
        Pattern pattern = Pattern.compile(regex);
        String password1 = "F032_Password";
        String password2 = "TrySpy11";
        String password3 = "smart_pass";
        String password4 = "A007";
        Matcher matcher = pattern.matcher(password1);
        System.out.println(password1 + " " + matcher.find());
        matcher.reset(password2);
        System.out.println(password2 + " " + matcher.find());
        matcher.reset(password3);
        System.out.println(password3 + " " + matcher.find());
        matcher.reset(password4);
        System.out.println(password4 + " " + matcher.find());
    }
}
