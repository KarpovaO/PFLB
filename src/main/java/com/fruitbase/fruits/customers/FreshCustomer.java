package com.fruitbase.fruits.customers;

import com.fruitbase.Cargo;
import com.fruitbase.fruits.Fruit;

import java.util.ArrayList;

public class FreshCustomer extends Customer {
    FreshCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(Cargo cargo) {
        ArrayList<Fruit> freshFruits = new ArrayList<>();
        for (Fruit f : new ArrayList<>(cargo.getFruits())) {
            if (f.isFresh()) {
                freshFruits.add(f);
                cargo.removeFruit(f);
            }
        }
        purchases = freshFruits;
    }
}
