
package com.mycompany.toffe;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private static int nextId = 1;
    private int id;
    private Date date;
    private User user;
    private Map<Item, Integer> items;
    
    public Order(User user, Map<Item, Integer> items) {
        this.id = nextId;
        nextId++;
        this.date = new Date();
        this.user = user;
        this.items = items;
    }
    
    public int getId() {
        return id;
    }
    
    public Date getDate() {
        return date;
    }
    
    public User getUser() {
        return user;
    }
    
    public Map<Item, Integer> getItems() {
        return items;
    }
    
    public double getTotalPrice() {
        double total = 0;
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
           
        }
        return total;
    }
    
    public void cancel() {
        user = null;
        items.clear();
    }
    public void diplay(){
        System.out.println("Order #" + getId() );
    System.out.println("Total price: " + getTotalPrice());
    System.out.println("date: " + getDate());
    System.out.println("items: " + getItems() );
    System.out.println("address: "+user.getAddress());
    }
}