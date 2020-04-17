/*
 * If Statements 1
 
 * 1. Test if an integer input from the keyboard is equal to the integer 176. 
 * If it is, print "YES" (without the quotes).
 
 * 2. Test if a decimal value input from the keyboard is equal to 48.729.
 * If it is, print "YES" (without the quotes).
 
 * 3. Get two integers from the keyboard and test if they are equal.
 * If they are, print "YES" (without the quotes).
*/

import java.util.Scanner;
import java.lang.Math;


class IfStatements1Fawole {
   
      
      
   public static void main(String[] args) 
   {
    
      Scanner scan = new Scanner(System.in);
   
   //asking for int and checking if its equal to 170
   System.out.println("\n\n1 *************\n");
   System.out.println("Please enter a number:");
   
         int a = scan.nextInt();
         if( a == 176 ){
         System.out.println("YES");
         }
   
    
    //asking for a double and checking if its equal to 48.729
    System.out.println("\n\n2 *************\n");
    System.out.println("Please enter a number:");
      
         double b = scan.nextDouble();
         if(b == 48.729){
         System.out.println("YES");
         }
      
   //asking for two ints and seeing if they equal each other   
   System.out.println("\n\n3 *************\n");
   System.out.println("Please enter two numbers:");
   
         int x = scan.nextInt();
         int y = scan.nextInt();
         if ( x == y){
         System.out.println("YES");
         }
      
   
   }
}