/*
 * If/Else If ranges with ||/&& 
 
 * 1. Input two decimal numbers and print the largest.
 * If the numbers are equal, print one of them.
 *     
 *     Sample Run 1
 *        Please enter two numbers:
 *        45.7
 *        45.1
 *
 *        Largest is: 45.7 
 *         
 *      Sample Run 2
 *        Please enter two numbers:
 *        14
 *        14
 * 
 *        Largest is: 14.0          
 * 
 * 2. Input two decimal numbers for tests and determine if it is a valid or not valid number.
 * If the numbers are within the grading scale of 0.0 to 100.0 then print Valid; otherwise, print Not Valid.
 *     
 *     Sample Run 1
 *         Enter a test score:
 *         78.5
 *         Valid
 *
 *         
 *      Sample Run 2
 *         Enter a test score:
 *         179
 *         Not Valid
 *
 * 3. You are running an experiment that involves hatching chicken eggs. 
 * Bird eggs are very sensitive to temperature and chickensÕ eggs will hatch 
 * between 99 and 102 degrees Fahrenheit.
 * 
 * Write the code for the sensor that will be tracking the temperature. 
 * If the temperature falls below 99 or above 102 your code should print ÒWARNINGÓ.
 * The input should be in doubles.
 *     
 *     Sample Run 1
 *         What is the temperature?
 *         45.3
 *         WARNING
 *
 *         
 *      Sample Run 2
 *         What is the temperature?
 *         100
 */


import java.util.Scanner;

class IfRangesFawole {
    public static void main(String[] args)
     {
     
     Scanner scan = new Scanner (System.in);
     
     
      //1
      System.out.println("\n\n1 *****************\n");
      //getting two numbers
      System.out.println("Enter two numbers: 1. ");
      double a = scan.nextDouble();
      
      System.out.println("2. ");
      double b = scan.nextDouble();
      //if a is bigger than b print a. if not print b
      if( a >= b ){
      System.out.println(a);
      }
      else
      {
      System.out.println(b);
      }
      
      
      //2
      System.out.println("\n\n2 *****************\n");
      //getting test score and seeing if it is between 0 and 100
      System.out.println("Enter test score: \n 1.");
      double c = scan.nextDouble();
       if(c >= 0 && c <= 100){
      System.out.println("Valid");
      }
      else
      {
      System.out.println("Not Valid");
      }
     
     
     System.out.println("Enter test score:");
      System.out.println("2. ");
      double d = scan.nextDouble();
      if(d >= 0 && d <= 100){
      System.out.println("Valid");
      }
      else
      {
      System.out.println("Not Valid");
      }
     
      
      
      
      
      
      //3
      System.out.println("\n\n3 *****************\n");
      //getting temp and seeing if it is between 99 and 102 and printing accordingly
      System.out.println("What is the temperature:");
     double t = scan.nextDouble();
     if(t >= 99 && t <= 102){
     System.out.println("Warning");
     }
      
    }
}