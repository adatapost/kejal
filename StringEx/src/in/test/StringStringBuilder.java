package in.test;

public class StringStringBuilder {
 
	public static void main(String[] args) {
		 Boolean one = false;
		 Boolean two = true;
		 int n = Boolean.compare(one, two);
		 System.out.println(n);
		  
		 System.out.println(one.compareTo(two));
	}
	public static void main2(String[] args) {
		  StringBuffer sb = new StringBuffer();
		 long start = System.currentTimeMillis();
		 for(int i = 1;i<=200000;i++){
			 sb.append("" + i);
		 }
		 long end = System.currentTimeMillis();
		 System.out.println( (end-start) + " ms.");

	}
	public static void main1(String[] args) {
		 
		 int n = Boolean.compare(true, false);
		 System.out.println(n);
		 
		 String str  = "";
		 long start = System.currentTimeMillis();
		 for(int i = 1;i<=20000;i++){
			 str = str + " " + i;
		 }
		 long end = System.currentTimeMillis();
		 System.out.println( (end-start) + " ms.");

	}
}
