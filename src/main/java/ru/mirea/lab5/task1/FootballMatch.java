package ru.mirea.lab5.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatch {
    public int real = 0;
    public int milan = 0;
    public FootballMatch() {
        frame();
    }

    public void frame() {

        JFrame frame = new JFrame("Footbal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);

        JPanel panel= new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(1000, 1000));

        JButton buttonMilan = new JButton("AC Milan");
        panel.add(buttonMilan);

        JButton buttonReal = new JButton("Real Madrid");
        panel.add(buttonReal);

        JLabel score = new JLabel("Result: " + milan + "X" + real, JLabel.CENTER);
        score.setForeground(Color.WHITE);
        panel.add(score);

        JLabel lastScorer = new JLabel("Last Scorer: N/A",JLabel.CENTER);
        lastScorer.setForeground(Color.WHITE);
        panel.add(lastScorer);

        JLabel winner = new JLabel("Winner: DRAW",JLabel.CENTER);
        winner.setForeground(Color.WHITE);
        panel.add(winner);

        buttonMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                milan++;
                score.setText("Result: " + milan + "X" + real);
                lastScorer.setText("Last Scorer: AC Milan");
                if (milan > real)
                    winner.setText("Winner: AC Milan");
                else if (milan == real)
                    winner.setText("Winner: DRAW");
                else
                    winner.setText("Winner: Real Madrid");
            }
        });

        buttonReal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                real++;
                score.setText("Result: " + milan + "X" + real);
                lastScorer.setText("Last Scorer: Real Madrid");
                if (milan > real)
                    winner.setText("Winner: AC Milan");
                else if (milan == real)
                    winner.setText("Winner: DRAW");
                else
                    winner.setText("Winner: Real Madrid");
            }
        });



        frame.getContentPane().add(panel);
        frame.pack();

        frame.setVisible(true);
    }

    public static void main(String args[]) {
       new FootballMatch();
    }
}

