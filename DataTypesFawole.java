/*
1. Input two doubles and print them backwards on the screen.

  So if the user enters:

1.3 6.8
  It should output:

6.8 1.3
  Notice there is exactly one space between the numbers.
  
2. Ask the user their name and age and print out how many years until they are 100. Note that age should be an integer, not a double.

  Sample run:

Hi there. What is your name?
Pascal
Hi Pascal. How old are you?
16
Pascal, you will be 100 in 84 years.


*/
import java.util.Scanner;
class DataTypesFawole {
    public static void main(String[] args){
    Scanner scan = new Scanner( System.in );
    Scanner scanned = new Scanner( System.in );
 
       //inputing two numbers
       System.out.println("Input two numbers: ");
       //scanning for the numbers
       double firstNumber =scan.nextDouble();
       double secondNumber =scan.nextDouble();
      //output them opposite
       System.out.println(secondNumber+" " + firstNumber);
       
       String n;
       
       //Asking for name
       System.out.println("Hi there, what is your name?");
       n = scanned.nextLine();
       
       //Asking for age
       System.out.println("Hi "+ n +". How old are you?");
       int age= scan.nextInt();
       int x = 100-age;
       System.out.println(n+", you will be 100 in "+ x +" years.");

        }
}