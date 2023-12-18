package ru.mirea.lab20.task4;

public class Calculator {
    public static <T extends Number, U extends Number> T sum(T a, U b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        }
    }

    public static <T extends Number, U extends Number> T multiply(T a, U b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() * b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        }
    }

    public static <T extends Number, U extends Number> T divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() / b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        }
    }

    public static <T extends Number, U extends Number> T subtraction(T a, U b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() - b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        }
    }

    public static String subtract(Integer a, Double b) {
        return null;
    }
}