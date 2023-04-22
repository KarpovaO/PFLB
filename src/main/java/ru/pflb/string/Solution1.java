package ru.pflb.string;

public class Solution1 {
    static String str = "Циклом называется многократное выполнение одних и тех же действий.";

    public static void main(String[] args) {
        String symbol = args[0];
        int index = str.indexOf(symbol);
        System.out.println(str.substring(0, index).replace(" ", "").length());
    }
}
