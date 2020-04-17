/*
 * Short Circuit Evaluation. 
 *
 * You will write a program that allows the user to input numbers until they input -1.
 * As soon as they enter -1, complete your loop and display the number of digits input.
 * Do not count the -1.
 */
import java.io.*;
import java.util.Scanner;

class ShortCircuitEvalFawole{

   public static void main (String str[]) throws IOException {
   
      Scanner scan = new Scanner(System.in);  
          //getting number
      System.out.println("Input a Number: "); 
          //making x the entered int
      int x = scan.nextInt();
      int c = 0;
         //checking if x equals -1 or not
      while(x != -1) {
         x = scan.nextInt();
         c++;
      }
           //if it does = -1 then this will say the amount of attempts
      if (x == -1){
         System.out.println("It took you "+ c + " attempts to guess the number.");
      }
           
           
           
   }
          

}


