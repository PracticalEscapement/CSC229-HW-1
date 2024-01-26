package org.example;

import java.util.Objects;

public class Item {
    private String name;
    private String category;
    private double cost;

    // Default Constructor
    public Item() {
        name = "Laptop";
        category = "Electronic_Device";
        cost = 1000.0;
    }

    // Regular Constructor
    public Item(String name, String category, double cost) {
        this.name = name;
        this.category = category;
        this.cost = cost;
    }

    // Deep copy constructor
    public Item(Item item) {
        this.name = item.getName();
        this.category = item.getCategory();
        this.cost = item.getCost();
    }

    // Deep Copy Method
    public Item deepCopy() {
        return new Item(name, category, cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(cost, item.cost) == 0 && Objects.equals(name, item.name) && Objects.equals(category, item.category);
    }

}
