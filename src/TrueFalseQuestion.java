import javax.swing.*;

public class TrueFalseQuestion extends Question {
	
	// Add Constructor
	TrueFalseQuestion(String question, String answer)
	{
		// call super constructor
		super(question);
		
		// Create new JPanel
		JPanel buttons = new JPanel();
		
		// Add TRUE Button
		addButton(buttons, "TRUE");
		
		// Add FALSE Button
		addButton(buttons, "FALSE");
		
		// Add buttons panel to dialog box.
		this.question.add(buttons);
		
		// Initialize question
		initQuestionDialog();
		
		
		
		
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
	
	/*
	 * Button add method
	 */
	void addButton(JPanel buttons, String label) {
		
		// Create new button
		JButton button = new JButton(label);
		
		// Add event Listener to button
		button.addActionListener(question);
		
		// Add button to buttons panel
		buttons.add(button);
	}
}
