package ru.pflb;

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        // проверяем, были ли переданы аргументы
        if (args.length == 0) {
            System.out.println("Нет переданных аргументов");
            return;
        }
        // создаем список слов и заполняем его переданными аргументами
        List<String> words = new ArrayList<>(Arrays.asList(args));

        // выводим переданную последовательность слов
        System.out.println("Последовательность слов: " + words);

        //создаем множество для хранения уникальных слов и добавляем каждое слово в множество
        Set<String> uniqueWords = new HashSet<>(words);

        // выводим уникальные слова
        System.out.println("Уникальные слова: " + uniqueWords);

    }
}