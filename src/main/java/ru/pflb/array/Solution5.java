package ru.pflb.array;

import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;


public class Solution5 {

    public static void main(String[] args) {
        Random random = new Random();

        int maxRows = 5;
        int maxColumns = 7;

        //количество строк рандом: 1-5
        int rows = random.nextInt(maxRows) + 1;
        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {
            //количество столбцов рандом: 1-7
            int columns = random.nextInt(maxColumns) + 1;
            arr[i] = new int[columns];

            for (int j = 0; j < columns; j++) {
                arr[i][j] = random.nextInt(19) - 9;
            }
        }

        //сумма строк
        int[] sums = new int[rows];
        Integer[] rowIndexes = new Integer[rows];
        for (int i = 0; i < arr.length; i++) {
            sums[i] = sum(arr[i]);
            rowIndexes[i] = i;
        }

        System.out.println("Before sort");
        for (int rowIndex : rowIndexes) {
            int[] row = arr[rowIndex];
            System.out.println(Arrays.toString(row) + ", Sum = " + sums[rowIndex]);
        }

        Arrays.sort(rowIndexes, new Comparator<Integer>() {
            public int compare(Integer row1, Integer row2) {
                Integer sum1 = sums[row1];
                Integer sum2 = sums[row2];
                return -sum1.compareTo(sum2);
            }
        });

        System.out.println();

        System.out.println("After sort");
        for (int rowIndex : rowIndexes) {
            int[] row = arr[rowIndex];
            System.out.println(Arrays.toString(row) + ", Sum = " + sums[rowIndex]);
        }
    }

    static int sum(int[] arr) {
        int result = 0;
        for (int j : arr) {
            result += j;
        }
        return result;
    }
}