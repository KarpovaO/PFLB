package com.fruitbase;

import com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.ArrayList;

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

    void addFruit(Fruit fruit) {

        fruits.add((fruit));
    }
}
