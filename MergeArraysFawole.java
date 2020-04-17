/*
 * Merge Arrays
 *
 * You will request integers to be placed in two arrays. The numbers should be input in order, if they are not, you will print
 * ERROR: Array not in correct order
 * The user will input a negative number to stop the input in each array. You will then display the contents of each array, not
 * including the negative number. If they were entered in the correct order and there is no error, you will merge the two arrays, 
 * put them in numercial order and display the merged array.
 *
 * Sample Run 1:
 * Enter the values for the first array, up to 10,000 values, enter a negative number to quit.
 * 2
 * 4
 * 6
 * -1
 *
 * Enter the values for the second array, up to 10,000 values, enter a negative number to quit.
 * 1
 * 3
 * 5
 * -1
 * 
 * First Array:
 * 2 4 6 
 *
 * Second Array:
 * 1 3 5 
 *
 * Merged Array:
 * 1 2 3 4 5 6
 *
 * Sample Run 2:
 * Enter the values for the first array, up to 10000 values, enter a negative number to quit
 * 2
 * 3
 * 1
 * -1
 * 
 * Enter the values for the second array, up to 10000 values, enter a negative number to quit
 * 3
 * 2
 * 1
 * -1
 *
 * First Array:
 * 2 3 1 
 * 
 * Second Array:
 * 3 2 1 
 * 
 * ERROR: Array not in correct order
 */
 

import java.io.*;
import java.util.Scanner;

//libraries to use and manipulate arrays
import java.util.ArrayList;
import java.util.Arrays;

class MergeArraysFawole {

   public static void main(String args[]) {
      {
         Scanner scan = new Scanner(System.in);
      //establish variables to accept integer input, boolean for correct order and two array counters
         int array1;
         int array2;
         int count = 0;
         int count1 = 0;
         int count2 = 0;
         int i = 0;
         int s = 0;
         int stopper = 0;
      
      
      //instantiate two arrays that will accept 10000 elements each
         int[] firstArray = new int[10000];
         int[] secondArray = new int[10000];
         
      
      //request input of numbers to place in 1st array
         System.out.println("Enter the values for the first array, up to 10,000 values, enter a negative number to quit.");
         array1 = scan.nextInt();
      
      
      //loop that will accept all values and add them to an individual index in the first array
         while(array1 > -1){
            firstArray[i] = array1;
            array1 = scan.nextInt();
            count1++;   
            i++;
         }
         
      
      //request input of numbers to place in 2nd array
         System.out.println("Enter the values for the second array, up to 10,000 values, enter a negative number to quit.");
         array2 = scan.nextInt();
      
      //loop that will accept all values and add them to an individual index in the second array
         while(array2 > -1){
            secondArray[s] = array2;
            array2 = scan.nextInt();
            count2++;   
            s++;
         }
         
            
      //display 1st array and check for valid order
         System.out.println("First Array: ");
         for(int z = 0; z < count1; z++){
            System.out.print(firstArray[z] + " ");
         }
         for(int z = 0; z < count1 - 1; z++){
            if(firstArray[z] > firstArray[z + 1]){
               System.out.println("\nERROR: Array one not in correct order");
               stopper++;
            }
         }
         
      //display 2nd array and check for valid order
      //if elements are in the wrong order, display an error
         System.out.println("\n" + "Second Array: ");
         for(int z = 0; z < count2; z++){
            System.out.print(secondArray[z] + " ");
         }
         for(int z = 0; z < count2 - 1; z++){
            if(secondArray[z] > secondArray[z + 1]){
               System.out.println("\nERROR: Array two not in correct order");
               stopper++;
            }
         }
         //else merge the arrays in to a new integer array variable and display Merged Array: and all of the elements in order
         int[] mergedArray = new int[count1 + count2];
         if(stopper == 0){ 
         
            for(int p = 0; p < count1; p++) { 
               mergedArray[count] = firstArray[p];
               count++;
            } 
            for(int p = 0; p < count2;p++) { 
               mergedArray[count] = secondArray[p];
               count++;
            } 
            Arrays.sort(mergedArray);
            System.out.print("\nMerged Array: \n");
            for(int p = 0;p < count1 + count2;p++){ 
               if(p < count1 + count2)
                  System.out.print(mergedArray[p]+" ");
            } 
         }
      }
   }
   
}

         
  
