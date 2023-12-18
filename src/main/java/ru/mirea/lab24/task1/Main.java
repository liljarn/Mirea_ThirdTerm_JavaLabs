package ru.mirea.lab24.task1;

public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        ComplexNumber complex1 = factory.createComplex();
        System.out.println("Complex 1: " + complex1.toString());
        ComplexNumber complex2 = factory.createComplex(3, 4);
        System.out.println("Complex 2: " + complex2.toString());

        ComplexOperation operation = factory.createComplexOperation();
    }
}
