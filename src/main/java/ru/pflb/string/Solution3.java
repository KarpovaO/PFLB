package ru.pflb.string;

public class Solution3 {
    public static void main(String[] args) {
        String inputString = args[0];
        StringBuilder outputString = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar == '0') {
                outputString.append('1');
            } else if (currentChar == '1') {
                outputString.append('0');
            } else {
                outputString.append(currentChar);
            }
        }
        System.out.println(outputString);
    }
}

