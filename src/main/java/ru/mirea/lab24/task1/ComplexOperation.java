package ru.mirea.lab24.task1;

public interface ComplexOperation {
    ComplexNumber add(ComplexNumber a, ComplexNumber b);
    ComplexNumber subtract(ComplexNumber a, ComplexNumber b);
    ComplexNumber multiply(ComplexNumber a, ComplexNumber b);
    ComplexNumber divide(ComplexNumber a, ComplexNumber b);
}
