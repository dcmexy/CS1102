import java.awt.*;
import javax.swing.*;

public abstract class Question {
	
	// Declare and initialize static variables
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// Declare instance variables
	QuestionDialog question;
	String correctAnswer;
	
	/*
	 * Constructor
	 */
	Question(String question) {
		// Initialize question
		this.question = new QuestionDialog();
		
		// Add grid layout
		this.question.setLayout(new GridLayout(0, 1));
		
		// Add question
		this.question.add(new JLabel("   " + question + "   ", JLabel.CENTER));

	}
	
	/*
	 * Ask method
	 */
	String ask() {
		// Show question
		question.setVisible(true);
		
		// return answer
		return question.answer;
	}
	
	/*
	 * Initialize question instance
	 */
	void initQuestionDialog() {
		// Make dialog box modal.
		this.question.setModal(true);
		
		// Dynamically resize dialog box
		this.question.pack();
		
		// Center the dialog box
		this.question.setLocationRelativeTo(null);
	}
	
	/*
	 * Check answer
	 */
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
