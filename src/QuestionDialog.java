import java.awt.event.*;
import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener {
	String answer;
	
	/*
	 * An implementation of actionPerformed()
	 */
	public void actionPerformed(ActionEvent e) {
		// Get button label
		answer = e.getActionCommand();
		
		// Call dispose method
		dispose();
	}
}
