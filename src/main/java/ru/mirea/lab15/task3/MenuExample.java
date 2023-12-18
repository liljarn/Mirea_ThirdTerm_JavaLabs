package ru.mirea.lab15.task3;

import javax.swing.*;
import java.awt.*;

public class MenuExample extends JFrame {
    private JTextArea textArea;

    public MenuExample() {
        setTitle("Пример меню");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Файл");
        menuBar.add(fileMenu);

        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        fileMenu.add(saveMenuItem);

        JMenuItem exitMenuItem = new JMenuItem("Выйти");
        fileMenu.add(exitMenuItem);

        JMenu editMenu = new JMenu("Правка");
        menuBar.add(editMenu);

        JMenuItem copyMenuItem = new JMenuItem("Копировать");
        editMenu.add(copyMenuItem);

        JMenuItem cutMenuItem = new JMenuItem("Вырезать");
        editMenu.add(cutMenuItem);

        JMenuItem pasteMenuItem = new JMenuItem("Вставить");
        editMenu.add(pasteMenuItem);


        JMenuItem helpMenu = new JMenuItem("Справка");
        menuBar.add(helpMenu);

        JButton button1 = new JButton("Кнопка 1");

        JButton button2 = new JButton("Кнопка 2");

        textArea = new JTextArea();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2)); // Один ряд, две колонки
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        textPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        mainPanel.add(textPanel, BorderLayout.CENTER);

        add(mainPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MenuExample();
        });
    }
}