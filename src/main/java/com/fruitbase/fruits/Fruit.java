package com.fruitbase.fruits;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Fruit {
    private Freshness freshness = Freshness.FRESH;
    protected double weight;
    protected BigDecimal price;
    protected String name;

    public double getWeight() {
        return weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public boolean isFresh() {
        return freshness == Freshness.FRESH;
    }

    @Override
    public String toString() {
        return name;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

}
