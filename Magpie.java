
public class MagpieFawole{
	
   public String getGreeting(){
		return "Hello, I am Maggie the Chatbot, how are you?";
	}
	
	public String getResponse(String statement){
		String response = "";
		if (statement.length() == 0){
			response = "You alright?";
		}

		else if (findKeyword(statement, "no") >= 0){
			response = "Is that so...";
		}

		
		else if (findKeyword(statement, "I dream of", 0) >= 0){
			response = transformIDreamOf(statement);
		}

		else{
			
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0 && (findKeyword(statement, "me", psn) >= 0)){
				response = transformYouMeStatement(statement);
			}
			else{
				response = getRandomResponse();
			}
		}
		return response;
	}
	
	private String transformIDreamOf(String statement){
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		
      if (lastChar.equals(".")){
			statement = statement.substring(0, statement.length() - 1);
		}
      
		int psn = findKeyword (statement, "I dream of", 0);
		String restOfStatement = statement.substring(psn + 10).trim();
		return "Why do you dream about " + restOfStatement + "?";
	}

	private String transformYouMeStatement(String statement){
		
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
      
		if (lastChar.equals(".")){
			statement = statement.substring(0, statement.length() - 1);
		}
		
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "Why do you believe that I " + restOfStatement + " you?";
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
			response = "You've piqued my interest, would you care to elaborate?";
		}
		else if (whichResponse == 1){
			response = "That's cool, but I didn't need to know that.";
		}
		else if (whichResponse == 2){
			response = "Wow.";
		}
		else if (whichResponse == 3){
			response = "Really?";
		}

		return response;
	}

}