package in.abc;

public class MainTest {

	public static void main(String[] args) {
		 Student std1 = new Student(101,null,10);
		 Student std2 = new Student(101,null,10);
		 
		 System.out.println(std1);
		 System.out.println(std2);
		 
		 if(std1.equals(null)){
			 System.out.println("Both objects are equal.");
		 }else{
			 System.out.println("Objects contains different values.");
		 }
		 

	}
	public static void main1(String[] args) {
		 Student std = new Student();
		 std.setAge(10);
		 std.setName("Raj");
		 std.setRoll(101);
		 
		 System.out.println(std.getName() + " " + std.getAge() + " " + std.getRoll());
		 

	}

}
