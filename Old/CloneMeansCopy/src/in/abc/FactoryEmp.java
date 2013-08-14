package in.abc;

 class Emp
 {
	 private int id;
	 private String name;
	 
	 private Emp(){}
	 /*Factory method*/
	 public static Emp newInstance()
	 {
		 return new Emp();
	 }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	 
 }

public class FactoryEmp {
	public static void main(String[] args) {
     // Emp e1 = new Emp(); //Error - constructor is private
		
		Emp e1 = Emp.newInstance();
	    System.out.println(e1);
	    e1.setId(10);
	    e1.setName("A");
	    System.out.println(e1);

	}

}
