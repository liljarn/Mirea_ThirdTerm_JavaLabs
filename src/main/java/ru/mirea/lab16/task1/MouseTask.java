package ru.mirea.lab16.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseTask extends JFrame {
    public MouseTask() {
        setTitle("Макет границ с обработкой событий мыши");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);

        setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.YELLOW);
        northPanel.setPreferredSize(new Dimension(200, 200));
        northPanel.add(new JLabel("North"))
        ;
        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.GREEN);
        westPanel.setPreferredSize(new Dimension(200, 200));
        westPanel.add(new JLabel("West"));

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.BLUE);
        centerPanel.setPreferredSize(new Dimension(200, 200));
        centerPanel.add(new JLabel("Center"));

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.PINK);
        eastPanel.setPreferredSize(new Dimension(200, 200));
        eastPanel.add(new JLabel("East"));

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.ORANGE);
        southPanel.setPreferredSize(new Dimension(200, 200));
        southPanel.add(new JLabel("South"));

        add(northPanel, BorderLayout.NORTH);
        add(westPanel, BorderLayout.WEST);
        add(centerPanel, BorderLayout.CENTER);
        add(eastPanel, BorderLayout.EAST);
        add(southPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(MouseTask.this, "Добро пожаловать в САО");
            }
        });

        westPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(MouseTask.this, "Добро пожаловать в ЗАО");
            }
        });

        centerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(MouseTask.this, "Добро пожаловать в ЦАО");
            }
        });

        eastPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(MouseTask.this, "Добро пожаловать в ВАО");
            }
        });

        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(MouseTask.this, "Добро пожаловать в ЮАО");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MouseTask();
            }
        });
    }
}