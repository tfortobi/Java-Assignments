/*
 * Cash Register
 
 Write a program that will simulate a change machine found at cash registers. 
 Input the amount due and amount paid from the keyboard.
Tell the user how much change is owed and number of quarters, dimes, nickels, 
and pennies in change a customer would receive.
Pay special attention to roundoff error. Your program should use division and modular division. 
No if’s or loops may be used. You may assume all change will be between $0 and $.99
Hint: Modular division is a great way to find the remainder of a division. 
Think about how you can use this to calculate the change that is left over after some coins are given.

Sample Run:
Please Enter the Cost of the Item: 
4.57 
Please Enter the Amount Paid: 
5.00 
Change Owed: 0.43 
Quarters: 1
Dimes: 1
Nickels: 1 
Pennies: 3
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class CashRegisterProjectFawole{


     public static void main (String str[]) throws IOException {
     Scanner scan = new Scanner(System.in);

            //getting cost of item
            System.out.println("Enter the cost of the item: ");
            double cost = scan.nextDouble();
            
            //getting amount paid
            System.out.println("Enter the amount paid: ");
            double paid = scan.nextDouble();
            
            //getting the change owed
            double change = (paid * 100) - (cost * 100);
            double rightChange = change / 100;
            System.out.println("Change owed: " + rightChange);
            double change2 = rightChange * 100 ;
            int change3 = (int)change2;
            
            //getting amount of each coin needed
            int q = change3 / 25;
            int changeLeft  = change3 % 25;
           int d = changeLeft / 10;
           int changeLeft2 = changeLeft % 10;
           int n = changeLeft2 / 5;
           int changeLeft3 = changeLeft2 % 5;
           int p = changeLeft3 / 1;
            
           
            //Printing amount needed
            System.out.println("Quarters: " + q);
             System.out.println("Dimes: " + d);
              System.out.println("Nickels: " + n);
               System.out.println("Pennies: " + p);
            
            
          

     }

}


