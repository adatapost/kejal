package in.bipin;

public class Student extends Person  {

	private String std,status;
	   public Student()
	    {
	         std="";
	       status="";
	      }
	   public Student(String name,String address,String phone, String email, String std, String status)
	        {
		     super(name,address,phone,email);
	          this.std=std;
	          this.status=status;
	          }
	   public String getStatus(){return status;}
	   public String getStd(){return std;}
	    public void setStd(String std){this.std=std;}
	    public void setStatus(String status)
	    {
	     this.status=status;
	      }
}
