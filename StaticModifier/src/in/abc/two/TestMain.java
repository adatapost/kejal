package in.abc.two;



class Test {
	  
	
	// static block
	static {
		System.out.println("Static -- line1");
		for(int i=1;i<=5;i++){
			System.out.println(i);
		}
	}

	// instance block
	{
		System.out.println("Instance - line1");
	}

	static {
		System.out.println("Static -- line2");
	}

	{
		System.out.println("Instance - line2");
	}
}

public class TestMain {
	
	
	
  static{
	   System.out.println("This is the once exeucted block.");
  }
	public static void main(String[] args) {
		System.out.println("Inside the main");
		 Test a = new Test();
		 new Test();
		 new Test();

	}

}
