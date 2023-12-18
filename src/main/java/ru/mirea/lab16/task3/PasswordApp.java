package ru.mirea.lab16.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordApp extends JFrame {
    String service = "PasswordApp";
    String userName = "Aboba";
    String password = "1234";

    public PasswordApp() {
        setLayout(new FlowLayout());
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(3,2));
        grid.add(new JLabel("Service: "));
        JTextField serviceField = new JTextField(15);
        grid.add(serviceField);
        grid.add(new JLabel("User name: "));
        JTextField userNameField = new JTextField(15);
        grid.add(userNameField);
        grid.add(new JLabel("Password: "));
        JTextField passwordField = new JTextField(15);
        grid.add(passwordField);

        add(grid);
        JButton checkButton = new JButton("LOG IN");
        checkButton.setBackground(Color.ORANGE);
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (userNameField.getText().equals(userName) && passwordField.getText().equals(password) && serviceField.getText().equals(service)) {
                    JOptionPane.showMessageDialog(null, "Вы вошли в " + service, "OKAY", JOptionPane.INFORMATION_MESSAGE);
                    checkButton.setEnabled(false);
                }
                else
                    JOptionPane.showMessageDialog(null, "Неверный ввод", "NOT OKAY", JOptionPane.ERROR_MESSAGE);
            }
        });
        add(checkButton);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PasswordApp();
            }
        });
    }
}