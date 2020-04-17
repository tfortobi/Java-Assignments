/*
1. Write the code to print a random integer from 1 to 10 inclusive using Math.random().

2. Write the code to print a random integer from -20 to 20 inclusive using Math.random().

3. Write the code to print a random integer from 20 to 40 inclusive using Math.random().

4. Write the code to print the absolute result of subtracting two input integers and then two input doubles.

5. Write the code to print the square root of an input number.

6. Write the code to print the result of one number to the power of another input by the user.
*/
import java.util.Scanner;

import java.lang.Math;

class MathLibraryFunctionsFawole {
   public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
        
        //1 Random integer from 1 to 10
      double a = Math.random()*10+1;
      System.out.println("A random number between 1 and 10: " + (int) a); 
        
        //2 random int from -20 to 20
      double b = Math.random()*40 + -20;
      System.out.println("A random number between -20 and 20: " + (int) b);
        
        //3 random int from 20 to 40
      double c = Math.random()*20 +20;
      System.out.println("A random number between 20 and 40: "+ (int) c);
        
        //4 absolute value of the difference of two numbers
      System.out.println("Input two integers: ");
      int d = scan.nextInt();
      int e = scan.nextInt();
      int f = Math.abs(d-e);
      System.out.println("The absolute value of those two numbers subtracted by each other= "+ f);
        
      System.out.println("Input two decimal numbers: ");
      double t = scan.nextDouble();
      double p = scan.nextDouble();
      int u = Math.abs((int)(t-p));
      System.out.println("The absolute value of those two numbers subtracted by each other= "+ u);
        
        
        //5 square root of a number
      System.out.println("Input a number: ");
      double j = scan.nextDouble();
      double l = Math.sqrt(j);
      System.out.println("The square root of that number is: " + l );
         
         //6  a number to the power of another
      System.out.println("Input two numbers:");
      double x = scan.nextDouble();
      double y = scan.nextDouble();
      double w = Math.pow(x,y);
      System.out.println("The second number to the power of the first number= " + w);
   
   
   }
}