import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
	
	// Add Constructor
	TrueFalseQuestion(String question, String answer)
	{
		// Initialize question
		this.question = "TRUE or FALSE: " + question;
		
		
		answer = answer.toUpperCase();
		
		// Process answer variants
		if(answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) // Valid option.
		{
			// Initialize correctAnswer
			correctAnswer = "FALSE";
		}
		else if(answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) // Valid option
		{
			// Initialize correctAnswer
			correctAnswer = "TRUE";
		}
		else
		{
			// Invalid correctAnswer. Can throw IllegalArgumentException here.
			correctAnswer = "";
		}
		
		
	}
	
	@Override
	String ask() {
		
		while(true) {
			// Ask the question
			String answer = JOptionPane.showInputDialog(question);
			
			// Change answer to upper case
			answer = answer.toUpperCase();
			
			if(answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) // Valid option.
			{
				return "FALSE";
			}
			else if(answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES"))// Valid option
			{
				return "TRUE";
			}
			else // Invalid option
			{
				JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE");
			}
		}
	}
}
