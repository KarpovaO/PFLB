package com.fruitbase.fruits.customers;

import com.fruitbase.Cargo;
import com.fruitbase.FruitBase;


public class Simulation {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        FruitBase fruitBase = new FruitBase();

        Customer[] customers = new Customer[]{new UniqueCustomer("1"), new FreshCustomer("2")};
        for (Customer customer : customers) {
            Cargo cargo = fruitBase.takeOrder(args);
            System.out.println(cargo);
            customer.takeFruits(cargo);
            customer.printPurchases();
        }


    }
}
