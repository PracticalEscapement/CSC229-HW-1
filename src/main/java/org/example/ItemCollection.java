package org.example;

import java.util.Arrays;

public class ItemCollection {
    public Item[] itemArr;

    // Default Constructor
    public ItemCollection() {
        this.itemArr = new Item[10];
        Item defaultValue = new Item();
        for (int i=0; i<itemArr.length; i++) {
            set(i, defaultValue.deepCopy());
        }
    }

    // Copy Constructor
    public ItemCollection(ItemCollection items) {
        this.itemArr = new Item[items.getSize()];
        for (int i=0; i<items.getSize(); i++) {
            Item temp = items.get(i);
            set(i, temp.deepCopy());
        }
    }

    public ItemCollection deepCopy() {
        ItemCollection icCopy = new ItemCollection();
        icCopy.reSize(this.getSize());
        for (int i=0; i< icCopy.getSize(); i++) {
            icCopy.set(i, this.itemArr[i].deepCopy());
        }
        return icCopy;
    }

    public void set(int index, Item i) {
        if (index > itemArr.length) {
            return;
        }
        this.itemArr[index] = i.deepCopy();
    }

    public Item get(int index) {
        if (index > itemArr.length) return null;
        return itemArr[index].deepCopy();
    }

    public int getSize() {
        int count = 0;
        for (Item item : itemArr) {
            count++;
        }
        return count;
    }

    public void reSize(int newSize) {
        Item[] temp = new Item[newSize];
        for (int i=0; i<newSize; i++) {
            if (i < itemArr.length) {
                temp[i] = itemArr[i];
            } else {
                temp[i] = new Item();
            }
        }
        this.itemArr = temp;
    }

    public boolean equals(ItemCollection ic) {
        if (this.getSize() != ic.getSize()) {
            return false;
        }
        for (int i=0; i<this.getSize(); i++) {
            if (!this.itemArr[i].equals(ic.get(i))) return false;
        }
        return true;
    }

}
