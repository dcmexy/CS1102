import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {
	
	// Constructor
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer)
	{
		
		// call super constructor
		super(query);
		
		// Add choices A to E
		addChoice("A", a);
		addChoice("B", b);
		addChoice("C", c);
		addChoice("D", d);
		addChoice("E", e);
		
		// Initialize questions
		initQuestionDialog();
		
		// Initialize correctAnswer
		correctAnswer = answer.toUpperCase();
	}
	
	/*
	 * Method to add choice
	 */
	void addChoice(String name, String label) {
		// Create panel
		JPanel choice = new JPanel(new BorderLayout());
		
		// Create a button with a given name
		JButton button = new JButton(name);
		
		// Add event listener to button
		button.addActionListener(question);
		
		// Add button to choice panel
		choice.add(button, BorderLayout.WEST);
		
		// Add answer label to center section of the panel
		choice.add(new JLabel(label + "   ", JLabel.LEFT), BorderLayout.CENTER);
		
		// Add panel to dialog box
		question.add(choice);
	}
	
}
