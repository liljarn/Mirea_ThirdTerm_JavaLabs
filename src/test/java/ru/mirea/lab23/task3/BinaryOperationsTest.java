package ru.mirea.lab23.task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryOperationsTest {
    @Test
    @DisplayName("Тест для 23й практической")
    public void test() {
        int x = 2;
        Expression expression = new Add(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(1)
        );
        assertThat(expression.evaluate(x)).isEqualTo(1);
    }
}
