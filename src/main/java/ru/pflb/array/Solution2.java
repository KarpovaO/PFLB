package ru.pflb.array;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы не переданы.");
            return;
        }
        List<String> maxWords = new ArrayList<>();
        int maxLength = 0;
        for (String word : args) {
            if (!word.matches("[a-z0-9]+")) {
                System.out.println("Ошибка: слова должны состоять только из строчных латинских букв и цифр.");
                return;
            }
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxWords.clear();
            }
            if (word.length() == maxLength) {
                maxWords.add(word);
            }
        }
        for (String word : maxWords) {
            System.out.print(word + " ");
        }
    }
}




