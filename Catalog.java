package com.mycompany.toffe;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Item> items;
    public int i=0;
    public Catalog() {
        items = new ArrayList<Item>();
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    // display all items 
    public void display() {
        for (Item item : items) {
            i++;
            System.out.println(i+") "+item.getName() + " - " + item.getPrice() + " - " + item.getCategory() + " - " + item.getDescription() + " - " + item.getBrand() + " - " + item.getUnitType() + " - " + item.getDiscount());
        }
    }
}
