package org.example;

public class MainForTimer {
    public static void main(String[] args) {
        int seconds = Integer.parseInt(args[0]);
        if (seconds < 0) {
            System.out.println("Введите кличество секунд больше или = 0");
            return;
        }
        Timer timer = new Timer(seconds);
        timer.start();
    }
}
