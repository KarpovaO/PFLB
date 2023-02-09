package org.example;

public class Task3 {
    public static void snakePrint(int n, int col) {
        if (n >= 1 && col > 0) {
            int[] array = new int[col];
            boolean leftToRight = true;
            for (int i = 1; i <= n; ) {

                //формируем строку - заполняем массив
                for (int j = 0; j < col; j++) {
                    if (leftToRight) {
                        //заполняем массив слева направо
                        array[j] = i++;
                    } else {
                        //заполняем массив справаа налево
                        array[array.length - j - 1] = i++;
                    }
                }
                //печатаем строку из массива
                for (int k : array) {
                    if (k <= n)
                        System.out.print(k);
                    System.out.print(" ");
                }
                //переходим к следующей строке
                System.out.println();
                //меняем направление движения змейки
                leftToRight = !leftToRight;
            }
        } else System.out.println("ошибка");
        return;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // максимальное число
        int col = Integer.parseInt(args[1]); // количество цифр в одной строке
        snakePrint(n, col);

    }
}