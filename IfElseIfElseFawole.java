/*
 * If Else
 
 * 1. Test if an integer input from the keyboard is odd or even.
 * 
 *     Sample Run 1:
 *        Enter a Number:
 *        78
 *        Even
 * 
 *     Sample Run 2:
 *        Enter a Number:
 *        17
 *        Odd
 * 
 * 2. Ask the user to input the number of wheels. Based on their input, print out what type of vehicle it is.
 * Please include 3 vehicles.
 *    
 *    Sample Run 1: 
         Enter number of wheels:
         2
         Bike
         
      Sample Run 2:
         Enter number of wheels:
         18
         Tractor trailer
 */

import java.util.Scanner;
import java.lang.Math;


class IfElseIfElseFawole {   
   public static void main(String[] args) 
   { 
      Scanner scan = new Scanner(System.in);
   
   
   
      System.out.println("\n\n1 *****************\n");
   
      System.out.println("Enter a number: "); 
        
      int a = scan.nextInt();
         //saying if the remainder of a / 2 is zero it is even
      if ( a % 2 == 0){
         System.out.println("Even");
      }
        //saying if remainder isnt equal to zero it is odd
      if ( a % 2 != 0){
         System.out.println("Odd");
      }
   
   
      
      
      
     
      System.out.println("\n\n2 *****************\n");
      
   
      System.out.println("Enter number of wheels");
      
      int b = scan.nextInt();
      //making it so if user enters 2 4 or 8 it will say a vehicle that has that number of wheels
      if(b == 2){
         System.out.println("Bike");
      }
      
      if(b == 4){
         System.out.println("Car");
      }
      if(b == 18){
         System.out.println("Tractor trailer");
      }
      
   
   
   
   
   }
}