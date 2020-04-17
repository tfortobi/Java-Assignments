/*
 * Multiple Method Return Project
 * 
 * For this application, you will write methods that satisfy a number of program requirements.
 * Start by creating your main method, this will be like all others. You will then send data to methods that will perform 
 * certain functions and then they will return the result to the main method and the main method will print out the result.
 * 
 * 1) takes an array of ints as a parameter and returns the sum of the integers in the array.
 * 
 * 2) takes an array of ints as a parameter and returns the double average of the integers in the array.
 *
 * 3) takes an array of ints as a parameter and returns the largest integer in the array.
 *
 * 4) takes an array of ints as a parameter and returns the smallest integer in the array.
 *
 * 5) takes an array of ints as a parameter and returns the double average of the even values in the array.
 * 
 */

import java.util.*;
class MultipleMethodsProjectFawole {


   public static int sum(int s[] ){
      int sum = 0;
      for(int i = 0; i < s.length; i++){
         sum += s[i];
      }
      return sum;
   }
   public static double average(int a[]){
      int sum = 0;
      for(int i = 0; i < a.length; i++){
         sum += a[i];
      }
      double average = (sum / a.length);
      return average;
   }
   public static int findMax(int fm[]){
      int max = fm[0];
      for(int i = 0; i < fm.length; i++){
         if(fm[i] > max){
            max = fm[i];
         }
      }
      return max;
   }
   public static int findMin(int f[]){
      int min = f[0];
      for(int i = 0; i < f.length; i++){
         if(f[i] < min){
            min = f[i];
         }
      }
      return min;
   }
   public static double sumEven(int se[]){
      double sumEven = 0;
      int sum = 0;
      int count = 0;
      for(int i = 0; i < se.length; i++){
         if(se[i] % 2 == 0){
            sum += se[i];
            count++;
         }
      }
      sumEven = (sum / count);
      return sumEven;
   }
  
   public static void main(String[] args){
    
      Scanner scan = new Scanner(System.in);
         
         //establish a fixed array to accept user input
      int[] array = new int[5];
         
         //Prompt the user for the integers
      System.out.println("Please enter 5 integers");
         
         //Loop to place values in to elements of the array, 
         //note how the scan is within the for loop to step in to each element space and place the input value         
      for (int i = 0; i < array.length; i++){
         int arrayInt = scan.nextInt();
         array[i] = arrayInt;
      }
         
      System.out.println("\nSum: " + sum(array));
         
      System.out.println("Average: " + average(array));
         
      System.out.println("Largest: " + findMax(array));
         
      System.out.println("Smallest: " + findMin(array));
         
      System.out.println("Average of Evens: " + sumEven(array));
   }
}