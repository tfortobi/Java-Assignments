/*
 * Remove Spaces
 * 
 * Due to a problem with a scanner an array of words was created 
 * with spaces in incorrect places. Write the code to process the 
 * list of words and trim any spaces out of the words.
 *
 * So if the list contains:
 *      {"every", " near ing ", " checking", "food ", "stand", "value "}
 *
 * It should be changed to hold:        
 *      {"every", "nearing", "checking", "food", "stand", "value"}
 *         
 * Please print the contents of the list array after removing the spaces.
 * 
 * Sample Run:
 * everynearingcheckingfoodstandvalue
 */

import java.io.*;
import java.util.Scanner;

class RemoveSpacesFawole {
     
   public static String [] list = {"every", " near ing ", " checking", " food ", "s t a n d", "value "};
  
   public static void main(String[] args)
   {
         //what i will be replacing spaces with
      String replace = "";
         //going thorugh array
      for(int i = 0; i < list.length; i++){
         //making an array word a string
         StringBuffer array = new StringBuffer(list[i]);
         //replacing the space
         list[i] = list[i].replace(" ", "");
         //printing array with no spaces
         System.out.print(list[i]);
         
      }
   }
      
}

    
