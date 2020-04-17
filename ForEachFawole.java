/*
* Write a program that allows a user to input words at the command line.  
* Your program should stop accepting words when the user enters "STOP".  Store the words in an ArrayList.  The word STOP should not be stored in the list.
* 
* Next, your program should loop through the list and print out only the words that contain the letter "a".
* 
* Sample Run:
* 
* Please enter words, enter STOP to stop the loop.
* dog
* zebra
* cat
* fish
* STOP
* 
* zebra
* cat
*/

import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

import java.util.ArrayList;

class ForEachFawole{

   public static void main (String str[]) throws IOException {
   
      ArrayList <String> list  = new ArrayList <String>();
      Scanner scan = new Scanner(System.in);
          
      System.out.println("Please enter words, enter STOP to stop the loop.");
      String words = scan.nextLine();
         
         
         
       //checking if word entered is stop and putting words in array             
      while (!words.equals("STOP")){
         list.add(words);
         words = scan.nextLine();
      }
      //checking if they have a, and if so, printing them
      for(String pos : list){
         for(int i = 0; i < pos.length(); i++){
            if(pos.charAt(i) == 'a'){
               System.out.print("\n" + pos);
               i = pos.length() + 1;
            }
         }
         
      }
   }
}


