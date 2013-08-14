package in.abc;

public class Student {
	private int roll;
	private String name;

	
	@Override
	public int hashCode()
	{
	   int hash = roll;
	   if(name != null){
		   hash = hash + name.hashCode();
	   }
	   return hash;
	}

	@Override
	public boolean equals(Object obj) {
		 return hashCode() == obj.hashCode();
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

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString()
	{
		return  roll + " " + name;
	}
}
