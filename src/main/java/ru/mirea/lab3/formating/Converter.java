package ru.mirea.lab3.formating;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    final static public String CHINA = "CHINA";
    final static public String US = "US";
    final static public String FRANCE = "FRANCE";

    final static public NumberFormat CHINA_FORMAT = NumberFormat.getCurrencyInstance(Locale.CHINA);
    final static public NumberFormat US_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
    final static public NumberFormat FRANCE_FORMAT = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    public static double convert(String country, String newCountry, double price) {
        double newPrice = 0.0;
        switch (newCountry) {
            case CHINA:
                if (country.equals(US))
                    newPrice = price * 0.14;
                if (country.equals(FRANCE))
                    newPrice = price * 0.13;
                break;
            case US:
                if (country.equals(CHINA))
                    newPrice = price * 7.29;
                if (country.equals(FRANCE))
                    newPrice = price * 0.93;
                break;
            case FRANCE:
                if (country.equals(US))
                    newPrice = price * 1.07;
                if (country.equals(CHINA))
                    newPrice = price * 7.72;
                break;
        }
        return newPrice;
    }

    public static NumberFormat getFormat (String newCountry) {
        switch (newCountry) {
            case CHINA:
                return CHINA_FORMAT;
            case US:
                return US_FORMAT;
            case FRANCE:
                return FRANCE_FORMAT;
            default:
                return null;
        }
    }
}
