package ru.mirea.lab14.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PricePattern {
    public static void main(String[] args) {
        String priceLine = "25.98 USD, 44 ERR, 0.004 EU, 15 RUB, desyat rybley, 10 РУБ";
        Pattern pattern = Pattern.compile("\\d+(\\.\\d{2}) (RUB|USD|EU)");
        Pattern pattern2 = Pattern.compile("\\d+ (RUB|USD|EU)");
        Matcher matcher = pattern2.matcher(priceLine);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
