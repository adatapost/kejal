package in.abc;

class Product {
	private int id;
	private String name;
	private int qty;
	private double rate;

	public Product(int id, String name, int qty, double rate) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.rate = rate;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Clone
	public Product(Product prod)
	{
		id = prod.id;
		name = prod.name;
		rate = prod.rate;
		qty = prod.qty;
	}
	public Product myclone()
	{
		 Product p =new Product();
		 p.id = id;
		 p.name = name;
		 p.qty = qty;
		 p.rate = rate;
		 return p;
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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty
				+ ", rate=" + rate + "]";
	}

}

public class AnotherCloning {

	public static void main(String[] args) {

		Product pen = new Product(1,"Rotomac",10,10.50);
		Product pen1 = new Product(pen);
		
		pen1.setName("Tilo");
		Product pen2 = pen1.myclone();
		System.out.println(pen);
		System.out.println(pen1);
		System.out.println(pen2);
	}

}
