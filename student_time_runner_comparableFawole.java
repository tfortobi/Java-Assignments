/*
 * Time Comparable
 * Use this runner file to test your Time Comparable solution after customizing it to your class file.
 */

import java.io.IOException;
import java.util.Scanner;

class student_time_runner_comparable
{

	public static void main(String str[]) throws IOException
	{

		Scanner scan = new Scanner(System.in);
      
      System.out.println("\n*********Time Conversion**********\n");
      
      //Time Conversion
      TimeFawole time1 = new TimeFawole(14, 56);
      System.out.println("time1: " + time1);
      System.out.println("convert time1 to standard time: " + time1.convert());
      System.out.println("time1: " + time1);
      System.out.print("increment time1 five times: ");
      time1.increment();
      time1.increment();
      time1.increment();
      time1.increment();
      time1.increment();
      System.out.println(time1 + "\n");
      
      TimeFawole time2 = new TimeFawole(-7, 12);
      System.out.println("time2: " + time2);
      System.out.print("increment time2 67 times: ");
      
      for (int i = 0; i < 67; i++)
         time2.increment();
      
      System.out.println(time2);
      System.out.println("convert to time2 standard time: " + time2.convert());
      System.out.println("time2: " + time2 + "\n");

  
      TimeFawole time3 = new TimeFawole(5, 7);
      System.out.println("time3: " + time3);
      System.out.print("convert time3: ");
      System.out.println(time3.convert());
  
      TimeFawole time4 = new TimeFawole(12, 15);
      System.out.println("\ntime4: " + time4);
      System.out.println("convert time4: " + time4.convert());

      TimeFawole time5 = new TimeFawole(0, 15);
      System.out.println("\ntime5: " + time5);
      System.out.println("convert time5: " + time5.convert());
  
      TimeFawole time6 = new TimeFawole(24, 15);
      System.out.println("\ntime6: " + time6);
      System.out.println("convert time6: " + time6.convert());
  
      TimeFawole time7 = new TimeFawole(23,59);
      System.out.println("\ntime7: " + time7);
      System.out.println("convert time7: " + time7.convert());
      time7.increment();
      System.out.println("increment time7: " + time7);
      System.out.println("convert time7: " + time7.convert());

		System.out.println("\n*********Time Comparable**********\n");
      
      //Time Comparable
		TimeFawole t1 = new TimeFawole(17, 12);
		System.out.println(t1);

		TimeFawole t2 = new TimeFawole(9, 45);
		System.out.println(t2);
		System.out.println("Greater Than:");
		System.out.println(t1.compareTo(t2));
		System.out.println("Less Than:");
		System.out.println(t2.compareTo(t1));
		System.out.println("Times equal:");
		
     TimeFawole t3 = new TimeFawole(9, 45);
		System.out.println(t3.compareTo(t2));
		System.out.println("Hours equal:");
      
		TimeFawole t4 = new TimeFawole(8, 45);
		TimeFawole t5 = new TimeFawole(8, 34);
		System.out.println(t4.compareTo(t5));
		System.out.println(t5.compareTo(t4));
		System.out.println("Difference");
		System.out.println(t4.difference(t5));
		System.out.println(t5.difference(t4));
		System.out.println(t4.difference(t4));
      
    }     
}

