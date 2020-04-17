/*
 * Java Constants 
 * 
 * In this lab we are going to investigate the data from a
 * grey seal named Gracie. We'll input the longitude and
 * latitude data from a tracking device. We want to investigate 
 * the farthest north, south, east and west Gracie has been.
 * 
 * We will use the latitude to measure this.
 * Write a program to enter Gracie's longitude and Latitude data. 
 * Each time through the loop it should ask if you want to continue. 
 * Enter 1 to repeat, 0 to stop.
 * 
 * Any value for latitude not between -90 and 90 inclusive should be ignored.
 * 
 * Any value for longitude not between -180 and 180 inclusive should be ignored.
 *
 *
 *          Sample Run:
 *
 *              Please enter the latitude:
 *              41.678
 *              Please enter the longitude:
 *              69.938
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.755
 *              Please enter the longitude:
 *              69.862
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.829
 *              Please enter the longitude:
 *              69.947
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              300
 *              Please enter the longitude:
 *              69.947
 *              Incorrect Latitude or Longitude
 *              Please enter the latitude:
 *              41.827
 *              Please enter the longitude: 
 *              69.904
 *              Would you like to enter another location?
 *              0
 *              Farthest North: 41.829
 *              Farthest South: 41.678
 *              Farthest East: 69.947  
 *              Farthest West: 69.862
 *   
 */ 


import java.io.*;
import java.util.Scanner;

class JavaConstantsFawole{
   public static void main(String[] args)
   {
     
      Scanner scan = new Scanner(System.in);
     //defining all my variables and making z 0 to make sure while loop continues
      int z = 0; //counter variable
      double fn = Integer.MIN_VALUE;
      double fe = Integer.MIN_VALUE;
      double fs = Integer.MAX_VALUE;
      double fw = Integer.MAX_VALUE;
   
      while(z != 1)
      {
      //getting the coordinates and finding out what is the farthest for each direction
         System.out.println("Please enter the latitude: ");
         double a = scan.nextDouble(); 
         if (a < fs){
            fs = a;
         }
         if (a > fn){
            fn = a;
         }
      
         System.out.println("Please enter the longitude: ");
         double b = scan.nextDouble();
         if (b < fw){
            fw = b;
         }
         if (b > fe){
            fe = b;
         }
      
      //checking if any input is wrong
         if( a < -90 || a > 90 || b < -180 || b > 180)
         {
            System.out.println("Incorrect latitude or longitude");
         }
      
      //seeing if user wants to continue
         if( a > -90 && a < 90 && b > -180 && b < 180){
            System.out.println("Would you like to enter another location (enter 1 to continue and 0 to stop): ");
            int v = scan.nextInt();
            if(v == 0){
            //displaying farthest each direction
               System.out.println("Farthest North: " + fn);
            
               System.out.println("Farthest South: " + fs);
            
               System.out.println("Farthest East: " + fe);
            
               System.out.println("Farthest West: " + fw);
               z++; //counter variable
            
            
            
            }
         }
      }
   }
        
  
    
}
