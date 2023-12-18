package ru.mirea.lab7.task5;

public class ProcessString implements Stringable{

    @Override
    public int length(String string) {
        int length = 0;
        for (char c : string.toCharArray()) {
            length++;
        }
        return length;
    }

    @Override
    public String oddSubString(String string) {
        String oddSubString = "";
        int length = length(string);
        for (int i = 0; i < length; i += 2) {
            oddSubString += string.substring(i, i+1);
        }
        return oddSubString;
    }

    @Override
    public String reverse(String string) {
        String reverse = "";
        int length = length(string);
        for (int i = length-1; i >= 0; i--) {
            reverse += string.substring(i, i+1);
        }
        return reverse;
    }
}
