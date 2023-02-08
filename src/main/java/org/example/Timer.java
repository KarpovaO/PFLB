package org.example;

public class Timer {
    private int seconds;

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    public static void waitSecond() {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() < startTime + 1000) {
            // ничего не делает
        }
    }

    public void printTime() {
        int minutes = this.seconds / 60;
        int remainingSeconds = this.seconds % 60;
        System.out.printf("%02d:%02d", minutes, remainingSeconds);
        System.out.println();
    }

    public void start() {
        for (; seconds >= 0; this.seconds--) {
            printTime();
            waitSecond();
        }
        System.out.println("Время вышло!");
    }
}



