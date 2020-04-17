/*
 * Boolean Conditions - Octets and IP Address
 *
 * You are going to write a program that will accept 4 integer numbers from a user, check to see if they are valid
 * IP address range numbers (1 - 255).(0 - 255).(0 - 255).(1 - 254) 
 * and then if they are valid you will put them in the correct dotted decimal notation for an IP address.
 * If they are invalid, tell the user which one is invalid.
 *
 * Sample Run:
 Please enter the first Octet:
 125
 Please enter the second Octet:
 10
 Please enter the third Octet:
 52
 Please enter the fourth Octet:
 10
 IP Address: 125.10.52.10
 *
 * Sample Run:
 Please enter the first Octet:
 125
 Please enter the second Octet:
 10
 Please enter the third Octet:
 520
 Please enter the fourth Octet:
 10
 Octet three is incorrect.
 *  
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class BooleanConditions2Fawole{

   public static void main (String str[]) throws IOException {
   
      Scanner scan = new Scanner(System.in);
          //getting all the octets
      System.out.println("Enter in a IP address: \n Enter first Octet:");
      int octet1 = scan.nextInt();
      System.out.println("Enter second Octet:");
      int octet2 = scan.nextInt();
      System.out.println("Enter third Octet:");
      int octet3 = scan.nextInt();
      System.out.println("Enter fourth Octet:");
      int octet4 = scan.nextInt();
          
       
          //checking if everthing is correct
      int c = 0;
      if(octet1 < 1 || octet1 > 255){
         System.out.println("Octet 1 is incorrect.");
         c++;
      }
      if(octet2 < 0 || octet2 > 255){
         System.out.println("Octet 2 is incorrect.");
         c++;
      }
      if(octet3 < 0 || octet3 > 255){
         System.out.println("Octet 3 is incorrect.");
         c++;
      }
      if(octet4 < 1 || octet4 > 254){
         System.out.println("Octet 4 is incorrect.");
         c++;
      }
      if(c == 0){
         System.out.println(octet1 + "."+ octet2 + "." + octet3 + "."+ octet4);
      } 
          
          
          
             
          
   }

}