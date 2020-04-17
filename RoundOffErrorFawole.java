/*
 * Lesson 10 Coding Activity Question 1
 * 
 * The following calculation will give roundoff error:
 *      double x = 1.473;
 *      System.out.println(2 - x);
 * 
 * Write the code to correct it. You can assume no more than 3 decimal places will be used.
 * 
 * Sample run:
 * 
 *      Please enter two decimal values:
 *      2
 *      1.473
 *     
 *      The difference is: 0.527
 * 
 * Use this starter file as your template.
 * 
*/

import java.util.Scanner;
import java.lang.Math;


class RoundOffError {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      
      //giving numbers a variable
      int a = 2;
      double b = 1.473;
      //multiplying to take out all extra decimals
      double c = a * 1000;
      double d = b * 1000;
      double e = c - d;
      //dividing to get it back to original number
      double f = e/1000;
      System.out.println(f);


    }
}