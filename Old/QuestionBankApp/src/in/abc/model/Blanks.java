package in.abc.model;

public class Blanks extends Question {
	private String correctAnswer;
	private String userAnswer;

	public Blanks(String text,String correctAnswer) {
		super(text, "", "", "", "");
		this.correctAnswer = correctAnswer;
		
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

	@Override
	public void render() {
		System.out.println("**** Fill in the blanks ********");
		 System.out.println("Question : " + getText());
		 System.out.println("Enter your answer : ");
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 userAnswer = sc.next();
	}
	@Override
	public boolean isCorrect()
	{
	   return correctAnswer.equals(userAnswer);
	}
}
