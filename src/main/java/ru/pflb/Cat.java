package ru.pflb;

public class Cat {
    int age;
    String eyesColor;
    int weight;
    String coatColor;

    public Cat(int age, String eyesColor, int weight, String coatColor) {
        this.age = age;
        this.eyesColor = eyesColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(int age, String eyesColor, int weight) {
        this(age, eyesColor, weight, "gray");
    }

    public Cat(int age, String eyesColor) {
        this(age, eyesColor, 3);
    }

    public Cat(int age) {
        this(age, "green");
    }

    @Override
    public String toString() {
        return " Возраст: " + age +
                " Цвет глаз:" + eyesColor +
                " Вес: " + weight +
                " Цвет шерсти:" + coatColor;

    }
}