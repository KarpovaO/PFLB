package ru.pflb.string;

public class Solution4 {
    public static void main(String[] args) {
        String input = args[0];
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                output.append(input.charAt(i));
            }
        }
        System.out.println(output);
    }
}
