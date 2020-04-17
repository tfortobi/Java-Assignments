/*
1. Input two double values and print the difference between them. (The difference can be found by 
subtracting the second value from the first).

2. Input four integer values and print the sum of all four values.

3. Input the radius of a circle and print the circumference and area. The answer should be a decimal value.

  Remember the formula for circumference is 2 * pi * r and the formula for area is pi * r * r. 
  You can use 3.14 for the value of pi in this activity.

  Sample Run:

Enter a radius:
4
Circumference: 25.12
Area: 50.24

4. Ask the user to enter the price of an item and tell them how much money they would get back from $20. 
It's okay to return a negative number. Also, Don't forget to include the dollar sign.

  Sample Run:

Enter a price:
3.50
Change from $20: $16.5


*/
import java.util.Scanner;

class ExpressionsFawole {
    public static void main(String[] args) {
    
      Scanner scan = new Scanner (System.in);
//asking for two values and finding the difference
        System.out.println("1\n***********************\n");
            System.out.println("Enter two values: 1.");
            int x = scan.nextInt();
            System.out.println("2. ");
            int y =scan.nextInt();
            System.out.println("The difference is: " + (x-y));        
        
        
        System.out.println("\n\n2\n***********************\n");
            // adding 2 more values then printing sum of all numbers
          System.out.println("Enter two more values: 1.");
            int n = scan.nextInt();
            System.out.println("2. ");
            int v =scan.nextInt();
            System.out.println("The sum of all your values is: " + (y+x+v+n));        
        
        
        
        System.out.println("\n\n3\n***********************\n");
            // radius of circle then finding circumfrence and area 
            System.out.println("Input a radius for a circle: ");
            int r = scan.nextInt();
            double pi = 3.14;
            //circumfrence
            System.out.println("Circumfrence: " + (2*pi*r));
            //area
            System.out.println("Area: "+ (pi*r*r*100/100));
            
        
        
        System.out.println("\n\n4\n***********************\n");
            // Asking user to enter price of item
            System.out.println("Enter Price of item: "); 
            //scanning for integer typed
            int c = scan.nextInt();
           //change from 20
            int a = 20 - c;
            
            System.out.println("Change from $20: $" + a);       
            
  }
}