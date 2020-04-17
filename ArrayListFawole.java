/*
* Write a Java program that allows a user to input words at the command line.  Your program should stop accepting words when the user enters "STOP".  Store the words in an ArrayList.  The word STOP should not be stored in the list.
* 
* Next, print the size of the list, followed by the contents of the list.
 
* Then, remove the first and last words stored in the list, but only if the list has a length greater than two.  Finally, reprint the contents of the list.
 
* Sample Run:
 
* Please enter words, enter STOP to stop the loop.
* cup
* spoon
* fork
* bowl
* plate
* knife
* STOP
 
* 6
* [cup, spoon, fork, bowl, plate, knife]
* [spoon, fork, bowl, plate]
*/

import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;
//new import for using ArrayLists
import java.util.ArrayList;

class ArrayListAssignmentFawole{

   public static void main (String str[]) throws IOException {
   
         //instantiate a new ArrayList with variable name list of object type String
      ArrayList <String> list  = new ArrayList <String>();
      Scanner scan = new Scanner(System.in);
          
      System.out.println("Please enter words, enter STOP to stop the loop.");
      String words = scan.nextLine();
         
      int numberOfWordInArray = 0;
         
         /*Insert your code here*/
         //tell array to stop when word is entered
         //not adding stop to array
      while(!words.equals("STOP")){
         list.add(words);
         numberOfWordInArray++;
         words = scan.nextLine();
      } 
          
      System.out.println("There are " + numberOfWordInArray + " words in the array.");
          //printing the contents of array
      for(int i = 0; i < numberOfWordInArray; i++){
         System.out.print(list.get(i) + " ");
      }
      list.remove(1);
      list.remove(numberOfWordInArray - 2);
          
      System.out.println("\n");
      for(int i = 0; i < numberOfWordInArray - 2; i++){
         System.out.print(list.get(i) + " ");
      }
           
   }
}