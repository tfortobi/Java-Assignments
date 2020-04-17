/*
 * Major Method Project
 *  
 * You are taking over a project from a co-worker who has been fired for lying about being able to code Java.
 * You must now pick up from where he left off, luckily he was decent at commenting his code, just had a terrible attitude.
 * 
 * Sample Run:
 * Here are the numbers in the array:
 *  21 41 25 89 36 80 57 64 91 75
 * Here are the numbers in the array reversed:
 *  75 91 64 57 80 36 89 25 41 21
 * Please give me an integer value and an insert point between 0 - 9
 * 2
 * 3
 *
 * Here are the numbers in the array final result:
 *  21 41 25 2 89 36 80 57 64 91 
 */


import java.util.Scanner;
import java.util.ArrayList;

class MethodProjFawole {
    
    //insert the integer in the index position and move all elements right
   public static void insertValue(int array[], int num, int index)
   {
    array[index] = num;          

    // shift right
    for( int t = array.length - 2; t >= 0 ; t-- ){
        array[t + 1] = array [t];
        }
        System.out.println("\nHere are the numbers in the arrays final result: ");
     for(int t = 0; t < array.length; t++){
     System.out.print(array[t] + " ");
     }
        
}   
   
    
    //reverse the order of the elements
   public static void reverse(int rev[])
   { 
      int temp = rev[0];
      for(int i = 0; i < rev.length; i++){
         rev[i] = rev[rev.length - (1 + i)];
      }
      rev[rev.length - 1] = temp;
      System.out.println("\nThese are the numbers in the array reversed: ");
      for(int i = 0; i < rev.length; i++){
         System.out.print(rev[i] + " ");
      }
   }
    
    
    
    //randomize() method will fill in elements with random numbers from 10 - 99
   public static void randomize(int x[])
   {
      for(int i = 0; i < x.length; i++){
         x[i] = (int)(Math.random() * ((99 - 10) + 1));
      } 
       System.out.println("\nThese are the numbers in the array: ");
      for(int i = 0; i < x.length; i++){
         System.out.print(x[i] + " ");
   }
   reverse(x); 
   }
    
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
     
      int [] randomNums = new int [10];
     
     //populate with random numbers by calling the method
      randomize(randomNums);
     
      
     
     //ask for two integers; inserted number and insert index
      System.out.println("\n\nPlease give me an integer value and an insert point between 0 - 9");
      int num = scan.nextInt();
      int index = scan.nextInt();
     
     //insert the value in the index point by calling the method    
      insertValue(randomNums, num, index);
     
  
   }
}