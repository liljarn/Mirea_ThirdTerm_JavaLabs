package ru.mirea.lab23.task3;

public record Variable(String name) implements Expression {
    @Override
    public int evaluate(int x) {
        return x;
    }
}
