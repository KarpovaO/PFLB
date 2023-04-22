package com.fruitbase.fruits.customers;

import com.fruitbase.Cargo;
import com.fruitbase.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Customer {
    protected ArrayList<Fruit> purchases;
    protected String name;


    Customer(String name) {
        this.purchases = new ArrayList<Fruit>();
        this.name = name;
    }

    public abstract void takeFruits(Cargo cargo);

    public void printPurchases() {
        for (Fruit f : purchases) {
            System.out.println(f);
        }
    }
}

