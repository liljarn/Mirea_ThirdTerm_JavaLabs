package ru.mirea.lab7.task5;

public class Test {
    public static void main(String[] args) {
        String str = "хакич";
        ProcessString processString = new ProcessString();
        System.out.println(processString.length(str));
        System.out.println(processString.oddSubString(str));
        System.out.println(processString.reverse(str));
    }
}
