package ru.mirea.lab13.task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkWithWords {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader
                    ("src/main/java/ru/mirea/lab13/task6/input.txt"));
            String line;
            List<String> words = new ArrayList<>();

            while ((line = bufferedReader.readLine()) != null) {
                String[] wordArray = line.split(" ");
                Collections.addAll(words, wordArray);
            }
            bufferedReader.close();

            String result = getLine(words);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getLine(List<String> words) {
        if (words == null || words.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(words.get(0));
        List<String> remainingWords = new ArrayList<>(words.subList(1, words.size()));

        while (!remainingWords.isEmpty()) {
            boolean found = false;

            for (int i = 0; i < remainingWords.size(); i++) {
                String currentWord = remainingWords.get(i);
                char lastChar = Character.toLowerCase(result.charAt(result.length() - 1));
                char firstChar = Character.toLowerCase(currentWord.charAt(0));

                if (lastChar == firstChar) {
                    result.append(" ").append(currentWord);
                    remainingWords.remove(i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                break;
            }
        }

        return result.toString();
    }
}