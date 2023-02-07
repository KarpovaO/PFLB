package ru.pflb;

public class Summa {

    int a, b, c;
    double x, y, z;

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(int a, int b, int c) {
        return sum(a, b) + c;

    }

    public static double sum(double x, double y) {

        return x + y;
    }

    public static double sum(double x, double y, double z) {
        return sum(x, y) + z;
    }

    public static double sum(int a, double y, double z) {
        return a + y + z;
    }

    //        public double sum(int a, int b) {
//        return a + b;
//    }
    public static double sum(Integer a, Integer b) {
        return a + b;
    }

}
