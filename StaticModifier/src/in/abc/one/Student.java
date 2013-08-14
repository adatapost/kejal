package in.abc.one;

class Student {
	private int roll;
	private String name;

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	public Student(Student std){
		roll = std.roll;
		name = std.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static boolean equals(Student one, Student two) {
		return one.equals(two);
	}

	public static int compare(Student one, Student two) {
		if (one.hashCode() > two.hashCode())
			return 1;
		else if (one.hashCode() < two.hashCode())
			return -1;
		return 0;
	}
}