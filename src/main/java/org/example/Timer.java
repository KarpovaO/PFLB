package org.example;

public class Timer {
    private final int seconds;

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
        System.out.println(minutes + ":" + remainingSeconds);
    } // я не понимаю зачем этот метод нужен

    public void start() {
        for (int i = this.seconds; i >= 0; i--) {
            System.out.println(i / 60 + ":" + (i % 60));
            waitSecond();
        }
        System.out.println("Время вышло!");
    }
}



