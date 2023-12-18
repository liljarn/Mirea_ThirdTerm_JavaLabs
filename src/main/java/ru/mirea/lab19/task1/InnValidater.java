package ru.mirea.lab19.task1;

public class InnValidater {
    private static final String FULL_NAME = "Иванов Иван Иванович";
    private static final long INN = 783000229L;

    public static void main(String[] args) {
        try {
            isValidInn(Long.toString(INN));
        } catch (InvalidInnException e) {
            System.err.println("Ошибка: " + e.getMessage());
            System.out.println("ИНН " + INN + " недействителен для клиента " + FULL_NAME);
        }
    }

    public static void isValidInn(String inn) {
        if (inn == null || !inn.matches("\\d{10}")) {
            throw new InvalidInnException("Недействительный ИНН: " + inn);
        }
        System.out.println("ИНН " + inn + " действителен для клиента " + FULL_NAME);
    }
}