package ru.pflb;

import static ru.pflb.Animal.testStaticMethod;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat(12, "зеленые", 5, "Белый"),
                new Cat(3, "Синие", 12),
                new Cat(5, "Карие"),
                new Cat(10),
                new Cat(),
                new Cat("Темные"),
                new Cat("Серые", "Черный"),
                new Cat("Темные", "Черный", 4),
                new Cat(5, 5),
                new Cat(3, 2, "Голубые")};
        for (Cat cat : cats)
            System.out.println(cat);

        testStaticMethod();
        testStaticMethod();
        testStaticMethod();

        System.out.println(Animal.planet);
        Animal.planet = "Луна";
        System.out.println(Animal.planet);


        System.out.println(Summa.sum(1, 2));
        System.out.println(Summa.sum(1, 2, 3));
        System.out.println(Summa.sum(1.5, 2.5));
        System.out.println(Summa.sum(1.5, 2.5, 3.5));
        System.out.println(Summa.sum(Integer.MAX_VALUE, 2.5, 3.5));
        System.out.println(Summa.sum(Integer.valueOf(1), Integer.valueOf(2)));


    }
}
