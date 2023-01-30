package org.example;

public class Task1 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        if (m > n) {
            int e = m;
            m = n;
            n = e;
            for (int x = m; x <= n; x++) {
                if (x % 3 == 0 && x % 5 != 0)
                    System.out.println(x);
            }
        }
    }
}