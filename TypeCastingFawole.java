/*
1. Try to run the following code:

double x = (11+4)/2
  What answer do you get? The answer is imprecise!

  Write a Java program that precisely calculates the average between two integers that input from the keyboard, 
  and prints the answer to the screen. The average must include the integer and decimal portions of the calculation.

Sample Run:

Please enter two integers:
4
11

The average is: 7.5

2. Input a double value and print only the integer part.

  Sample run:

Please input a decimal number:
57.8934
Answer: 57

3. Input a double and print the first two digits after the decimal point.

  Sample run:

Please input a decimal number:
57.8934
Answer: 89
  Hint - you will need to do a numeric cast and some division and/or subtraction.
  

*/
import java.util.Scanner;
class TypeCasting {
    public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );
  
    //asking for integers and scanning them
    System.out.println("Input two integers: ");
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double c = a + b;
    //finding average of the two numbers
    double d = c / 2;
    System.out.println("Average = " + d);
  
  
    //asking for decimal number and scanning it
    System.out.println("Please input a decimal number: ");
    double e = scan.nextDouble();
    int f = (int) e;
    System.out.println(f);
   
  
   
   //asking for decimal number and scanning it
    System.out.println("Please input a decimal number: ");
    double n = scan.nextDouble();  
    //make m that int
    int m = (int) n;
    //subtract them to leave only the decimal
    double k = n - m;
    //make decimal a whole number
    double l = k * 100;
    //get first two numbers
    int y = (int) l;
    System.out.println(y);
    
    
    
   
    
    

        

        }
}