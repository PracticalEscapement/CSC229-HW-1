package org.example;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item("Laptop", "Electronic_Device", 1000.0);
        Item item3 = new Item("Ipad", "Electronic_Device", 500.0);

        System.out.println(item1.equals(item2));
        System.out.println(item1.equals(item3));
    }
}