package ru.mirea.lab13.task5;

public class NumberFormat {

    public static String formatNumber(String number) {

        if (number.startsWith("+") && number.length() >= 12 && number.length() <= 14) {
            String countryCode = null;
            String firstThreeDigits = null;
            String secondThreeDigits = null;
            String firstFourDigits = null;
            if (number.length() == 12) {
                countryCode = number.substring(1, 2);
                firstThreeDigits = number.substring(2, 5);
                secondThreeDigits = number.substring(5, 8);
                firstFourDigits = number.substring(8);
            }
            if (number.length() == 13) {
                countryCode = number.substring(1, 3);
                firstThreeDigits = number.substring(3, 6);
                secondThreeDigits = number.substring(6, 9);
                firstFourDigits = number.substring(9);
            }
            if (number.length() == 14) {
                countryCode = number.substring(1, 4);
                firstThreeDigits = number.substring(4, 7);
                secondThreeDigits = number.substring(7, 10);
                firstFourDigits = number.substring(10);
            }

            return String.format("+%s%s-%s-%s", countryCode, firstThreeDigits, secondThreeDigits, firstFourDigits);
        } else if (number.startsWith("8") && number.length() == 11) {
            String firstThreeDigits = number.substring(1, 4);
            String secondThreeDigits = number.substring(4, 7);
            String lastFourDigits = number.substring(7);
            return String.format("+7%s-%s-%s", firstThreeDigits, secondThreeDigits, lastFourDigits);
        } else {
            return "Неверный формат номера";
        }
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655"; // россия
        String phoneNumber2 = "+104289652211"; // сша
        String phoneNumber3 = "+2344289652211"; // нигерия
        String phoneNumber4 = "89175655655";
        String phoneNumber5 = "1234567890";

        System.out.println(formatNumber(phoneNumber1));
        System.out.println(formatNumber(phoneNumber2));
        System.out.println(formatNumber(phoneNumber3));
        System.out.println(formatNumber(phoneNumber4));
        System.out.println(formatNumber(phoneNumber5));
    }
}
