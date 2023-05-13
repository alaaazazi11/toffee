
package com.mycompany.toffe;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Toffe {

    public static void main(String[] args) {
       
        // Create some items
    Item item1 = new Item("Shirt", 20.0, "Clothing", "A blue shirt", "Nike", "Piece", 0.0);
    Item item2 = new Item("Jeans", 40.0, "Clothing", "A pair of jeans", "Levi's", "Piece", 0.0);
    Item item3 = new Item("Shoes", 50.0, "Footwear", "A pair of sneakers", "Adidas", "Pair", 0.0);
   // Item item4 = new Item("")
    // Create a catalog and add the items to it
    Catalog catalog = new Catalog();
    catalog.addItem(item1);
    catalog.addItem(item2);
    catalog.addItem(item3);
    
    // Display the catalog
    System.out.println("Catalog:");
    catalog.display();
    
    // Create some users and register them
    User user1 = new User("user1", "user1@example.com", "password1", "123 Main St");
    User user2 = new User("user2", "user2@example.com", "password2", "456 High St");
    User user3 = new User("user3", "user3@example.com", "password3", "789 Low St");
    User.register(user1.getUsername(), user1.getEmail(), user1.getPassword(), user1.getAddress());
    User.register(user2.getUsername(), user2.getEmail(), user2.getPassword(), user2.getAddress());
    User.register(user3.getUsername(), user3.getEmail(), user3.getPassword(), user3.getAddress());
    
    // Try to register a user with an existing email
    boolean registered = User.register("user4", "user1@example.com", "password4", "321 Center St");
    if (!registered) {
        System.out.println("User with email  already exists!");
    }
    
    // Log in a user
    User loggedInUser = User.login("user1@example.com", "password1");
    
    if (loggedInUser != null) {
        System.out.println(loggedInUser.getUsername() + " logged in successfully!");
    } 
    /*else {
        System.out.println("Invalid email or password!");
    }
    
    // Try to log in with an inactive user
    user2.setStatus("active");
    loggedInUser = User.login("user2@example.com", "password2");
    if (loggedInUser != null) {
        System.out.println(loggedInUser.getUsername() + " logged in successfully!");
    } else {
        System.out.println("Invalid email or password!");
    }
    */
    // Create a shopping cart and add some items to it
    ShoppingCart cart = new ShoppingCart();
    cart.addItem(item1, 2);
    cart.addItem(item3, 2);
    
    // Display the items in the shopping cart
    cart.diplay();
   
    // Create an order from the shopping cart
    Order order = new Order(loggedInUser, cart.getItems());
    Payment paying=new Payment(loggedInUser);
    paying.pay(order,"cash on delivery");
    order.diplay();
    
  
        
       
        
    }
}

