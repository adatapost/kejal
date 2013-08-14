package in.abc;

class Product implements Cloneable {
	public int id;
	public String name;

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneExample {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.id = 10;
		p1.name = "Pen";
       
		try {
			Product p2 = (Product) p1.clone();
			
			p2=new Product();
			p2.id = p1.id;
			p2.name = p1.name;
			
			System.out.println(p2.id + " " + p2.name);
			p2.id =90;
			p2.name = "Test";
			System.out.println(p1.id + " " + p1.name);
			System.out.println(p2.id + " " + p2.name);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
