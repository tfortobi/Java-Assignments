/*
* Replace the Star (*)
*
* You will write an application that will accept alpha character input from a user and it must contain an asterisk (*) at any point.
* You will then accept a second input from the user.
* Now insert the second input in place of the star in the first input and print that to the screen.
* You will need to check to ensure that there are only alphabet characters used, lower or uppercase and one star/asterisk(*).
* If there is any other characters used or anything outside of ONE star, you will print Error.
*
* Sample Run 1:
* 
* Enter alpha characters (a - Z) containing a *:
* tr*le
* Enter more alpha characters:
* oub
* trouble
* 
* Sample Run 2:
* 
* Enter alpha characters (a - Z) containing a *:
* tr**le1
* Enter more alpha characters:
* oub
* Error
*/

import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

class ReplaceStarFawole{

   public static void main(String args[]) {
      {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter alpha characters (a - Z) containing a *: ");
      
         String sentence1 = scan.nextLine();
      
         System.out.println("Enter more alpha characters:");
      
         String sentence2 = scan.nextLine();
         
         
         int t = 0;
      
         for(int i = 0, stop = 0; i < sentence1.length(); i++){
            char a = sentence1.charAt(i);
            if(a == '*'){
               stop++;
            }
            if(stop > 1){
               System.out.println("Error");
               t++;
               break;
            }
         }
         if(t == 0){
            String replaceString = sentence1.replace("*", sentence2 );
            System.out.println(replaceString);
         }
               
      }
   }
      
      
}
   

