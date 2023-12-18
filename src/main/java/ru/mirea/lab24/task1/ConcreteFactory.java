package ru.mirea.lab24.task1;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public ComplexNumber createComplex() {
        // Создание комплексного числа без аргументов
        return new ConcreteComplexNumber();
    }

    @Override
    public ComplexNumber createComplex(int real, int imaginary) {
        // Создание комплексного числа с заданными значениями
        return new ConcreteComplexNumber(real, imaginary);
    }

    @Override
    public ComplexOperation createComplexOperation() {
        return new ConcreteComplexOperation();
    }
}