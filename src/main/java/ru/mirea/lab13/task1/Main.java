package ru.mirea.lab13.task1;

public class Main {
    public static void main(String[] args) {
        System.out.print("Первый метод: ");
        firstMethod("пту мемрэа");
        System.out.println("Второй метод: " + secondMethod("aboba"));
        System.out.println("Третий метод:" + thirdMethod("ГОЙДА!!!"));
        System.out.println("Четвёртый метод: " + fourthMethod("I like Java"));
        System.out.println("Пятый метод: " + fifthMethod("JavaJavaJava"));
        System.out.println("Шестой метод: " + sixthMethod("I like Java!!!"));
        String seven = "aaaaaaaaaaaaa";
        seven = seventhMethod(seven);
        System.out.println("Седьмой метод: " + seven);
        System.out.println("Восьмой метод: " + eighthMethod("ааааааааааааа"));
        System.out.println("Девятый метод: " + ninthMethod("AAAAAAAAAAAAAA"));
        String ten = "Why I spend my time on Java";
        ten = tenthMethod(ten);
        System.out.println("Десятый метод: " + ten);
    }

    public static void firstMethod(String str) {
        System.out.println("Введённая строка: " + str);
    }

    public static char secondMethod(String str) {
        return str.charAt(str.length() - 1);
    }

    public static boolean thirdMethod(String str) {
        return str.endsWith("!!!");
    }

    public static boolean fourthMethod(String str) {
        return str.startsWith("I like");
    }

    public static boolean fifthMethod(String str) {
        return str.contains("Java");
    }

    public static int sixthMethod(String str) {
        return str.lastIndexOf("Java");
    }

    public static String seventhMethod(String str) {
        return str.replace("a", "o");
    }

    public static String eighthMethod(String str) {
        return str.toUpperCase();
    }

    public static String ninthMethod(String str) {
        return str.toLowerCase();
    }

    public static String tenthMethod(String str) {
        return str.replace(str.substring(str.lastIndexOf("Java"), str.lastIndexOf("Java") + 4), "");
    }
}
