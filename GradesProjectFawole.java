/*
 *  
 For this assignment, write a program that will input a set of grades and compute a weighted average.
The program should input 2 test scores (as ints), 3 quiz scores (also as ints) and a homework average (as a double).
The program should then output the test average, quiz average and final grade (as doubles).
The final grade should be a weighted average. Count the test average as 50% of the final grade, 
the quiz average as 30% of the final grade and the homework average as 20% of the final grade.

Sample Run:
Please enter your test grades.
Test 1: 89
Test 2: 86

Please enter your quiz grades.
Quiz 1: 84
Quiz 2: 84
Quiz 3: 83

Please enter your homework average.
Homework: 90.12

Test Average: 87.5
Quiz Average: 83.66666666666667
Final Grade: 86.874
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class GradesProjectFawole{


     public static void main (String str[]) throws IOException {

            Scanner scan = new Scanner (System.in);
            
            //Getting test grades and average
            System.out.println("Enter the grades of your 2 tests: \n Test 1 = ");
            double test1 = scan.nextDouble();
            System.out.println("Test 2 = ");
            double test2 = scan.nextDouble();
            double averageTest = ((test1 + test2) / 2);
            
            
            //Getting quiz grades and average
             System.out.println("Enter the grades of your 3 quizzes: \n Quiz 1 = ");
            double quiz1 = scan.nextDouble();
            System.out.println("Quiz 2 = ");
            double quiz2 = scan.nextDouble();
            System.out.println("Quiz 3 = ");
            double quiz3 = scan.nextDouble();
            double averageQuiz = ((quiz1 + quiz2 + quiz3) / 3);
            
            //Getting homework average
            System.out.println("Please enter your homwork average: ");
            double averageHomework = scan.nextDouble();
            
            
            //Printing averages
            System.out.println("Your test average is: " + averageTest);
            System.out.println("Your Quiz average is: " + averageQuiz);
            
            //Finding final grade and printing it
            double weightedTest = averageTest * .5;
            double weightedQuiz = averageQuiz * .3;
            double weightedHomework = averageHomework * .2;
            double finalGrade = weightedTest + weightedQuiz + weightedHomework;
            System.out.println("Your final Grade is: " + finalGrade);
            
            
            
            
            
          

     }

}


