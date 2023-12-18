package ru.mirea.lab8.task9;

public class Main {
    public static int recursion(int a, int b) {
        if (a > b + 1)
            return 0;
        if (a == 0 || b == 0)
            return 1;
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }



    public static void main(String[] args) {
        System.out.println(recursion(3, 3));
    }
}
