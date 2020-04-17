/*
 * Capitilize Array Elements
 * 
 * Write a method that takes an array of Strings and changes the Strings to UPPER CASE.  
 * 
 * This method must be called upper() and it must take a String[] parameter.
 * 
 * Sample Run:
 * Array elements before method: 
 * algorithm boolean char double 
 *
 * Array elements after cap method: 
 * ALGORITHM BOOLEAN CHAR DOUBLE 
 * 
 */ 


import java.util.Scanner;

class CapArrayFawole {
         
    //fill in the rest of the method upper()
    //capitalize elements in array passed
   public static void upper(String arrayToUpper[])
   {
      System.out.println("\n \nArray elements after cap method: ");
      for(int c = 0; c < arrayToUpper.length; c++){
         System.out.print(arrayToUpper[c].toUpperCase() + " ");
      }
   }
    
    //print elements before and after cap method
   public static void main(String[] args)
   {
      String word [] = {"algorithm", "boolean", "char", "double"};
      System.out.println("Array elements before method: " );
      for(int c = 0; c < word.length; c++){
         System.out.print(word[c] + " "); 
      }
      upper(word); 
         
   }
}