package com.fruitbase;

import com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cargo {
    ArrayList<Fruit> fruits = new ArrayList<>();


    public int getWeigh() {
        int weight = 0;
        for (Fruit f : fruits) {
            weight += f.getWeight();
        }
        return weight;
    }

    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.ZERO;
        for (int i = 0; i < fruits.toArray().length; i++) {
            price = price.add(fruits.get(i).getPrice());
        }
        return price;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public Fruit removeFruit(Fruit fruit) {
       if (fruit == null)
           return null;

        int i = fruits.indexOf(fruit);
        if (i == -1) {
            return null;
        }

        Fruit f = fruits.get(i);
        fruits.remove(i);
        return f;
    }

    void addFruit(Fruit fruit) {
        fruits.add((fruit));
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "fruits=" + fruits +
                '}';
    }
}
