
/*
 * Using charAt
 * 
  Part I Write the code to take a String from a user and print it with one letter per line.

  Sample run:

  Enter a string:
  bought
  b
  o
  u
  g
  h
  t

  Part II Write the code to take the same string from Part I and print it diagonally.

  Sample run:

  Enter a string:
  bought
  b
      o
          u
              g
                  h
                      t
  Use a tab character for every four spaces in the sample.

  Hint: You may need more than one loop.
  
  Part III Write code to print in another way.
  
*/ 

import java.io.*;
import java.util.Scanner;

class UsingCharAtFawole {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
     //counters
      int N = 0;
      int K = 0;
      int s = 0;
      int l = 0;
     
     //part 1  Printing a string on different lines
      System.out.println("Enter a String: ");
      String s1 = scan.nextLine();
      int M = s1.length() - 1;  
     
      while(N <= M)
      {
      
         System.out.println(s1.charAt(N));
         N++;
      }
     
     //part 2  printing a string diagonally
      String p = "   ";
     
      while(K <= M)
      {
      
         System.out.println(p + s1.charAt(K));
      
         p = p + "  ";
         K++;
      }
     
     //part 3  printing a string with a space in between each line
      while( s <= M)
      {
         System.out.println("\n");
         System.out.println(s1.charAt(l));
         s++;
         l++;
      }
     
   }
}