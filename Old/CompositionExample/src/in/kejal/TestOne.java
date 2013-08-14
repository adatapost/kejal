package in.kejal;

public class TestOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentExam exam = new StudentExam
				(
				 new Student(10,"Rajesh"),
				 new Exam(new Subject(100, "Maths"),"1-1-2002")
				 ,80
				 );
						
		System.out.println(exam.getStudent().getRoll() + " " + exam.getStudent().getName());
		System.out.println(exam.getExam().getDate());
		System.out.println(exam.getExam().getSubject().getName());
		System.out.println(exam.getExam().getSubject().getTotalMarks());

		exam.printStudentExam();
	}

}
