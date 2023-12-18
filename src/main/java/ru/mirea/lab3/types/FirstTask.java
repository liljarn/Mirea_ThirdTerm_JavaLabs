package ru.mirea.lab3.types;

public class FirstTask {
    public static void main(String[] args) {
        double a = 1.5;
        Double A = Double.valueOf(a);
        String b = "2.676";
        Double B = Double.parseDouble(b);
        Double C = 100000.23451234512345;

        double doubleC = C.doubleValue();
        float floatC = C.floatValue();
        long longC = C.longValue();
        int intC = C.intValue();
        short shortC = C.shortValue();
        byte byteC = C.byteValue();
        boolean boolC = (C != 0);
        char charC = C.toString().charAt(0);
        System.out.println("Перевод в примитивные типы: ");
        System.out.println("double: " + doubleC);
        System.out.println("float: " + floatC);
        System.out.println("long: " + longC);
        System.out.println("int: " + intC);
        System.out.println("short: " + shortC);
        System.out.println("byte: " + byteC);
        System.out.println("boolean: " + boolC);
        System.out.println("char: " + charC);

        System.out.println("Double: " + A + " " + B + " " + C);
        String d = Double.toString(3.14);
    }

}
