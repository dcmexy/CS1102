
public class Quiz {

	public static void main(String[] args) {
		
		// Question 1
		Question question = new MultipleChoiceQuestion(
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
		
		// Question 6 - True or False Question
		question = new TrueFalseQuestion("iPhones are made by Samsung Electronics?", "f");
		question.check();
		
		// Question 7 - True or False Question
		question = new TrueFalseQuestion("Spain is a country in Europe", "t");
		question.check();
		
		// Question 8 - True or False Question
		question = new TrueFalseQuestion("Donald Trump is no longer the president of the USA", "t");
		question.check();
		
		// Question 9 - True or False Question
		question = new TrueFalseQuestion("3 + 3 = 9", "f");
		question.check();
		
		// Question 10 - True or False Question
		question = new TrueFalseQuestion("A triangle has four equal sides", "f");
		question.check();
		
		
		// Show Results
		Question.showResults();
	}
}