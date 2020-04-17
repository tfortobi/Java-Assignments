/*
 * Binary Calculator
 
 For this lab, you will enter two numbers in base ten and translate them to binary. 
 You will then add the numbers in binary and print out the result.
 
 All numbers entered will be between 0 and 255, inclusive, and binary output is limited to 8 bits. This means that the 
 sum of the two added numbers will also be limited to 8 bits. Your code does not have to check for or do anything if the 
 sum is more than 8 bits. If they input an invalid number, then you will need to print 
 "Try again: Enter the second base ten number between 0 and 255, inclusive." and receive their next input value without restarting the application.
 
 Your program should include the following methods:
 
 int[] convertToBinary(int b) //Translates the parameter to a binary value and returns it stored as an array of ints.
 
 void printBin(int b[]) //Outputs the binary number stored in the array on one line. Please note, there should be exactly 
 one space between each output 0 or 1.
 
 int[] addBin(int a[], int b[]) //Adds the two binary numbers stored in the arrays, and returns the sum in a new array of ints.
 
 Sample Run:
 Enter a base ten number between 0 and 255, inclusive.
 56
 Enter a base ten number between 0 and 255, inclusive.
 2

 First binary number:
 0 0 1 1 1 0 0 0

 Second binary number:
 0 0 0 0 0 0 1 0

 Added:
 0 0 1 1 1 0 1 0
 */
import java.util.Scanner;
import java.io.*;
import java.lang.System.*;
class BinaryCalculatorFawole {

//converting number to binary
   public static int[] convertToBinary(int b){
      int[] decOne = new int[8];
     
      for(int i = 0; i <= decOne.length; i++)
      {
         if(b < 0){
            decOne[i] += b % 2;
            b = b / 2;    
         }
         else{
            decOne[i] = 0;
         }                 
      }
      return decOne;
   }
      //printing binary number
   public static void printBin(int b[]){
      for(int i = 0; i < b.length; i++){
         System.out.print(b[i] + " ");
      }      
   }
   int[] addBin(int b[]){
          
   }
//getting input from user and printing final products
   public static void main(String args[]) {
          
      Scanner scan = new Scanner(System.in);
          
      System.out.println("Enter a base ten number between 0 and 255, inclusive.");
      int firstNum = scan.nextInt();
      while(firstNum < 0 || firstNum > 255){
         System.out.println("Try again: Enter the second base ten number between 0 and 255, inclusive.");
         firstNum = scan.nextInt();
      }
          
          
      System.out.println("Enter a base ten number between 0 and 255, inclusive.");
      int secondNum = scan.nextInt();
      while(secondNum < 0 || secondNum > 255){
         System.out.println("Try again: Enter the second base ten number between 0 and 255, inclusive.");
         secondNum = scan.nextInt();
      }
      convertToBinary(firstNum);
      convertToBinary(secondNum);
          
      System.out.println("First binary number:");
      printBin(convertToBinary(decOne));
      binOne = convertToBinary(decOne);
     
      System.out.println("\n\nSecond binary number:");
      printBin(convertToBinary(decTwo));
      binTwo = convertToBinary(decTwo);
     
      System.out.println("\n\nAdded:");
      printBin(addBin(binOne, binTwo));
               
   }
}
