import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;

public class Quiz {
	
	// Declare and initialize static variables
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	static String ask(String question) {
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
	
	static void check(String question, String correctAnswer) {
		// Ask question
		String answer = ask(question);
		
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

	public static void main(String[] args) {
		// Construct question
		String question = "Q1. What is the Captital of Canada?\n";
		question += "A. Toronto\n";
		question += "B. Vancouver\n";
		question += "C. Ottawa\n";
		question += "D. Washington DC\n";
		question += "E. Montreal\n";
		
		String question2 = "Q2. Who is the current President of the United States of America?\n";
		question2 += "A. Joe Biden\nB. George Bush\nC. Barack Obama\nD. Donald Trump\nE. Bill Clinton";
		
		String question3 = "Q3. What is the correct website for University of the People?\n";
		question3 += "A. http://www.uopeople.com\nB. http://www.unipeople.edu\nC. http://www.uopeople.org\nD. http://www.uopeople.edu\nE. http://www.unipeople.com";
		
		String question4 = "Q4. Which of the following is a NOT a programming language?\n";
		question4 += "A. Java\nB. Go\nC. Come\nD. C#\nE. PHP";
		
		String question5 = "Q5. Which language is primarily spoken in Brazil?\n";
		question5 += "A. English\nB. Portuguese\nC. Spanish\nD. French\nE. German";
		
		// Check answers
		check(question, "C");
		check(question2, "A");
		check(question3, "D");
		check(question4, "C");
		check(question5, "B");
		
		// Display scores
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions.");
	}
}