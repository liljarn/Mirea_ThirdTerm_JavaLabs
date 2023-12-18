package ru.mirea.lab16.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessingGame extends JFrame {
    private int numberToGuess;
    private int attemptsLeft = 3;

    private JTextField textField;
    private JButton guessButton;
    private JLabel resultLabel;

    public GuessingGame() {
        setTitle("Игра-угадайка");
        setSize(600, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        numberToGuess = new Random().nextInt(21);

        textField = new JTextField(10);
        guessButton = new JButton("Угадать");
        resultLabel = new JLabel("");

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Введите число от 0 до 20: "));
        panel.add(textField);
        panel.add(guessButton);

        add(panel);
        add(resultLabel);
    }

    private void checkGuess() {
        try {
            int userGuess = Integer.parseInt(textField.getText());

            if (userGuess == numberToGuess) {
                resultLabel.setText("Вы угадали!");
                guessButton.setEnabled(false);
            } else {
                attemptsLeft--;
                if (attemptsLeft > 0) {
                    resultLabel.setText("Попробуйте снова. Осталось попыток: " + attemptsLeft);
                    if (userGuess < numberToGuess) {
                        resultLabel.setText(resultLabel.getText() + " (Число больше)");
                    } else {
                        resultLabel.setText(resultLabel.getText() + " (Число меньше)");
                    }
                } else {
                    resultLabel.setText("Игра окончена. Вы не угадали. Загаданное число: " + numberToGuess);
                    guessButton.setEnabled(false);
                }
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Введите корректное число.");
        }
        textField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GuessingGame game = new GuessingGame();
                game.setVisible(true);
            }
        });
    }
}