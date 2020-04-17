/*
 * Tweet Count
 *
 * You are to write a program that prompts and accepts a tweet from someone of 140 characters or less.
 * You will print if the length was correct, number of hashtags (#), number of attributions (@), 
 * number of web links (http://). 
 * 
 * If the tweet was over 140 characters, you will need to print how much over 140 it was.
 * 
 * Sample Run 1:
 * 
 * Please enter a tweet:
 * @kewlfrogz says #holla http://dubdubdub.dubya.com
 * Length Correct
 * Number of Hashtags: 1
 * Number of Attributions: 1
 * Number of Links: 1
 * 
 * Sample Run 2:
 * 
 * Please enter a tweet:
 * @whgates #Xbox stomps all over #Playstation - like #PizzaHut wings beasts #PapaJohns wings, but #PCgaming is Godzilla! WHO DA MASTA!? http://www.pcgamingrulezall.com
 * Excess Characters: 25
 */

import java.io.*;
import java.util.Scanner;


class TweetFawole {

   public static void main(String args[]) {
      {
         Scanner scan = new Scanner(System.in);
      
         System.out.println("Enter a Tweet thats 140 characters or less: ");
      
         String t = scan.nextLine();
      //defining variables
         int c = 0;
         int at = 0;
         int hash = 0;
         int link = 0;
      //chacking for excess characters
         if (t.length() > 139)
         {
            System.out.println("Excess Characters: " + (t.length() - 140));
         }
         //checking for each attrib, hash, and link
         else
         {
            while(c < t.length()) {
               if(t.charAt(c)=='@'){
                  at++; 
               
                  if(t.charAt(c)=='#'){
                     hash++; 
                  
                     if(c < t.length() - 1){
                        if(t.substring(c, c + 7).equals("http://"))
                           link++;
                     }
                     
                  }
                  
               }
               //counter
               c++;
            }
            //printing how much of each special character
            System.out.println("Number of Attributions: " + at);
            System.out.println("Number of Hashtags: " + hash);
            System.out.println("Number of links: " + link);
         }
      
      }
   }
}  
   

