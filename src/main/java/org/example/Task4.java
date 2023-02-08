package org.example;

import java.util.Random;

public class Task4 {
    private final int n;
    private final Random random = new Random();

    public Task4(int n) {
        this.n = n;
    }

    public boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int nextInt(int x) {

        return random.nextInt(x);
    }

    public int generate() {
        int number;
        do {
            number = nextInt(n - 1) + 1;
        } while (!isPrime(number));
        return number;
    }

    public static void main(String[] args) {
        Task4 generator = new Task4(7);
        System.out.println(generator.generate());
    }
}
