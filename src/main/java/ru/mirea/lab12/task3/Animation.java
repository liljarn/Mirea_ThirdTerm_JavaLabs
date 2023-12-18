package ru.mirea.lab12.task3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class
Animation extends JPanel {
    BufferedImage image;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 1080);
        Animation panel = new Animation();
        panel.setPreferredSize( new Dimension(1280,1080));
        frame.getContentPane().add(panel);
        int x = 0;
        frame.pack();
        frame.setVisible(true);
        while(true) {
            panel.image = ImageIO.read(new File("C:\\Users\\liljarn\\IdeaProjects\\gg\\res\\" + x % 3 + ".png"));
            x++;
            frame.repaint();
            Thread.sleep(500);
        }

    }
}