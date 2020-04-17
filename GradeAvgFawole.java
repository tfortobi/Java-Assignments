/*
 * Grade Calculator
 *
 * Write a program that will input a list of test scores in decimal from the keyboard. 
 * When the user enters -1, print the average of the scores as an integer.
 * 
 * What do you need to be careful about when using -1 to stop a loop?
 * 
 *     Sample Run:
 *         Enter the Scores:
 *         45.4
 *         100
 *         78.6
 *         -1
 *
 *         The average is: 74
 * 
 * 
 */ 

import java.io.*;
import java.util.Scanner;

class GradeAvgFawole {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      //getting test scores
      System.out.println("Input a list of test Scores: ");
      //making variables
      double x = 0;
      double y = -1;
      double z = 0;
      
      //making y a counter and adding each number inputed
      while(x != -1) 
      {
         x = scan.nextDouble(); 
         y++;
         z+=x;
      }
      
     //getting average
      System.out.println((int)(z / y) );
      
      
      
   
   }
}