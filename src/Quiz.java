
public class Quiz {

	public static void main(String[] args) {
		
		// Question 1
		MultipleChoiceQuestion question = new MultipleChoiceQuestion(
				"Q1. What is the Captital of Canada?",
				"Toronto",
				"Vancouver",
				"Ottawa",
				"Washington DC",
				"Montreal",
				"C");
		
		question.check();
		
		// Question 2
		question = new MultipleChoiceQuestion(
				"Q2. Who is the current President of the United States of America?",
				"Joe Biden",
				"George Bush",
				"Barack Obama",
				"Donald Trump",
				"Bill Clinton",
				"A");
		
		question.check();
		
		// Question 3
		question = new MultipleChoiceQuestion(
				"Q3. What is the correct website for University of the People?",
				"http://www.uopeople.com",
				"http://www.unipeople.edu",
				"http://www.uopeople.org",
				"http://www.uopeople.edu",
				"http://www.unipeople.com",
				"D");
		
		question.check();
		
		// Question 4
		question = new MultipleChoiceQuestion(
				"Q4. Which of the following is a NOT a programming language?",
				"Java",
				"Go",
				"Come",
				"C#",
				"PHP",
				"C");
		
		question.check();
		
		// Question 5
		question = new MultipleChoiceQuestion(
				"Q5. Which language is primarily spoken in Brazil?",
				"English",
				"Portuguese",
				"Spanish",
				"French",
				"German",
				"B");
		
		question.check();
		
		
		// Show Results
		MultipleChoiceQuestion.showResults();
	}
}