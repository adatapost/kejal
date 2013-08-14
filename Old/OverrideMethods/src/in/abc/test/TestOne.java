package in.abc.test;

import in.abc.model.Product;

public class TestOne {
 
	public static void main(String[] args) {
		  Product products[]=new Product[5];
		  products[0]=new Product(11,"Pen");
		  products[1]=new Product(1,"Pencil");
		  products[2]=new Product(4,"Book");
		  products[3]=new Product(50,"Amber");
		  products[4]=new Product(3,"Beans");
		  
		  for(Product product: products){
			  System.out.println(product.getId() + " " + product.getName());
		  }
		  
		  //Search an object
		  Product search = new Product(4,"Book");
		  boolean isFound = false;
		  for(Product product: products){
			   if(product.equals(search)){
				   isFound = true;
				   break;
			   }
		  }
		  if(isFound){
			  System.out.println("Item is found.");
		  }else{
			  System.out.println("Item not found.");
		  }
		  

	}

}
