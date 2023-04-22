package ru.pflb.string;

public class Solution2 {
    public static void main(String[] args) {
        String filePath = args[0];
        int lastSlashIndex = filePath.lastIndexOf("/");
        int lastBackSlashIndex = filePath.lastIndexOf("\\");
        int lastIndex = Math.max(lastSlashIndex, lastBackSlashIndex);
        if (lastIndex == -1) {
            System.out.println("Введен некорректный путь до файла.");
            return;
        }
        String path = filePath.substring(0, lastIndex + 1);
        String fileName = filePath.substring(lastIndex + 1);
        if (fileName.length() == 0) {
            System.out.println("Введен некорректный путь до файла.");
            return;
        }
        System.out.println("Путь: " + path);
        System.out.println("Имя файла: " + fileName);
    }
}