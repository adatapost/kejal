package in.kejal;

public class Exam {
	private Subject subject;
	private String date;

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(Subject subject, String date) {
		super();
		this.subject = subject;
		this.date = date;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
