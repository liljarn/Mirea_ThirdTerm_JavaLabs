package ru.mirea.lab15.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton buttonAdd = new JButton("ADD");
    JButton buttonSubtract = new JButton("SUBTRACT");
    JButton buttonDivide = new JButton("DIVIDE");
    JButton buttonMultiply = new JButton("MULTIPLY");
    Font fnt = new Font("Times new roman", Font.BOLD,20);
    Calculator() {
        super("Calculator");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(buttonAdd);
        add(buttonSubtract);
        add(buttonDivide);
        add(buttonMultiply);
        buttonAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1+x2), "alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonSubtract.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1-x2), "alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonDivide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1/x2), "alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonMultiply.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1*x2), "alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[]args){
        new Calculator();
    }
}