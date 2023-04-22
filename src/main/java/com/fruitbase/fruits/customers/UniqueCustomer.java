package com.fruitbase.fruits.customers;

import com.fruitbase.Cargo;
import com.fruitbase.fruits.Fruit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueCustomer extends Customer {

    UniqueCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(Cargo cargo) {
        Set<Fruit> uniqueFruits = new HashSet<>();
        for (Fruit f : new ArrayList<>(cargo.getFruits())) {
            if (uniqueFruits.add(f)) {
                cargo.removeFruit(f);
            }
        }
        purchases = new ArrayList<>(uniqueFruits);
    }

}
