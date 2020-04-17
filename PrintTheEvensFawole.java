/*
 * Print the Evens
 *
 * Ask the user for two numbers. Print only the even numbers between them,
 * you should also print the two numbers if they are even.
 * 
 *     Sample Run 1:
 *         
 *         Enter two numbers:
 *         3
 *         11
 *         
 *         4 6 8 10 
 * 
 *    Sample Run 2:
 *         
 *         Enter two numbers:
 *         10
 *         44
 *         
 *         10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44         
 * 
 * 
 */ 

import java.io.*;
import java.util.Scanner; 

class PrintTheEvensFawole {
   public static void main(String[] args)
   {
   
      Scanner scan = new Scanner(System.in);
     
      //getting the variables
      System.out.println("Enter two numbers: 1.");
      int a = scan.nextInt();
      System.out.println("2.");
      int b = scan.nextInt();
     
      //making sure a and b is even and if not, making it even
      if(a % 2 == 0){
         System.out.println(a);
      }
      else 
      {
         a++;
         b--;
         System.out.println(a);
      } 
      if (b % 2 != 0){
         b--;
      }
     
      //adding 2 to a and printing until it gets to the value of b
      while(a < b){
      
         int c = a + 2;
         System.out.println(c);
         a+=2;
      
         if(c == b){
            break;
         
         }
      
      }
      
      
   }
}