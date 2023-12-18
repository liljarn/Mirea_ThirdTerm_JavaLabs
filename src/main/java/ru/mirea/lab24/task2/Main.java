package ru.mirea.lab24.task2;

public class Main {
    public static void main(String[] args) {
        // Создаем фабрики стульев
        ChairFactory victorianChairFactory = new VictorianChairFactory();
        ChairFactory multifunctionalChairFactory = new MultifunctionalChairFactory();
        ChairFactory magicChairFactory = new MagicChairFactory();

        // Создаем клиента
        Client client = new Client();

        // Клиент садится на стулья разных типов
        client.sit(victorianChairFactory.createChair());
        client.sit(multifunctionalChairFactory.createChair());
        client.sit(magicChairFactory.createChair());
    }
}
