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

    @Override
    public String toString() {
        return " Возраст:" + age +
                " Цвет глаз:" + eyesColor +
                " Вес:" + weight +
                " Цвет шерсти:" + coatColor;

    }

    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat(12, "зеленые", 5, "Белый"),
                new Cat(3, "Синие", 12),
                new Cat(5, "Карие"),
                new Cat(10)};


        for (Cat cat : cats)
            System.out.println(cat);

        Animal.testStaticMethod();
        Cat.testStaticMethod();
        Cat cat = new Cat(1);
        cat.testStaticMethod();

        System.out.println(Animal.PLANET);
        Animal.PLANET = "Луна";
        System.out.println(cat.PLANET);
    }
}
