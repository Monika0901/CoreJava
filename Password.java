package PracticeQuestionMethod;

public class Password {
    public String checkPass(String password) {
    	if(password.length() >= 8) {
    		return "Strong";
    	}
    	else {
    		return "weak";
    	}
    }
}
