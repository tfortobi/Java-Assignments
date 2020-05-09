/* 
   Pascal's Triangle
   
   You will create an application that accepts an input from a user on how many lines of Pascal's Triangle they want to see output.
   You will then use System.out.format to output the information in a format that looks like a pyramid.
   
   Sample Run:
   Print how many rows: 5
             1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1
   
*/
import java.util.Scanner;
public class PascalTriangleFawole {
     
   public static void main(String[] args) {
      var scan = new Scanner(System.in);
        //ask for the number of rows to print the triangle 
      System.out.println("How many rows of the Triangle should I print?");
      int rows = scan.nextInt();
      int count = 0;
      
      while(rows != 0){
         if(count != 0){
         //asking amount of rows until zero is entered
            System.out.println("How many rows of the Triangle should I print?");
            rows = scan.nextInt();
         }
        //initialize each line with a 1
         for(int i = 0; i < rows; i++){
            int number = 1;
            //print spaces before each line 
            System.out.format("%" + (rows - i) * 2 + "s", " ");
            for(int j = 0; j <= i;j++){
               //print each number for each line with spaces
               System.out.format("%4d", number); 
               number = number * (i - j) / (j + 1); 
            }
             //create a new line
            System.out.println("\n");   
         }
         count++;
      }        
   }
}