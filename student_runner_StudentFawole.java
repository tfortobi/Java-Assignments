/*
 * Static Vs. Instance
 * 
 */
import java.io.IOException;
import java.util.Scanner;
public class student_runner_StudentFawole
{
   public static void main(String str[]) throws IOException	{
   //calling the Student Fawole method 4 times to print each student
      StudentFawole s1 = new StudentFawole();
      System.out.println(s1 + "\n");
      
      StudentFawole s2 = new StudentFawole();
      System.out.println(s2 + "\n");
      
      StudentFawole s3 = new StudentFawole();
      System.out.println(s3 + "\n");
      
      StudentFawole s4 = new StudentFawole();
      System.out.println(s4 + "\n");
      
      
      
   
      /*please create three more constructors and that is all for the runner, all other business is done in the Student class.
      Student s1 = new Student("Orange", "Julius", 1, 2.5);
   	System.out.println(s1 + "\n");
      */
   }

}