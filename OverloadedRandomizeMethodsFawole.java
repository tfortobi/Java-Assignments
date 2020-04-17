/*
 * Overloaded Randomize Methods
 * 
 * Write four overloaded methods called randomize. Each method will
 * return a random number based on the parameters that it receives:
 * 
 * Write four overloaded methods called randomize. 
 * Each method will return a random number based on the parameters that it receives:
 * randomize() - Returns a random int between min and max inclusive. Must have two int parameters. 
 * randomize() - Returns a random int between 0 and max inclusive. Must have one int parameter. 
 * randomize() - Returns a random double between min and max inclusive. Must have two double parameters. 
 * randomize() - Returns a random double between 0 and max inclusive. Must have one double parameter. 
 * 
 * Because these methods are overloaded, they should be declared in the same class. 
 * 
 */
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

class OverloadedRandomizeMethodsFawole {
  
    /*randomize()
     * This method must have two int paramters called min and max. 
     * This method returns a random int between min and max inclusive. 
   */
   public static int maxMin(int max, int min){
      int s = (int) (Math.random() * (max - min)+ 1) + min;
      return s;
   }
     
    /*randomize()
      * This method must have one int parameter max. 
      * Returns a random int between 0 and max inclusive.
    */
   public static int zeroMax(int max){
      int d = (int) (Math.random() * max);
      return d;
   }
    /*randomize()
     * This method must have two double parameters. 
     * This method returns a random double between min and max inclusive.    
    */
   public static double minMax(int min, int max){
      double n = (double) (Math.random() * (max - min) + 1) + min;
      return n;
   
   }
    /*randomize()
     * This method must have one double parameter.
     * This method returns a random double between 0 and max inclusive.    
    */
   public static double maxZero(int max){
      double f = (double) (Math.random() * max);
      return f;
   }
   
   
   
     
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter a maximum: ");
      int max = scan.nextInt();
      System.out.println("Please enter a minimum: ");
      int min = scan.nextInt();
    
      maxMin(max, min);
      zeroMax(max);
      minMax(max, min);
      maxZero(max);
    
      //randomize 1
      System.out.println("Random int between min and max: " + maxMin(max, min));
      //randomize 2
      System.out.println("Random int between zero and max: " + zeroMax(max));
      //randomize 3
      System.out.println("Random double between min and max: " + minMax(max, min));
      //randomize 4
      System.out.println("Random double between zero and max: " + maxZero(max));
   }
}