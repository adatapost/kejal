package in.abc;

public class TestMain {

	public static void main(String[] args) {
		String str1 = "A";
		String str2 = "Aa";

		System.out.println(str1.hashCode() + " " + str2.hashCode());

		Student stdOne = new Student(10, "Manish");
		Student stdTwo = new Student(10,null);

		System.out.println(stdOne.hashCode() + " " + stdTwo.hashCode());
		
		if(stdTwo.equals(stdOne)) 
			 System.out.println("EQ");
		else
			System.out.println("UnEq");

		System.out.println(stdOne);
		System.out.println(stdTwo);
	}

	public static void main1(String[] args) {
		String strOne = "Hello";
		String strTwo = "Hello";
		if (strOne.equals(strTwo))
			System.out.println("Equal");
		else
			System.out.println("Unequal");

		Student one = new Student(10, "Rajesh");
		Student two = new Student(10, "rajesh");

		if (one.equals(two))
			System.out.println("Students are equal.");
		else
			System.out.println("Students are unequal.");
	}

}
