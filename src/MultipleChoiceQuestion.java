import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
	
	// Declare and initialize static variables
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// Declare instance variables
	String question;
	String correctAnswer;
	
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
	
	
	void check() {
		// Ask question
		String answer = ask();
		
		// Check for correct answer
		if(answer.equals(correctAnswer))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			
			// Increment nCorrect
			nCorrect++;
		}
		else // Incorrect answer.
		{
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
		}
		
		// Increment nQuestions
		nQuestions++;
	}
	
	/**
	 * A class method to display the number of questions and correct answers
	 */
	static void showResults( ) {
		// Display results
		JOptionPane.showMessageDialog(null, nCorrect + " correct answers out of " + nQuestions + " questions.");
	}
	
}
