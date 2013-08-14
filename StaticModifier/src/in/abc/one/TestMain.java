package in.abc.one;

public class TestMain {
	public static void main(String[] args) {
		Student a1 = new Student(10,"AA"); 
		 Student a2 = new Student(a1);  //copy an object
		 System.out.println(a1 + " " + a2);
	}
	
	public static void main1(String[] args) {
		Student a1 = new Student(10,"AA"); 
		 Student a2 = new Student(10,"Aa");

		 if(Student.equals(a1,a2)) 
		    System.out.println("EQ");
		 else
			 System.out.println("Not EQ");

		 int result = Student.compare(a1,a2);
		 if(result == 0)
			 System.out.println("both are equal");
		 else
		 if(result > 0)
			 System.out.println("a1 > a2");
		 else
			 System.out.println("a1 < a2");
	}
}
