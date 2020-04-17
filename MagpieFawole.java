public class MagpieFawole{
	
   public String getGreeting(){
		return "Yooooo, its Magpie the Chatbot. You wanna talk with me?";
	}
	
	public String getResponse(String statement){
		String response = "";
		if (statement.length() == 0){
			response = "You good?";
		}

		if (findKeyword(statement, "no") >= 0){
			response = "Sorry to hear that, im still gonna talk though. How was your day?";
		}
      if (findKeyword(statement, "yes") >= 0){
			response = "Cool, tell me about your day.";
		}


		
		 if (findKeyword(statement, "good", 0) >= 0){
			response = goodDay(statement);
		}
      else if (findKeyword(statement, "bad", 0) >= 0){
			response = badDay(statement);
		}

		else{
			
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0 && (findKeyword(statement, "me", psn) >= 0)){
				response = manipulateStatement(statement);
			}
			else{
				response = getRandomResponse();
			}
		}
		return response;
	}
	
	private String goodDay(String statement){
		final int NUMBER_OF_RESPONSES = 3;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0){
			response = "Good, tell me about your family.";
		}
		else if (whichResponse == 1){
			response = "Nice, how is your family?";
		}
		else if (whichResponse == 2){
			response = "good to hear, now what about your family";
		}
      return response;
	}


private String badDay(String statement){
		final int NUMBER_OF_RESPONSES = 3;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0){
			response = "lets talk about soemthing else then, how is your family?";
		}
		else if (whichResponse == 1){
			response = "do you have any family that can help you with that?";
		}
		else if (whichResponse == 2){
			response = "Sorry to hear, now tell me about your family.";
		}
      return response;
	}

	private String manipulateStatement(String statement){
		
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
      
		if (lastChar.equals(".")){
			statement = statement.substring(0, statement.length() - 1);
		}
		
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "Why do you think I " + restOfStatement + " you?";
	}
	
	private int findKeyword(String statement, String goal, int startPos){
		String phrase = statement.toLowerCase().trim();
		
		int psn = phrase.indexOf(goal.toLowerCase());
		
		while (psn >= 0) {
			String before = " ", after = " "; 
         
			if (psn > 0){
				before = phrase.substring (psn - 1, psn).toLowerCase();
			}
         
			if (psn + goal.length() < phrase.length()){
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
         
			if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  
            && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0))){
				return psn;
			}
			
			
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
			
		}
		
		return -1;
	}
	
	private int findKeyword(String statement, String goal){
		return findKeyword (statement, goal, 0);
	}

	private String getRandomResponse(){
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0){
			response = "Tell me more";
		}
		else if (whichResponse == 1){
			response = "You just tought me something new.";
		}
		else if (whichResponse == 2){
			response = "Cool";
		}
		else if (whichResponse == 3){
			response = "Seriously?";
		}

		return response;
	}

}