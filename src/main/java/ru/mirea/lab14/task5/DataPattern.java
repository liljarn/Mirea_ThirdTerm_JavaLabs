package ru.mirea.lab14.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataPattern {
    public static void main(String[] args) {
        String data1 = "01/12/2022";
        String data2 = "45/10/2022";
        String data3 = "01/12/1899";
        String data4 = "01/12/10000";
        String data5 = "01-12-2022";
        String data6 = "1/12/2022";
        String data7 = "29/02/2004";
        Pattern pattern = Pattern.compile("(0\\d|1\\d|2\\d|3[0-1])/(0\\d|1[0-2])/(19\\d\\d|[2-9]\\d\\d\\d)");
        Matcher matcher = pattern.matcher(data1);
        System.out.println(data1 + " " + matcher.find());
        matcher.reset(data2);
        System.out.println(data2 + " " + matcher.find());
        matcher.reset(data3);
        System.out.println(data3 + " " + matcher.find());
        matcher.reset(data4);
        System.out.println(data4 + " " + matcher.find());
        matcher.reset(data5);
        System.out.println(data5 + " " + matcher.find());
        matcher.reset(data6);
        System.out.println(data6 + " " + matcher.find());
        matcher.reset(data7);
        System.out.println(data7 + " " + matcher.find());
    }
}