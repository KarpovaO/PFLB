package ru.pflb.string;

public class Solution6 {
    public static int toInt(String str) {
        int number = 0;
        int sign = 1;
        boolean isNegative = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0 && ch == '-') {
                isNegative = true;
                sign = -1;
                continue;
            }
            if (ch < '0' || ch > '9') {
                System.out.println("Строка не может быть преобразована в число");
                System.exit(0);
            }
            number = number * 10 + (ch - '0');
        }
        return number * sign;
    }

    public static void main(String[] args) {
        int number = toInt(args[0]);
        System.out.println(number * 2);
    }
}

