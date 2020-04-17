/*
 * Boolean Conditions 1
 *
 * Please write a program that will accept a number from a user. 
 * Then your program will test that number against a range of values (5 - 76) 
 * and determine if that input number is within that range.
 * If it is within range then print False, otherwise print True.
 *
 * Sample:
 * Enter a number:
 * 10
 * False
 *
 * Sample:
 * Enter a number:
 * 200
 * True
 *  
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class BooleanConditions1Fawole{

   public static void main (String str[]) throws IOException {
   
      Scanner scan = new Scanner(System.in);
          //getting number and seeing if it tru or false
      System.out.println("Enter a number: ");
      int a = scan.nextInt();
      if(a > 5 && a < 76 ){
         System.out.println("False");
      }
      else
      {
         System.out.println("True");
      }
   
   }

}


