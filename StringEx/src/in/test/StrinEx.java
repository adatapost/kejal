package in.test;

public class StrinEx {
	public static void main(String[] args) {
		 String name = "the red sun and red rose";
		 int i = -1;
		 while( (i = name.indexOf("red",i+1) )!=-1)
		 {
			 System.out.println(i);
		 }
		 
	}
 	public static void main4(String[] args) {
	   String str = "Hello";
	   char []car = str.toCharArray();
	   byte []bar = str.getBytes();
	   
	   for(char ch : car)
		    System.out.println(ch);
	   
	   for(byte b: bar)
		   System.out.println(b  + " " + (char)b);
	   
			   

	}
}
