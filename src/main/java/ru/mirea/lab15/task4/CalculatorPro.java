package ru.mirea.lab15.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorPro extends JFrame {
    JTextArea textArea = new JTextArea(10, 30);
    JButton buttonAdd = new JButton("+");
    JButton buttonSubtract = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    StringBuilder stringBuilder = new StringBuilder();
    boolean operationSelected = false;

    public CalculatorPro() {
        setSize(400, 400);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        buttonPanel.add(buttonSeven);
        buttonPanel.add(buttonEight);
        buttonPanel.add(buttonNine);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(buttonFour);
        buttonPanel.add(buttonFive);
        buttonPanel.add(buttonSix);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(buttonOne);
        buttonPanel.add(buttonTwo);
        buttonPanel.add(buttonThree);
        buttonPanel.add(buttonSubtract);
        buttonPanel.add(buttonZero);
        buttonPanel.add(buttonPoint);
        buttonPanel.add(buttonEqual);
        buttonPanel.add(buttonAdd);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        textPanel.add(textArea, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(textPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    stringBuilder.append(c);
                }
                if (c == KeyEvent.VK_BACK_SPACE) {
                    if (stringBuilder.charAt(stringBuilder.length() - 1) == '*' ||
                            stringBuilder.charAt(stringBuilder.length() - 1) == '/' ||
                            stringBuilder.charAt(stringBuilder.length() - 1) == '+' ||
                            stringBuilder.charAt(stringBuilder.length() - 1) == '-') {
                        operationSelected = false;
                    }
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
                if (c == '*' || c == '/' || c == '+' || c == '-') {
                    operationSelected = true;
                    stringBuilder.append(c);
                }
                if (c == '\n') {
                    if (!operationSelected) {
                        Pattern numberPattern = Pattern.compile("^\\d+(\\.\\d+)?");
                        Matcher numberMatcher = numberPattern.matcher(stringBuilder.toString());
                        if (numberMatcher.find())
                            JOptionPane.showMessageDialog(null, "Результат: " + stringBuilder.toString(), "RESULT", JOptionPane.INFORMATION_MESSAGE);
                        else
                            JOptionPane.showMessageDialog(null, "Выражение написано неверно.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        stringBuilder.setLength(0);
                        textArea.setText("");
                    } else {
                        Pattern numberPattern = Pattern.compile("\\d+(\\.\\d+)?");
                        Matcher numberMatcher = numberPattern.matcher(stringBuilder.toString());
                        Pattern operationPattern = Pattern.compile("(\\+|-|/|\\*)");
                        Matcher operationMatcher = operationPattern.matcher(stringBuilder.toString());
                        String number1 = null;
                        if (numberMatcher.find())
                            number1 = numberMatcher.group();
                        String number2 = null;
                        if (numberMatcher.find())
                            number2 = numberMatcher.group();
                        String operation = null;
                        if (operationMatcher.find())
                            operation = operationMatcher.group();
                        if (number1 == null || number2 == null) {
                            JOptionPane.showMessageDialog(null, "Выражение написано неверно.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        } else {
                            switch (operation) {
                                case "+":
                                    JOptionPane.showMessageDialog(null, "Результат: " + (Double.parseDouble(number1) + Double.parseDouble(number2)), "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                case "-":
                                    JOptionPane.showMessageDialog(null, "Результат: " + (Double.parseDouble(number1) - Double.parseDouble(number2)), "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                case "/":
                                    if (Double.parseDouble(number2) == 0) {
                                        JOptionPane.showMessageDialog(null, "Нельзя делить на ноль!", "ERROR", JOptionPane.ERROR_MESSAGE);
                                        break;
                                    }
                                    JOptionPane.showMessageDialog(null, "Результат: " + (Double.parseDouble(number1) / Double.parseDouble(number2)), "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                case "*":
                                    JOptionPane.showMessageDialog(null, "Результат: " + (Double.parseDouble(number1) * Double.parseDouble(number2)), "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Выражение написано неверно.", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        operationSelected = false;
                        stringBuilder.setLength(0);
                        textArea.setText("");
                    }
                }
            }
        });

        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stringBuilder.append("0");
                textArea.setText(stringBuilder.toString());
            }
        });

        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stringBuilder.append("1");
                textArea.setText(stringBuilder.toString());
            }
        });

        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stringBuilder.append("2");
                textArea.setText(stringBuilder.toString());
            }
        });

        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stringBuilder.append("3");
                textArea.setText(stringBuilder.toString());
            }
        });

        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stringBuilder.append("4");
                textArea.setText(stringBuilder.toString());
            }
        });

        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stringBuilder.append("5");
                textArea.setText(stringBuilder.toString());
            }
        });

        buttonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stringBuilder.append("6");
                textArea.setText(stringBuilder.toString());
            }
        });

        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stringBuilder.append("7");
                textArea.setText(stringBuilder.toString());
            }
        });

        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stringBuilder.append("8");
                textArea.setText(stringBuilder.toString());
            }
        });

        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stringBuilder.append("9");
                textArea.setText(stringBuilder.toString());
            }
        });

        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stringBuilder.append(".");
                textArea.setText(stringBuilder.toString());
            }
        });

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (operationSelected) {
                    JOptionPane.showMessageDialog(null, "Калькулятор не настолько умный!", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    operationSelected = true;
                    stringBuilder.append("+");
                    textArea.setText(stringBuilder.toString());
                }
            }
        });

        buttonSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (operationSelected) {
                    JOptionPane.showMessageDialog(null, "Калькулятор не настолько умный!", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    operationSelected = true;
                    stringBuilder.append("-");
                    textArea.setText(stringBuilder.toString());
                }
            }
        });

        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (operationSelected) {
                    JOptionPane.showMessageDialog(null, "Калькулятор не настолько умный!", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    operationSelected = true;
                    stringBuilder.append("/");
                    textArea.setText(stringBuilder.toString());
                }
            }
        });

        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (operationSelected) {
                    JOptionPane.showMessageDialog(null, "Мой калькулятор не настолько умный :(", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    operationSelected = true;
                    stringBuilder.append("*");
                    textArea.setText(stringBuilder.toString());
                }
            }
        });

        buttonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!operationSelected) {
                    Pattern numberPattern = Pattern.compile("^\\d+(\\.\\d+)?");
                    Matcher numberMatcher = numberPattern.matcher(stringBuilder.toString());
                    if (numberMatcher.find())
                        JOptionPane.showMessageDialog(null, "Результат: " + stringBuilder.toString(), "RESULT", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Выражение написано неверно.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    stringBuilder.setLength(0);
                    textArea.setText("");
                } else {
                    Pattern numberPattern = Pattern.compile("\\d+(\\.\\d+)?");
                    Matcher numberMatcher = numberPattern.matcher(stringBuilder.toString());
                    Pattern operationPattern = Pattern.compile("(\\+|-|/|\\*)");
                    Matcher operationMatcher = operationPattern.matcher(stringBuilder.toString());
                    String number1 = null;
                    if (numberMatcher.find())
                        number1 = numberMatcher.group();
                    String number2 = null;
                    if (numberMatcher.find())
                        number2 = numberMatcher.group();
                    String operation = null;
                    if (operationMatcher.find())
                        operation = operationMatcher.group();
                    if (number1 == null || number2 == null) {
                        JOptionPane.showMessageDialog(null, "Выражение написано неверно.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        switch (operation) {
                            case "+":
                                JOptionPane.showMessageDialog(null, "Результат: " + (Double.parseDouble(number1) + Double.parseDouble(number2)), "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case "-":
                                JOptionPane.showMessageDialog(null, "Результат: " + (Double.parseDouble(number1) - Double.parseDouble(number2)), "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case "/":
                                if (Double.parseDouble(number2) == 0) {
                                    JOptionPane.showMessageDialog(null, "Нельзя делить на ноль!", "ERROR", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                                JOptionPane.showMessageDialog(null, "Результат: " + (Double.parseDouble(number1) / Double.parseDouble(number2)), "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case "*":
                                JOptionPane.showMessageDialog(null, "Результат: " + (Double.parseDouble(number1) * Double.parseDouble(number2)), "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Выражение написано неверно.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    operationSelected = false;
                    stringBuilder.setLength(0);
                    textArea.setText("");
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorPro();
    }
}