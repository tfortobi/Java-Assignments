/*
 * Month and Days
 * 
 * For this lesson you will be asked to write three methods.
 * Write a method that takes an integer for the number of a month then sends that to two relative methods.
 * Your two methods will accept that data sent and then prints the month's name and how many days are in the month.
 * 
 * You must have a method called monthName() and it must have an integer parameter. 
 * You must also have a method called monthDays() and it must have an integer parameter.
 * 
 * You will also need a way of matching the integer with the month and the number of days in that month.
 * This could be done with a mass of if/else like a newb, or you could create a couple arrays like a master.
 *
 * -10 points if you do if/else statements to solve this like a NEWB!!
 * 
 * Sample Run:
 * Please enter your birthday month integer:
 * 9
 * That is the month of September
 * Number of days 30
 */
import java.io.*;
import java.util.Scanner;
class MonthDaysFawole {

   public static void monthName(int name){
      String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      System.out.println("That is the month of " + months[name - 1] + ".");
      monthDays(name);
   }
   public static void monthDays(int days){
      int[] dayz = {31, 28, 31, 30, 31, 30, 31,31, 30, 31, 30, 31};
      System.out.println("Number of days " + dayz[days - 1] + ".");
   }
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter your birth month integer: ");
      int x = scan.nextInt();
   
      monthName(x);
   
   
   }
}