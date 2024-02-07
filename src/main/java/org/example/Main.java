package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item("AirPods", "Audio", 250.0);
        Item item3 = new Item("Ipad", "Electronic_Device", 500.0);
        Item item4 = new Item("MacBook_Pro", "Laptop", 2500.0);

        // Default Item class attributes
        System.out.println(item1.getName());
        System.out.println(item1.getCategory());
        System.out.println(item1.getCost() + "\n");

        // Item1 default attributes changed
        item1.setName("IMac");
        item1.setCategory("Computer");
        item1.setCost(1500.0);

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

        // Adding items to the ItemCollection using the set method.
        ItemCollection itemCollection = new ItemCollection();
        itemCollection.set(0, item1);
        itemCollection.set(1, item2);
        itemCollection.set(2, item3);
        itemCollection.set(3, item4);
            // The index of 11 is out of bounds, so the method doesn't add anything to the array.
        itemCollection.set(11, item3);

        // getting values from the ItemCollection
        System.out.println(itemCollection.get(0));
        System.out.println(itemCollection.get(1));
        System.out.println(itemCollection.get(2));
        System.out.println(itemCollection.get(9));
        System.out.println(itemCollection.get(19));

        // ItemCollection copy constructor
        ItemCollection icc = new ItemCollection(itemCollection);

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

        // ItemCollection deep copy method
            // I looped through all items in the item collections and printed the names to
            // the screen to show that they method correctly copied all items.
        ItemCollection itemCollectionCopy = itemCollection.deepCopy();
        for (int i=0; i< itemCollectionCopy.getSize(); i++) {
            System.out.print(itemCollectionCopy.get(i).getName() + " ");
        }
        System.out.println();
        for (int i=0; i< itemCollection.getSize(); i++) {
            System.out.print(itemCollection.get(i).getName() + " ");
        }

        //ItemCollection equals method
        ItemCollection itemCollection2 = new ItemCollection();
        System.out.println("\n" + itemCollection2.equals(itemCollection));
        System.out.println("\n" + itemCollection.equals(itemCollectionCopy));


    }
}