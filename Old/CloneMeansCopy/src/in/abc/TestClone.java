package in.abc;

class Student {
	private int no;
	private String name;

	public Student myClone()
	{
		Student temp=new Student(no,name);
		 
		return temp;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

}

public class TestClone {

	public static void main(String[] args) {
      Student jigar = new Student(10,"Jigar");
      Student bipin = new Student(20,"Bipin Patel");
      
      Student s1= jigar.myClone();
      Student s2= jigar.myClone();
      
      Student t1 = bipin.myClone();
      
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(t1);
	}

}
