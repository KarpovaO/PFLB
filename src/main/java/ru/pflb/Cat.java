package ru.pflb;

public class Cat extends Animal {
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

        this(age, eyesColor, weight, "Красный");
    }

    public Cat(int age, String eyesColor) {

        this(age, eyesColor, 3);
    }

    public Cat(int age) {

        this(age, "green");
    }

    public Cat() {
    }

    public Cat(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public Cat(String eyesColor, String coatColor) {
        this.eyesColor = eyesColor;
        this.coatColor = coatColor;

    }

    public Cat(String eyesColor, String coatColor, int age) {
        this.eyesColor = eyesColor;
        this.coatColor = coatColor;
        this.age = age;
    }

    public Cat(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public Cat(int age, int weight, String eyesColor) {
        this.age = age;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }


    @Override
    public String toString() {
        return " Возраст:" + age +
                " Цвет глаз:" + eyesColor +
                " Вес:" + weight +
                " Цвет шерсти:" + coatColor;

    }
}
