package in.kejal;

public class Subject {

	private String name;
	private int totalMarks;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String name, int totalMarks) {

		this.name = name;
		this.totalMarks = totalMarks;
	}

	public Subject(int totalMarks, String name) {
		super();
		this.name = name;
		this.totalMarks = totalMarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
