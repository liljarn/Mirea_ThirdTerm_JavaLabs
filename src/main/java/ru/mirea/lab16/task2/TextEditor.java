package ru.mirea.lab16.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    private JTextArea textArea;

    public TextEditor() {
        setTitle("Текстовый редактор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu formatMenu = new JMenu("Формат");
        menuBar.add(formatMenu);

        JMenu colorSubMenu = new JMenu("Цвет");
        formatMenu.add(colorSubMenu);

        JMenuItem blueItem = new JMenuItem("Синий");
        blueItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });

        JMenuItem redItem = new JMenuItem("Красный");
        redItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });

        JMenuItem blackItem = new JMenuItem("Черный");
        blackItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });

        colorSubMenu.add(blueItem);
        colorSubMenu.add(redItem);
        colorSubMenu.add(blackItem);

        JMenu fontSubMenu = new JMenu("Шрифт");
        formatMenu.add(fontSubMenu);

        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        timesNewRomanItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            }
        });

        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        msSansSerifItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 20));
            }
        });

        JMenuItem courierNewItem = new JMenuItem("Courier New");
        courierNewItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier New", Font.PLAIN, 20));
            }
        });

        fontSubMenu.add(timesNewRomanItem);
        fontSubMenu.add(msSansSerifItem);
        fontSubMenu.add(courierNewItem);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TextEditor app = new TextEditor();
                app.setVisible(true);
            }
        });
    }
}
