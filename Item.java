
package com.mycompany.toffe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item {
    private String name;
    private double price;
    private String category;
    private String description;
    private String brand;
    private String unitType;
    private double discount;
    
    public Item(String name, double price, String category, String description, String brand, String unitType, double discount) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.brand = brand;
        this.unitType = unitType;
        this.discount = discount;
    }
    
    // getters and setters for all fields
    public String getName() {
        return name;
    }
    
   
    
    public double getPrice() {
        return price;
    }
    
  
    
    public String getCategory() {
        return category;
    }
    
   
    
    public String getDescription() {
        return description;
    }
  
    
    public String getBrand() {
        return brand;
    }
    
  
    
    public String getUnitType() {
        return unitType;
    }
    
  
    
    public double getDiscount() {
        return discount;
    }
    
   
}