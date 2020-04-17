/*
 * The For Loop with Boundaries
 *
 * Part I: Write a For Loop that will print integers 25 to 90 with a space in between and only allow 15 numbers per line before dropping to the next line.
 * 
 * Sample Run:
 *
 * 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39
 * 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54
 * ...
 *
 * Part II: Input an integer less than 200 as a start to your range.
 * Input an integer between 0 and 200 and greater than the first input and print the numbers between the start and max. 
 * Input an integer less than 200 and greater than 0 to determine how many numbers are printed per row.
 * If the number is not between 0 and 200 or the max number is not greater than the starting number then print "error". 
 * 
 *     Sample Run 1:
 *         Enter a starting number less than 200:
 *         30
 *         Enter a max number between 0 and 200:
 *         200
 *         Enter the number per row greater than 0 and less than 200:
 *         20
 *         30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49
 *         50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69
 *         70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89
 *         90 91 92 93 94 95 96 97 98 99 100
 *         
 *    Sample Run 2:
 *         Enter a starting number less than 200:
 *         10
 *         Enter a max number between 0 and 200:
 *         205
 *         error
 */

import java.io.*;
import java.util.Scanner;

class ForLoopBoundariesFawole{

   public static void main (String str[]) throws IOException {
          
      Scanner scan = new Scanner(System.in);
          //Part 1
          //setting parameters
      for(int l = 25 , c = 0; l < 90; l++ , c++){
          //printing number
         if(c < 15){ 
            System.out.print(l + " ");
         }
          //only letting 15 numbers get print on a line
         else{
            System.out.print("\n" + l + " ");
            c = 0;
         }
      }
      System.out.println("\n");
          
          //Part 2
          //getting all the data needed to set parameters
      System.out.println("Input an integer less than 200: ");
      int start = scan.nextInt();
      System.out.println("Input an integer less than 200 but greater than first input: ");
      int end = scan.nextInt();
      System.out.println("Input an integer for numbers per row: ");
      int row = scan.nextInt();
          
          //checking if numbers are valid
      if(end <= start){
         System.out.println("Error");
      }
      //if valid they will print in given parameters
      else{
         for(int row1 = 1; start <= end; start++, row1++){
            System.out.print(start + " ");
            if(row1 == row){
               System.out.print("\n" + start + " ");
               row1 = 1;
            }
          
         }
      }
          
          
   
   }

}


