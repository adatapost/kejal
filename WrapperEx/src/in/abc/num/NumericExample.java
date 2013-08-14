package in.abc.num;

public class NumericExample {
	public static void main(String []args){
		char ch = '\u0913';
		String str = "\u0a85\u0a86";
		System.out.println(ch);
		System.out.println(str);
		
	}
	
	
	public static void main6(String[] args) {
		Double value = 10.0 / 0;
		if(value.isInfinite())
           System.out.println("Yes");
		else
			System.out.println("No" + value);
		
		value =  Double.longBitsToDouble(Long.MIN_VALUE); // Negative Infinity
		if(value.isNaN())
			 System.out.println("Not a number");
		else
			System.out.println(value);
		
		
	}
	public static void main5(String[] args) {
	      System.setProperty("no", "012");
	      Integer no = Integer.getInteger("no",0);
	      if(no !=null)
	    	  System.out.println(no);
	      else
	    	  System.out.println("Null");
	       
	      
	      String str = "fff";
	       no = Integer.parseInt(str, 16);
	       System.out.println(no);
	       
	       
	       str = "0";
	       Integer value = Integer.decode(str);
	       System.out.println(value);
		}
	public static void main4(String[] args) {
       Integer no =1;
       System.out.println(Integer.MAX_VALUE);
       System.out.println(Integer.MIN_VALUE);
       System.out.println(Integer.reverse(no));
       
	}

	public static void main3(String[] args) {
		Integer no = 1000;
		String str = no.toString();
		System.out.println(str);

		int mno = 10;
		String str1 = Integer.toString(mno);
		System.out.println(str1);

		System.out.println(Integer.toHexString(1000));
		System.out.println(Integer.toOctalString(1000));
		System.out.println(Integer.toBinaryString(1000));
	}

	public static void main2(String[] args) {
		String str = "FFF";
		int no = Integer.parseInt(str, 16);
		System.out.println(no);
	}

	public static void main1(String[] args) {
		Number no = 10; // Number no = new Integer(10);
		System.out.println(no);
		no = 10.10; // no = new Double(10.10);
		System.out.println(no);
		System.out.println(no.intValue());

	}

}
