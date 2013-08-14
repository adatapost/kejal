package in.abc;

public class Person {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int age, String name) {
		 
		this.age = age;
		this.name = name;
	}
	public Person(String name, int age){
		this.age = age;
		this.name = name;
	}
   public Person(){
	   System.out.println("AAAAAAA");
   }
   @Override
   public String toString()
   {
	   return  "Age : " + age + " Name  : " + name;
   }
}
