package shoppingLab;

import java.util.Arrays;

public class Customer {

    private String name;
    private Clothing[] clothingItems;
    private char size;

    public Customer(String name, Clothing[] clothingItems, char size) {
        this.name = name;
        this.clothingItems = clothingItems;
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public Clothing[] getClothingItems() {
        return clothingItems;
    }

    @Override
    public String toString() {
        return Arrays.toString(clothingItems);

    }
}
