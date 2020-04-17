/*
 * Seconds Conversion
 * 
 * Write a method that accepts a number of seconds and prints the
 * correct number of hours, minutes and seconds.
 * 
 * This method must be called realTime() and its parameter must be an integer. 
 * 
 * Calling realTime(6342) would print the following:
 * 
 *      Hours: 1
 *      Minutes: 45
 *      Seconds: 42
 */


import java.util.Scanner;

class SecondsConvFawole {
  
    //fill in the rest of the method declaration realTime( )
   public static void realTime(int secs)
   {
     //secs == x
    
    
      int p1 = secs % 60;
      int p2 = secs / 60;
      int p3 = p2 % 60;
      p2 = p2 / 60;
      int seconds = p1;
      int minutes = p3;
      int hours = p2;
      System.out.print("Hours: " + hours + "\nMinutes: " + minutes + "\nSeconds: " + seconds);
   }
    
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter the number of seconds:");
      int x = scan.nextInt();
         
      realTime(x);
   }
}