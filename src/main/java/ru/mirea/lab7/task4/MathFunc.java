package ru.mirea.lab7.task4;

public class MathFunc implements MathCalculable{
    private int real;
    private int imagine;

    public MathFunc(int real, int imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    @Override
    public double pow(int x, int y) {
        return Math.pow(x, y);
    }

    @Override
    public double findModule() {
        double square = pow(real, 2) + pow(imagine, 2);
        return Math.sqrt(square);
    }

    @Override
    public String toString() {
        return "Комплексное число: " + real + " + " + imagine + "i";
    }
}
