package ru.pflb;

public class Summa {

    int a, b, c;
    double x, y, z;

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(int a, int b, int c) {
        double r = a + b + c;
        return r;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static double sum(double x, double y, double z) {
        return x + y + z;
    }

    public static double sum(int a, double y, double z) {
        double r = a + y + z;
        return r;
    }

    //        public double sum(int a, int b) {
//        return a + b;
//    }
    public static double sum(Integer a, Integer b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1.5, 2.5));
        System.out.println(sum(1.5, 2.5, 3.5));
        System.out.println(sum(Integer.MAX_VALUE, 2.5, 3.5));
        System.out.println(sum(new Integer(1), new Integer(2)));
    }
}
