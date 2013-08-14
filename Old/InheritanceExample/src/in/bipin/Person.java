package in.bipin;

	public class Person
	{
	  private String name,add,phone,email;
	   public Person()
	    {
	      name="";
	      add="";
	      phone="";
	      email="";
	       }
	    public Person(String name,String add,String phone,String email)
	      {
	         this.name=name;
	         this.add=add;
	         this.phone=phone;
	         this.email=email;
	        }
	    public String getName(){return name;}
	    public String getAdd(){return add;}
	    public String getPhone(){return phone;}
	    public String getEmail(){return email;}
	    public void setName(String name){this.name=name;}
	    public void setAdd(String add){this.add=add;}
	    public void setPhone(String phone){this.phone=phone;}
	    public void setEmail(String email){this.email=email;}
	}
	


