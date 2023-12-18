package ru.mirea.lab15.task2;


import javax.swing.*;
import java.awt.*;

public class CountryMenu extends JFrame {
    JComboBox<String> comboBox = new JComboBox<>();
    JTextArea information = new JTextArea(10, 30);

    public CountryMenu() {
        super("CountryInformation");
        setLayout(new FlowLayout());
        setSize(400,400);

        comboBox.addItem("Australia");
        comboBox.addItem("China");
        comboBox.addItem("England");
        comboBox.addItem("Russia");
        add(comboBox);

        JScrollPane scrollPane = new JScrollPane(information);
        scrollPane.setSize(300, 200);
        add(scrollPane);

        // Настройка JTextArea
        information.setEditable(false);
        information.setWrapStyleWord(true);
        information.setLineWrap(true);

        comboBox.addActionListener(e -> {
            String selectedOption = (String) comboBox.getSelectedItem();
            switch (selectedOption) {
                case "Australia":
                    information.setText("Australia: Australia is known for its stunning landscapes, diverse wildlife, and beautiful beaches, making it a popular destination for nature enthusiasts and travelers worldwide.");
                    break;
                case "England":
                    information.setText("England: England, with its rich history and cultural heritage, is famous for iconic landmarks like Big Ben and the Tower of London, as well as its contributions to literature, including works by William Shakespeare and Charles Dickens.");
                    break;
                case "China":
                    information.setText("China: China, the world's most populous country, boasts a blend of ancient traditions and modern innovations. It is renowned for its Great Wall, the Terracotta Army, and its global influence in areas like technology and trade.");
                    break;
                case "Russia":
                    information.setText("Russia: Russia, with its vast landmass spanning Eurasia, is celebrated for its historical cities like Moscow and St. Petersburg, as well as its unique cultural contributions in music, literature, and ballet.");
                    break;
                default:
                    break;
            }
        });
        comboBox.setSelectedItem("Australia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryMenu();
    }
}
