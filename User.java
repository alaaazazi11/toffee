
package com.mycompany.toffe;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User  {
    private String username;
    private String email;
    private String password;
    private String address;
    private String status;
    private String phone ;
   
   
    private static List<User> userList = new ArrayList<User>();
   
    public User(String username, String email, String password, String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
        this.status = "active";
    }
    
    // getters and setters for all fields
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
     public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
    
    
    public static List<User> getUserList() {
        return userList;
    }
    
    public static void setUserList(List<User> userList) {
        User.userList = userList;
    }
    
    public static boolean register(String username, String email, String password, String address) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return false;
            }
        }
        
        
        userList.add(new User(username, email, password, address));
        return true;
    }
    
    public static User login(String email, String password) {
        for (User user : userList) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password) && user.getStatus().equals("active")) {
                
                return user;
            }
        }
        System.out.println("Invalid email or password!");
        return null;
    }
    
}




