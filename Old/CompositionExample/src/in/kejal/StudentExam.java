package in.kejal;

public class StudentExam {
	private Student student;
	private Exam exam;
	private int obtainMarks;

	public StudentExam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentExam(Student student, Exam exam, int obtainMarks) {
		super();
		this.student = student;
		this.exam = exam;
		this.obtainMarks = obtainMarks;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public int getObtainMarks() {
		return obtainMarks;
	}

	public void setObtainMarks(int obtainMarks) {
		this.obtainMarks = obtainMarks;
	}

	public void printStudentExam()
	{
		System.out.println("Name : " + student.getName());
		System.out.println("Roll : " + student.getRoll());
		System.out.println("Exam Date : " + exam.getDate());
		System.out.println("Subject Name : " + exam.getSubject().getName());
		System.out.println("Total Marks : " + exam.getSubject().getTotalMarks());
		System.out.println("Obtained MArks : " + getObtainMarks());
		
	}
}
