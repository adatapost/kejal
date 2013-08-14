package in.abc;

public class Student extends Person {
	private int roll;

	public Student() {
	}

	public Student(int roll, String name, int age) {
		super(name, age);
		this.roll = roll;
		// setName(name);
		// setAge(age);
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Name : " + getName() + " Age  : " + getAge() + " Roll : "
				+ roll;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (roll != other.roll)
			return false;
		return true;
	}
	
	 
}
