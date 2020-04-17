/*
 * Time Conversion
 * A class which represents the time of day in hours and seconds.
 For this assignment, you will create a Time class that holds an hour value and a minute value to represent a time. 
 We will be using a 24 hour clock, so 12:01 am is 0001 and 1 pm is 1300. 
 For this assignment, you may assume valid 24h times range from 0000 to 2359. 
 Valid standard times range from 12:00 am to 11:59 pm.
 
 In previous assignments, the requirement was that your class be named Main. 
 In this assignment, the class is required to be named Time.
 Your job will be to add the constructors and methods described in the following sections to the class Time
 that is declared in this template file.
 
 Time should include two constructors:
 Time() - Default constructor that sets the time to 1200.
 Time(int h, int m) - If h is between 1 and 23 inclusive, set the hour to h. Otherwise, set the hour to 0. 
 If m is between 0 and 59 inclusive, set the minutes to m. Otherwise, set the minutes to 0.
 
 Time should include the following methods:
 String toString() - Returns the time as a String of length 4 in the format: 0819. 
   Notice that if the hour or minute is one digit, it should print a zero first. For example, 6 should print as 06.
 String convert() - Returns the time as a String converted from 24h time to standard time. 
   For example, 0545 becomes 5:45 am and 1306 becomes 1:06 pm.
 void increment() - Advances the time by one minute. Remember that 60 minutes = 1 hour. 
   Therefore, if your time was 0359, and you add one minute, it becomes 0400. 2359 should increment to 0000.
 
 To test your code, download the runner class student_time_runner.java into the same folder that holds your Time.java. 
 Execute the method student_time_runner.main, and verify that the output matches the sample run listed below.
 I will use the same runner to grade the program. 
 
 In order to pass all tests, you will need to change student_time_runner.java to test different values to 
 make sure your program fits the requirements. 
 
 Note: You will not be submitting student_time_runner.java. This file is provided to help you test 
 your implementation of the class Time.
 
 Sample Run:
 
time1: 1456
convert time1 to standard time: 2:56 pm
time1: 1456
increment time1 five times: 1501

time2: 0012
increment time2 67 times: 0119
convert to time2 standard time: 1:19 am
time2: 0119

time3: 0517
convert time3: 5:17 am

time4: 1215
convert time4: 12:15 pm

time5: 0015
convert time5: 12:15 am

time6: 0015
convert time6: 12:15 am

time7: 2359
convert time7: 11:59 pm
increment time7: 0000
convert time7: 12:00 am
 */

public class TimeFawole implements Comparable
{//making the varibales
   private int hour;
   private int minute; 
   

   public TimeFawole(){
      hour = 12;
      minute = 0;
   }
   //checking for certain parameters
   public TimeFawole(int h, int m){
     
   
      if(h >= 1 && h <= 23){
         hour = h;
      }
      else{
         hour = 0;
      }
      if(m >= 0 && m <= 59){
         minute = m;
      }
      else{
         minute = 0;
      }
     
   }
   
   //printing the time
   public String toString(){
      String hourConv = "";
      String minuteConv = "";
   
   
   
      if(hour > 10){
         hourConv = "" + hour;
      }
      else{
         hourConv = "0" + hour;
      }
      if(minute > 10){
         minuteConv = "" + minute;
      }
      else{
         minuteConv = "0" + minute;
      }
      
   
      return hourConv + minuteConv;
   }
   
   //converting to standard time and printing
   public String convert(){
      int realTime = 0;
      String minuteConv = "";
      String meridian = "";
   
      if(hour > 12){
         meridian = "pm";
      }
      else{
         meridian = "am";
      }
     
      realTime = hour % 12;
      
      if(hour == 12 || hour == 0){
         realTime = 12;
      }
      
     
      if(minute > 10){
         minuteConv = "" + minute;
      }
      else{
         minuteConv = "0" + minute;
      }
      
      
   
      return  realTime + ":" + minuteConv + " " + meridian;
   }
   
      //adding one minute to time      
   public void increment(){
      minute++;
     
      if(minute == 60){
         hour++;
         minute = 0;
      }
      if(hour == 24){
         hour = 0;
         minute = 0;
      }
     
   }
   
   
   public int compareTo (Object o) {
   
      TimeFawole t = (TimeFawole) o; //casting the Object data type to a Time data type
       
      int num = 0;
       
      if(hour > t.hour){
         num = 1;
      }
      if(hour < t.hour){
         num = -1;
      }
      if(hour == t.hour){
         num = 0;
      }
      
      return num;
   } 
  
  
   public String difference (TimeFawole t) {
      
      String diff = "";
      int differences = 0;
       
      differences = hour - t.hour;
       
      if(differences < 0){
         differences = differences * -1;
      }
      
      int differencesM = 0;
       
      differencesM = minute - t.minute;
       
      if(differencesM < 0){
         differencesM = differencesM * -1;
      }
      
   
   
      diff = "0" + differences + ":" + differencesM ;
   
      return diff;
   } 
     /* Complete required constructors and methods here */
     
           
}