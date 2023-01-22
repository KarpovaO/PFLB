package ru.pflb;

public abstract class Animal {
    public static String PLANET = "Земля";

    public static void testStaticMethod() {
        System.out.println("Это статическое животное");

    }

    public static void main(String[] args) {
        System.out.println(PLANET);
        Cat cat = new Cat(2);
    }
}
