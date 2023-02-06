package org.example;

public class Calculator {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mult(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;

    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        char z = args[1].charAt(0);
        if (y == 0) {
            System.out.println("операция не может быть выполнена");
            System.exit(0);
        } else
            switch (z) {
                case ('+'):
                    System.out.println(x + "+" + y + "=" + add(x, y));
                    break;
                case ('-'):
                    System.out.println(x + "-" + y + "=" + sub(x, y));
                    break;

                case ('*'):
                    System.out.println(x + "*" + y + "=" + mult(x, y));
                    break;
                case ('/'):
                    System.out.println(x + "/" + y + "=" + divide(x, y));
                default:
                    System.out.println("такого знака нет. Используйте: +,-,*,/ ");
                    break;
            }

    }

}
