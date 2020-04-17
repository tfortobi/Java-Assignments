/*
 * Please write a program that will ask a user for two integer values and then display it in two ways:
 1. A String Concatenation of all values
 2. A String Concatenation with the math being done in the print statement
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class ConcatenationFawole{

     public static void main (String str[]) throws IOException {
     Scanner scan = new Scanner(System.in);
         //asking for and scanning the two integers
        System.out.println("Type two integer values: ");  
        int a = scan.nextInt();
        int b = scan.nextInt();
        //printing the numbers the user input
        System.out.println(a +" "+ b);
        //printing the sum of the numbers the user input
        System.out.println(a +" + "+ b + " = "+ (a + b));
                 
     }

}


