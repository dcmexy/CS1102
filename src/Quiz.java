import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;

public class Quiz {

	public static void main(String[] args) {
		// Construct question
		String question = "What is the Captital of Canada?\n";
		question += "A. Toronto\n";
		question += "B. Vancouver\n";
		question += "C. Ottawa\n";
		question += "D. Washington DC\n";
		question += "E. Montreal\n";
		
		
		// Create list of possible valid options
		String[] options = {"A", "B", "C", "D", "E"};
		
		// Convert to list
		List<String> list = Arrays.asList(options);
		
		while(true)
		{
			// Ask the question
			String answer = JOptionPane.showInputDialog(question);
			
			// Change answer to upper case
			answer = answer.toUpperCase();
			
			// Check for correct answer
			if(answer.equals("C"))
			{
				JOptionPane.showMessageDialog(null, "Correct!");
				break;
			}
			else if(list.contains(answer)) // Incorrect answer.
			{
				JOptionPane.showMessageDialog(null, "Incorrect. Please try again");
			}
			else // Invalid answer.
			{
				JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E");
			}
		}
		

	}

}
