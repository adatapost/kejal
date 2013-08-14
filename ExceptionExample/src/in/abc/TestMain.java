package in.abc;

class Emp {
	private int age;

	public Emp(int age) throws Exception {
		if (age < 16)
			throw new Exception("Person is minor.");
		if (age > 60)
			throw new Exception("It is time for retirement.");

		this.age = age;
	}
}

class Student
{
	public void add()
	{
	throw new UnsupportedOperationException("Please override this method.");
	}
}
class MyStudent extends Student{
	@Override
	public void add(){
		System.out.println("hello");
	}
}

interface Sample
{
     void print();
     void show();
}

class SampleImpl implements Sample
{

	@Override
	public void print() {
		throw new UnsupportedOperationException("Please override this method.");
	}

	@Override
	public void show() {
		throw new UnsupportedOperationException("Please override this method.");
	}
	
}
public class TestMain {

	public static void main(String[] args) {
		try {
			Emp emp = new Emp(21);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("End of main.");

		Student s=new MyStudent();
		s.add();
	}

}
