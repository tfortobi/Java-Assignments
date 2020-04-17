/*
 * Part 1: Light
 * A class which represents a single light bulb.
 
 For this assignment, you will be writing a class called Light that represents a single light bulb. 
 Your job is to add code to Light.java so that your implementation meets the requirements specified below. 
 To complete the assignment, replace all the /* missing code (*)/ comments in the file with your own code. 
  
 You will need to customize Light to reflect LightLastname.
 
 In this assignment, the class is required to be named LightLastname.
 Light.java includes a main method that will help test your code. 
 In order to fully test the Light class, you will need to add more test cases to the main method. 
 At a minimum, run the main to make sure your implementation output matches the sample run listed below. 
 
 Variables:
 boolean on - Represents whether the light bulb is on or off. Set to true if the light bulb is on, false if off.
 boolean burntOut - Represents whether the light is burnt out or working properly. Set to true if the light bulb is burnt out, false if it is working.
 String color - Represents the color of the light bulb with possible values of "red", "blue", "green" and "white". No other color values are allowed.
 
 Methods:
 Light() - Default constructor that sets the bulb to on, not burnt out, and "white".
 Light(boolean o, boolean b, String c) - This constructor sets the on variable to the parameter o. 
   The burntOut variable is set to the parameter b. If burntOut is true, on is set to false, no matter what value is stored in o. 
   The color variable is set to c only if c is "red", "green" or "blue". 
   The constructor ignores the case of the value in c, and stores the value as a lower-case String. 
   If c holds any value other than "red", "green" or "blue", color will be set to "white".
 String toString () - returns a String with the Light in the format:
   off red burnt out on green not burnt out 
   Notice there is one space between "off"/"on" and the value for color, and a tab before the "burnt out" or "not burnt out".
 void flip() - This method changes the bulb from on to off, or visa versa. 
   If the burntOut variable is true, then the on variable may only be set to false.
 String getColor() - This method returns the color of the light bulb.
 void setColor(String c) - The color variable is set to c only if c is "red", "green" or "blue", ignoring case. 
   The value stored for color should be lower case. 
   If c holds any value other than "red", "green" or "blue" (ignoring case), the method sets the color to "white".
 boolean isOn() - Returns true if on, false otherwise.
 void burnOut() - Sets burntOut to true.

 Sample Run:
1. Test Light()
*** PASS: on is set correctly (true)
*** PASS: burntOut is set correctly (false)
*** PASS: color is set correctly (white)
*** PASS: toString produced the correct output (on white not burnt out)

2. Test Light(boolean b, boolean o, String c)
*** PASS: on is set correctly (false)
*** PASS: burntOut is set correctly (true)
*** PASS: color is set correctly (green)
*** PASS: toString produced the correct output (off green burnt out)

3. Test burnOut()
*** PASS: on is set correctly (false)
*** PASS: burntOut is set correctly (true)
*** PASS: color is set correctly (white)
*** PASS: toString produced the correct output (off white burnt out)

4. Test flip()
light3 is on
*** PASS: on is set correctly (true)
*** PASS: burntOut is set correctly (false)
*** PASS: color is set correctly (white)
*** PASS: toString produced the correct output (on white not burnt out)
now light3 should be off
*** PASS: on is set correctly (false)
*** PASS: burntOut is set correctly (false)
*** PASS: color is set correctly (white)
*** PASS: toString produced the correct output (off white not burnt out)
now light3 should be back on
*** PASS: on is set correctly (true)
*** PASS: burntOut is set correctly (false)
*** PASS: color is set correctly (white)
*** PASS: toString produced the correct output (on white not burnt out)
light1 is burned out and off, we can't flip it on
*** PASS: on is set correctly (false)
*** PASS: burntOut is set correctly (true)
*** PASS: color is set correctly (white)
*** PASS: toString produced the correct output (off white burnt out)


5. Test isOn()
*** PASS: isOn() working properly
*** PASS: isOn() working properly

6. Test getColor()
*** PASS: getColor() working properly

7. Test setColor(String)
*** PASS: color is set correctly (red)
*** PASS: color is set correctly (blue)
*** PASS: color is set correctly (white)
 */

public class LightFawole
{
   boolean on;
   boolean burntOut;
   String color;
	

   public LightFawole(){
      on = true;
      burntOut = false;
      color = "white";
   }
   
   
   LightFawole(boolean o, boolean b, String c){
      on = o;
      burntOut = b;
      if(burntOut == true)
         on = false;
      if(c.toLowerCase().equals("red") || c.toLowerCase().equals("green") || c.toLowerCase().equals("blue")){
         color = c.toLowerCase();
      }
      else{
         color = "white";
      }
   
   }
   
   
   public String toString (){
   String onOff = "";
   String burnOut = "";
   String colorChange = "";
   if(on == true){
   onOff = "on ";
   }
   if(on == false){
   onOff = "off ";
   }
    if(burntOut == true){
   burnOut = "\tburnt out";
   }
   if(burntOut == false){
   burnOut = "\tnot burnt out";
   }
   colorChange = color.toLowerCase();
   
      return onOff + colorChange + burnOut;
   }
   
   
   public void flip(){
      if(burntOut == true){
         on = false;
      }
      else
      {
        on = !on;
      }
   }
   
   
   public String getColor(){
      return color;
   }
   
   
   public void setColor(String c){
      if(c.toLowerCase().equals("red") || c.toLowerCase().equals("green") || c.toLowerCase().equals("blue")){
         color = c.toLowerCase();
      }
      else{
         color = "white";
      }
   
   }
   
   
   public boolean isOn(){
      return on;
   }
   
   public void burnOut(){
      burntOut = true;
   }
	
		/* missing code */
	

	// This constructor sets the variable "on" to the parameter o. The burntOut
	// variable is set to the parameter b. If burntOut
	// is true, on is set to false, no matter what value is stored in o.
	// The color variable is set to the parameter c only if c is "red", "green"
	// or "blue". The constructor ignores the case of the value in c. If c holds
	// any value other than "red", "green" or "blue", the constructor sets
	// color to "white".
	   
      /* missing code */

	// The toString method returns a String with the Light in the format:
	// off red    burnt out
	// on green    not burnt out
	//
	// Notice there is one space between "off"/"on" and the value for color,
	// and a tab before the "burnt out" or "not burnt out".
	
      /* missing code */

	// This method changes the bulb from on to off, or visa versa. If the
	// burntOut variable is true, then the on variable may only be set to false.
	
      /* missing code */

	// The getColor method returns the color of the bulb.
	   
      /* missing code */

	// The setColor method sets the color of the Light. The color variable is
	// set to c only if c is "red", "green" or "blue". The method ignore the
	// case of the value in c. If c holds any value other than "red", "green"
	// or "blue", color will be set to "white".
	
      /* missing code */

	// The isOn method returns true if on, false otherwise.
	
      /* missing code */

	// The burnOut method sets the variable burntOut to true, is there another consideration when true...
	   
      /* missing code */
   
   //****************DO NOT EDIT ANYTHING BELOW****************
   public static void main(String[] args)
   {
        
        /* The main method allows you to run Light on its own, with a built-in tester. */
        
   	//*************************************************************************
   	// 1. Test Light()
   	//*************************************************************************
      LightFawole light1 = new LightFawole();
      System.out.println("1. Test Light()");
      testLight(light1, true, false, "white", "on white\tnot burnt out");
   
   	//*************************************************************************
   	// 2. Test Light(boolean b, boolean o, String c)
   	//*************************************************************************
      System.out.println("\n2. Test Light(boolean b, boolean o, String c)");
      LightFawole light2 = new LightFawole(true, true, "GreeN");
   	// Notice that since the light bulb is "burnt out", the value of "on"
   	// gets set to false. Also, the color should get saved in all lower case
   	// as "green", not "GreeN".
      testLight(light2, false, true, "green", "off green\tburnt out");
   	
   
   	//*************************************************************************
   	// 3. Test burnOut()
   	//*************************************************************************
      System.out.println("\n3. Test burnOut()");
   	// light1 is not burnt out. Lets call burnOut on light1 and make sure it gets burnt out and turned off
      light1.burnOut();
      testLight(light1, false, true, "white", "off white\tburnt out");
   
   
   	//*************************************************************************
   	// 4. Test flip()
   	//*************************************************************************
      System.out.println("\n4. Test flip()");
      LightFawole light3 = new LightFawole();
   	// light3 is currently on and not burnt out.  Lets flip the light off and on and see if it works properly.
      System.out.println("light3 is on");
      testLight(light3, true, false, "white", "on white\tnot burnt out");
      light3.flip();
      System.out.println("now light3 should be off");
      testLight(light3, false, false, "white", "off white\tnot burnt out");
      light3.flip();
      System.out.println("now light3 should be back on");
      testLight(light3, true, false, "white", "on white\tnot burnt out");
   	// Try to flip light1 on - this should fail since light1 is burnt out. light1 should stay off
      System.out.println("light1 is burned out and off, we can't flip it on");
      light1.flip();
      testLight(light1, false, true, "white", "off white\tburnt out");
   
   	//*************************************************************************
   	// 5. Test isOn()
   	//*************************************************************************
      System.out.println("\n5. Test isOn()");		
   	// We know light1 is off, and light3 is on.  Verify that the method isOn reports this correctly.
      if (!light1.isOn())
      {
         System.out.println("*** PASS: isOn() working properly");
      }
      else 
      {
         System.out.println("*** FAIL: isOn() not working properly");
      }
      if (light3.isOn())
      {
         System.out.println("*** PASS: isOn() working properly");
      }
      else 
      {
         System.out.println("*** FAIL: isOn() not working properly");
      }
   
   	//*************************************************************************
   	// 6. Test getColor()
   	//*************************************************************************
      System.out.println("\n6. Test getColor()");
      if (light1.getColor().equals("white"))
      {
         System.out.println("*** PASS: getColor() working properly");
      }
      else 
      {
         System.out.println("*** FAIL: problem with getColor()");
      }
   
   	//*************************************************************************
   	// 7. Test setColor(String)
   	//*************************************************************************
      System.out.println("\n7. Test setColor(String)");
      light1.setColor("red");  
      System.out.println("*** " + testLightColor(light1, "red"));
      light1.setColor("BLUE");  // should set light to blue
      System.out.println("*** " + testLightColor(light1, "blue"));
      light1.setColor("yellow"); // yellow is not allowed, should set light to white
      System.out.println("*** " + testLightColor(light1, "white"));		
   }

	// Private helper methods

   private static void testLight(LightFawole light, boolean o, boolean b, String c,
   		String string)
   {
      System.out.println("*** " + testLightOn(light, o));
      System.out.println("*** " + testLightburntOut(light, b));
      System.out.println("*** " + testLightColor(light, c));
      System.out.println("*** " + testLightToString(light, string));
   }

   private static String testLightOn(LightFawole bulb, boolean o)
   {
      if ((bulb.on && !o) || (!bulb.on && o))
      {
         return "FAIL: on is not set correctly. on should be set to "
            	+ o + ", but it is set to " + bulb.on + ".";
      }
      else
      {
         return "PASS: on is set correctly (" + bulb.on + ")";
      }
   }

   private static String testLightburntOut(LightFawole light, boolean b)
   {
      if ((light.burntOut && !b) || (!light.burntOut && b))
      {
         return "FAIL: burntOut is not set correctly (burntOut should be set to "
            	+ b + ", but it is set to " + light.burntOut + ")";
      }
      else
      {
         return "PASS: burntOut is set correctly (" + light.burntOut + ")";
      }
   }

   private static String testLightColor(LightFawole light, String c)
   {
      if (!light.color.equals(c))
      {
         return "FAIL: color is not set correctly (color should be set to "
            	+ c + ", but it is set to " + light.color + ")";
      }
      else
      {
         return "PASS: color is set correctly (" + light.color + ")";
      }
   }

   private static String testLightToString(LightFawole light, String string)
   {
      String output;
   	
      if (light.toString().equals(string))
      {
         output = "PASS: toString produced the correct output";
      }
      else
      {
         output = "FAIL: toString does not work as expected";
      }
      return output + " (" + light.toString() + ")";
   }
}