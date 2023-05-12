
package com.mycompany.toffe;
import java.util.Scanner;

public class Payment {
   private User user;
   private  String number;
   private String  code;
   
    public Payment(User user) {
        this.user=user;
    }
   Scanner input =new Scanner(System.in);
    public /*static*/ boolean pay(Order order, String paymentType) {
        if (paymentType.equals("cash on delivery") || paymentType.equals("credit")) {
           if(paymentType.equals("cash on delivery")){
               
               System.out.print("you choose cash . then you must ");
               System.out.println("enter your phone number: ");
              
               number=input.next();
               user.setPhone(number);
               
           }
           else{
               System.out.print("you choose credit .then you must ");
               System.out.println("enter your number code:");
               code=input.next();
               
               
           }
            
            System.out.println("Payment successful of Order #" + order.getId() );
            return true;
        } else {
            System.out.println("Invalid payment type!");
            return false;
        }
    }
}