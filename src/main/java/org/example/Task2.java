package org.example;

public class Task2 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); //часы
        int n = Integer.parseInt(args[1]); //сенокосилки

        if (m <= 0 || n <= 0) {
            System.out.println("Ошибка: введенные значения должны быть больше 0!");
            return;
        }

        int lastHarvesterWorkTime = m * 60; //в минутах!
        int totalHarvestersWorkTime = lastHarvesterWorkTime; //в минутах!
        for (int i = 1; i < n; i++) {
            int nextHarvesterWorkTime = lastHarvesterWorkTime + 10;
            totalHarvestersWorkTime += nextHarvesterWorkTime;
            lastHarvesterWorkTime = nextHarvesterWorkTime;
        }

        int hours = totalHarvestersWorkTime / 60;
        int minutes = totalHarvestersWorkTime % 60;
        System.out.println("Бригада работала " + hours + " час. " + minutes + " мин.");

    }
}

