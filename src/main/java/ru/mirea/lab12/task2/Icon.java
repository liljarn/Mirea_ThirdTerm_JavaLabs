package ru.mirea.lab12.task2;

import javax.swing.*;
import java.awt.*;

public class Icon {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Icon");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 1490, 1080);

        Container c = frame.getContentPane();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("C:\\Users\\liljarn\\IdeaProjects\\gg\\res\\maxresdefault.jpg"));
        Dimension size = label.getPreferredSize();
        label.setBounds(50, 30, size.width, size.height);
        c.add(label);
        frame.setVisible(true);
    }
}
