/*
1. Input a positive three digit integer. Print out the digits one per line.

  Sample run:

Please enter a three digit number:
678

Here are the digits:
6
7
8

2. Change the last problem so that it also prints the sum of the digits. Use the format shown below.

  Make sure your output is printed in the same order as the sample run.

  Sample run:

Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21  



*/
import java.util.Scanner;
class ModularDivisionFawole {
   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
   
   
   
      System.out.println("Input a positive three digit integer: ");
      int a = scan.nextInt();
   //getting each number
   
   //first number
      int x = (int) a / 100;
   //second number
      int r = a % 100;
      int b = (int)r / 10;
   //last number
      int c = a % 10; 
      System.out.println(x + "\n"+ b +"\n" + c );
   
   //adding them together
      int z = x + b + c;
      System.out.println("Numbers added together: ");
      System.out.println(x +" + "+ b +" + "+ c +" = "+ z);
   
   
   
   
        
   
   }
}