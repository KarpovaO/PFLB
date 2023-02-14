package ru.pflb.array;

import java.util.Random;

public class Solution1 {
    public static void fillArray(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(19) - 9;
        }
    }

    public static void main(String[] args) {
        int[] items = new int[20];
        fillArray(items);
        for (int i : items) {
            System.out.print(i + " ");
        }
    }
}
