/*
 * Base 8 to Base 10 
 * 
 * Input a String to represent the octal number and translate to the base ten number. 
 * The octal number must be 8 digits or less. 
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */ 

import java.io.*;
import java.util.Scanner;
import java.lang.Math; 

class Base8toBase10Fawole{
   public static void main(String[] args)
   {
   
      Scanner scan = new Scanner(System.in);
      //getting entered base 8
      System.out.println("Enter a number in Base 8: ");
      String ate = scan.nextLine();
      
      int stop = 0;
      //checking if entered number is over 8 digits
      if(ate.length() > 8){
         System.out.println("ERROR: Incorrect Octal Format");
         stop++;
      }
      else{
      //checking all numbers are between 1-7
         for(int i = 0, c = 1; ate.length() > i; i++, c++){
            int x = Integer.valueOf(ate.substring(i , c));
            i++;
            c++;
            if(x > 7 || x < 1){
               System.out.println("ERROR: Incorrect Octal Format");
               stop++;
            }
         }
         int h = 0;
         int exp = ate.length()-1;
      //trying to get each number of the integer and multiply it by 8 to the power of its place value and add all that together 
         if(stop == 0){
            int sum = 0;
            for( int i = 0; ate.length() > i; i++){
               h += Integer.valueOf(ate.substring(i, i+1)) * (int)Math.pow(8 , exp);
               exp--;
            }
            System.out.println(h);
         }
      }
          
   }
}