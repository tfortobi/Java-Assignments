/*
 * String Buffer Reverse
 *
 * Write a loop that processes an array of strings. 
 * Each String should be printed backwards on its own line.
 * 
 * For example, if the list contains:
 *     
 *     {"every", "nearing", "checking", "food", "stand", "value"}
 * 
 * It should output:
 *     yreve
 *     gniraen
 *     gnikcehc
 *     doof
 *     dnats
 *     eulav
 */ 


import java.lang.StringBuffer; //importing this class so that you can use the methods in the library

class StringBufferReverseFawole {
  
   public static String list[] = {"every", "nearing", "checking", "food", "stand", "value"};
    
   public static void main(String[] args)
   {
     //setting parameters for counter
      for(int i = 0; i < list.length; i++){
      
         StringBuffer array = new StringBuffer(list[i]);
      //reversing all the words in the array
         array.reverse();
      //printing results
         System.out.println(array);
      }
     
   }
      
}
            
      

