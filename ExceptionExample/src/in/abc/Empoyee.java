package in.abc;

public class Empoyee {
	private int age;
	private String name;
	private String email;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if (age < 16 || age > 60)
			throw new AgeException();
		this.age = age;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) throws NameException {
		if (name == null)
			throw new NameException();
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailException {
		if (email == null)
			throw new EmailException("Null value cannot be set to email.");
		this.email = email;
	}

	public Empoyee(int age, String name, String email) throws AgeException, NameException,EmailException {
		super();
		 setAge(age);
		 setName(name);
		 setEmail(email);
	}

}
