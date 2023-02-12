package ru.pflb.string;

public class Solution5 {
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = args[0];
        if (isInteger(str)) {
            System.out.println("Строка является целым числом");
        } else System.out.println("Строка не является целым числом");
    }
}