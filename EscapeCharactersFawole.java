/*
 Unit 1 - Lesson 2 - Output in Java - Escape Characters
 
 1. Write a program to print your name to the center of the output screen. 
 Use tabs or spaces to center your output, depending on how wide your screen is. 
 
 2. Write a program to print your name to the center of the output screen on three different lines.
 For an extra challenge: complete this problem using only one line of code.
 
 3. Write a program to output the following:
  ********
  * java *
  ********
  
 4. Write a program to output the following web address:
   http://www.awesomesauce.com//'java'\\
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class EscapeCharacters {
    public static void main(String[] args) {
         //print name in the middle of output screen
         System.out.println("                                                              Tobi");
        
        //print name on center of screen 3 times
        System.out.println("                                                              Tobi\n                                                              Tobi\n                                                              Tobi");
        
        //a program to output java
        System.out.println("********\n*java*\n******** ");
        
        //a program to output a web address
        System.out.println("http://www.awesomesauce.com//'java'\\ ");

        }
}

