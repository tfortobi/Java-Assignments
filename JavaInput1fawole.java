/*
 * Unit 1 - User Input and Variables 
 1. Write the code to ask the user to enter their name and print the following message:

  Hi ______, nice to see you.
  
  Remember, you'll need to use the method println and Scanner class method nextLine.
  *
  2. Write a program that asks the user for three names, then prints the names in reverse order.

  Sample Run:

  Please enter three names:
  Zoey 
  Zeb 
  Zena 

  Zena Zeb Zoey
  *
  3. Write a program that will ask the user to enter an adjective and a name. Print the following sentence, replacing the ______ with the words they entered.

  My name is _____. I am _____.

  Sample Run:

  Hi there. What is your name?
  Ada
  What adjective describes you?
  logical
  My name is Ada. I am logical.
  *
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;


class JavaInput1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );//Create the scanner

      String n; 
       
        System.out.println("Hi (your name), nice to see you. ");
        
         n = scan.nextLine();//name of user
         
            System.out.println("Hi " + n + ", nice to see you");//adds name to sentence
          
          
          String threeNames;  
           
            //Print 3 names 
            System.out.println("What are the names of three people you know?");
            
            //get the 3 names
            threeNames= scan.nextLine();
            String reverse = "";
            
            for(int i = threeNames.length() - 1; i>= 0; i--)
            reverse= reverse + threeNames.charAt(i);
            
           System.out.println("Names reversed are:");
           System.out.println(reverse);
            
            
            //Asking for a name and adjective and entering into line
            System.out.println("What is your name?");
            String name;
            name = scan.nextLine();
            
            System.out.println("What adjective describes you?");
            String describe;
            describe = scan.nextLine();
            
            System.out.println("My name is " + name + ". I am " + describe +".");
            
            
        
        

        }
}

