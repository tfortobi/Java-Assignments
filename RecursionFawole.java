/*
Unit 4 Recursion

The person that started this project was suddenly fired and you are tasked with finishing the work.
You will write methods to respond to each display type. 
Each of those methods needs to use the recursion process to solve each problem.
*/

import java.util.Scanner;
import java.io.*;
import java.lang.System.*;

//a class to test out recursion method()
class RecursionFawole{
      
   //print the odd numbers
   public static void oddNum(int num, int max){
      while(num < max){
         num++;
         if(num % 2 != 0){
            System.out.print(num + " ");
         }
      }         
   }
   
   //print the even numbers
   public static void evenNum(int num, int max){
      while(num < max){
         num++;
         if(num % 2 == 0){
            System.out.print(num + " ");
         }
      }
   }
   
   //print the binary equivalent of an integer
   public static void binary(int num){
      String s = "";
      while (num > 0)
      {
         s =  ( (num % 2 ) == 0 ? "0" : "1") +s;
         num = num / 2;
      }
      System.out.println(s);
   }

   
   
   //print the factorial of an integer
   public static int factorial(int num){
      int i, factorial=1;
   
      for(i = 1; i <= num; i++){
         factorial = factorial * i;
         
      }
      return factorial;
   }
         
   /*--------------------------Your code goes above this line, but feel free to take a look--------------------------*/
   //passes an integer to the recursion method() selected by user
   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      
      boolean cont = true;
      
      while(cont){
         System.out.print("\nPlease enter a positive integer: ");
         int userNum = scan.nextInt();
         
         System.out.print("What would you like to do to with that number?\n1. Odd numbers\n2. Even numbers\n3. Binary value\n4. Factorial value\n");
         int userSel = scan.nextInt();
         int maxValue;
         
         //switch:case to direct after user selection
         switch(userSel){
            case 1:
               System.out.print("\nTo what number should we go? ");
               maxValue = scan.nextInt();
               System.out.print("Odd numbers from " + maxValue + " to " + userNum + ": ");
               //alter the values for odd
               if(userNum % 2 == 0)
                  userNum++;
               if(maxValue %2 == 0)
                  maxValue--;
               //adjust for last value
               userNum-=2;
               //call the method for odd numbers
               oddNum(userNum, maxValue);
               break;
            case 2:
               System.out.print("\nTo what number should we go? ");
               maxValue = scan.nextInt();
               System.out.print("Even numbers from " + maxValue + " to " + userNum + ": ");
               //alter the values for even
               if(userNum % 2 != 0)
                  userNum++;
               if(maxValue %2 != 0)
                  maxValue--;
               //adjust for last value
               userNum-=2;
               //call the method for even numbers
               evenNum(userNum, maxValue);
               break;
            case 3:
               System.out.print("Binary equivalent of " + userNum + " is: ");
               //call the method to provide the binary number
               binary(userNum);
               break;
            case 4:
               System.out.print(userNum + "! = " + factorial(userNum));
               //call the method to provide the factorial number
               break;
         }//end switch:case
         
         //ask for a repeat, close the while if no
         System.out.print("\n\nWould you like to enter another number? (yes or no) ");
         char ans = scan.next().charAt(0);
         if (ans == 'n')
            cont = false;
      }//end while
   }//end main

}