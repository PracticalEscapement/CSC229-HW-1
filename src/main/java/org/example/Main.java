package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item("AirPods", "Electronic_Device", 250.0);
        Item item3 = new Item("Ipad", "Electronic_Device", 500.0);

        // Default Item class attributes
        System.out.println(item1.getName());
        System.out.println(item1.getCategory());
        System.out.println(item1.getCost() + "\n");
        // Item1 default attributes changed
        item1.setName("MacBook Pro");
        item1.setCategory("Computer");
        item1.setCost(2500.0);
        // New Attributes for item1
        System.out.println(item1.getName());
        System.out.println(item1.getCategory());
        System.out.println(item1.getCost() + "\n");

        // Check if different instantiated items are equal
        System.out.println(item1.equals(item2));
        System.out.println(item1.equals(item3));

        // Check if instantiated item and it's deep copy are equivalent
        Item item1Copy;
        item1Copy = item1.deepCopy();
        System.out.println(item1.equals(item1Copy));
        // Show that item1 and it's deep copy have different memory addresses
        System.out.println(item1.toString());
        System.out.println(item1Copy.toString() + "\n");

        ItemCollection itemCollection = new ItemCollection();
        itemCollection.set(0, item1);
        itemCollection.set(1, item2);
        itemCollection.set(11, item3);
        System.out.println("here");

        System.out.println(itemCollection.get(0));
        System.out.println(itemCollection.get(1));
        System.out.println(itemCollection.get(2));
        System.out.println(itemCollection.get(9));
        System.out.println(itemCollection.get(19));

        // testing resize method
            // Default size of array is 10, then is resized to 5
            // All the original values of the array have been retained up to the resize value.
        System.out.println(itemCollection.getSize());
        System.out.println(Arrays.toString(itemCollection.itemArr));

        itemCollection.reSize(5);
        System.out.println(itemCollection.getSize());
        System.out.println(Arrays.toString(itemCollection.itemArr));

        itemCollection.reSize(7);
        System.out.println(itemCollection.getSize());
        System.out.println(Arrays.toString(itemCollection.itemArr));
            // Last two values are default item values because the array was made larger.
        System.out.println(itemCollection.get(6).getName());



    }
}