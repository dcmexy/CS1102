import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {
	
	// Constructor
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer)
	{
		// Initialize question
		question = query + "\n";
		question += "A. " + a + "\n";
		question += "B. " + b + "\n";
		question += "C. " + c + "\n";
		question += "D. " + d + "\n";
		question += "E. " + e + "\n";
		
		// Initialize correctAnswer
		correctAnswer = answer.toUpperCase();
	}
	
	@Override
	String ask() {
		// Create list of possible valid options
		String[] options = {"A", "B", "C", "D", "E"};
		
		// Convert to list
		List<String> list = Arrays.asList(options);
		
		while(true) {
			// Ask the question
			String answer = JOptionPane.showInputDialog(question);
			
			// Change answer to upper case
			answer = answer.toUpperCase();
			
			if(list.contains(answer)) // Valid option.
			{
				return answer;
			}
			else // Invalid option
			{
				JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E");
			}
		}
	}
	
}
