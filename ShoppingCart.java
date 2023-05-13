
package com.mycompany.toffe;
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<Item, Integer> items;
    
    public ShoppingCart() {
        items = new HashMap<Item, Integer>();
    }
    
    public void addItem(Item item, int quantity) {
        if (items.containsKey(item)) {
            items.put(item, items.get(item) + quantity);
        } else {
            items.put(item, quantity);
        }
    }
    
    public void removeItem(Item item) {
        items.remove(item);
    }
    
    public Map<Item, Integer> getItems() {
        return items;
    }
    
    public void setItems(Map<Item, Integer> items) {
        this.items = items;
    }
    public void diplay (){
        System.out.println("Shopping Cart:");
    for (Map.Entry<Item, Integer> entry : getItems().entrySet()) {
        Item item = entry.getKey();
        int quantity = entry.getValue();
        System.out.println(item.getName() + " quantity " + quantity + " - " + item.getPrice() + " each");
    }
    }
}


