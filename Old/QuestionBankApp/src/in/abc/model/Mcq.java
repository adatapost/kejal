package in.abc.model;

import java.util.Arrays;

public class Mcq extends Question {
	private int[] correctAnswer;
	private int[] userAnswer;

	public Mcq(String text, String answer1, String answer2, String answer3,
			String answer4, int[] correctAnser) {
		super(text, answer1, answer2, answer3, answer4);
		this.correctAnswer = correctAnser;

		userAnswer = new int[4];
	}

	public int[] getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int[] correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public int[] getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(int[] userAnswer) {
		this.userAnswer = userAnswer;
	}

	@Override
	public void render() {
		System.out.println("**** Multi Choice Question ********");
		 System.out.println("Question : " + getText());
		 System.out.println("1. " + getAnswer1());
		 System.out.println("2. " + getAnswer2());
		 System.out.println("3. " + getAnswer3());
		 System.out.println("4. " + getAnswer4());
		 
		 System.out.println("Enter your choices : ");
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 for(int i=0;i<4;i++){
		   userAnswer[i] = sc.nextInt();
		 }
	}
	@Override
	public boolean isCorrect()
	{
	   return correctAnswer[0] == userAnswer[0] 
			   && correctAnswer[1] == userAnswer[1]
					  && correctAnswer[2] == userAnswer[2]
							   && correctAnswer[3] == userAnswer[3];
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(correctAnswer);
		result = prime * result + Arrays.hashCode(userAnswer);
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
		Mcq other = (Mcq) obj;
		if (!Arrays.equals(correctAnswer, other.correctAnswer))
			return false;
		if (!Arrays.equals(userAnswer, other.userAnswer))
			return false;
		return true;
	}
	
	
}
