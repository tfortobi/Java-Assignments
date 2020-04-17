/*
 * Array Creation and Loop
 *
 * A student wants an algorithm to find the hardest spelling
 * word in a list of vocabulary. They define hardest by the longest word.
 * Write the code to find the longest word stored in an array of Strings called list.
 * If several words have the same length it should print the first word 
 * in list with the longest length.
 * For example, if the following list were declared:
 * 
 *     String list [] = {"high", "every", "nearing", "checking", "food ", 
 *     "stand", "value",  "best", "energy", "add", "grand", "notation",
 *     "abducted", "food ", "stand"};
 * 
 * It would print:
 *     checking 
 */ 

class ArrayCreateLoopFawole {
  
    //public means that it is accessible to any other methods requesting the information contained
    //static means that it is immutable 
   public static String list[] = {"high", "every", "nearing", "checking", "food ", "stand", "value", "best", "energy", "add", "grand", "notations", "abducted", "food ", "stand"};
  
   public static void main(String[] args){
    
      
     
   
    //making the first word in array the max
      int max = list[0].length();   
      String word = " ";
      //going through the array and seeing what word is the longest
      for ( int i = 1; i < list.length; i++ ) {
         if (list[i].length() > max) {
            max = list[i].length();
            //making all the the max words index equal to word
            word = list[i];
         } 
      }
         //printing word that is the longest in the array
      System.out.println("The longest Word is: " + word);
      
   }
}
