package ru.mirea.lab8.task10;

public class Main {
    public static int recursion(int x, int n) {
        if (x == 0)
            return n;
        return recursion(x / 10, 10 * n + x % 10);
    }


    public static void main(String[] args) {
        System.out.println(recursion(12345, 0));
    }
}
