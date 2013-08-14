package in.abc.model;

public class Scq extends Question {
	private int correctAnswer;
	private int userAnswer;

	public Scq(String text, String answer1, String answer2, String answer3,
			String answer4, int correctAnswer) {
		super(text, answer1, answer2, answer3, answer4);
		this.correctAnswer = correctAnswer;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public int getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(int userAnswer) {
		this.userAnswer = userAnswer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + correctAnswer;
		result = prime * result + userAnswer;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scq other = (Scq) obj;
		if (correctAnswer != other.correctAnswer)
			return false;
		if (userAnswer != other.userAnswer)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Scq [correctAnswer=" + correctAnswer + ", userAnswer="
				+ userAnswer + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void render() {
		System.out.println("**** Single Choice Question ********");
		 System.out.println("Question : " + getText());
		 System.out.println("1. " + getAnswer1());
		 System.out.println("2. " + getAnswer2());
		 System.out.println("3. " + getAnswer3());
		 System.out.println("4. " + getAnswer4());
		 
		 System.out.println("Enter your choice : ");
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 userAnswer = sc.nextInt();
	}
	
	@Override
	public boolean isCorrect()
	{
	   return correctAnswer == userAnswer;
	}

}
