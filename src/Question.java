import javax.swing.JOptionPane;

public abstract class Question {
	
	// Declare and initialize static variables
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// Declare instance variables
	String question;
	String correctAnswer;
	
	// Declare abstract method for ask().
	abstract String ask();
	
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
