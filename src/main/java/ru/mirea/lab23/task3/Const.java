package ru.mirea.lab23.task3;

record Const(int value) implements Expression {
    @Override
    public int evaluate(int x) {
        return value;
    }
}

