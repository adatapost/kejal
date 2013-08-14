package in.test;

public class RegExp {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append("10");
		sb.append("\n");
		sb.append("Name");
		
		sb.delete(0,4);
		System.out.println(sb.toString());
		sb.insert(0, "Hell");
		System.out.println(sb.toString());
	}
	public static void main90(String[] args) {
       String name = "file.cs";
       
       if(name.endsWith(".java"))
    	    System.out.println("Java file");
       else
    	  if(name.endsWith(".cs"))
    		  System.out.println("C# file");
       
	}
	public static void main8(String[] args) {
        String name = "The 92 red sun 12and re33d ros112e12 33";
        String pattern = "\\d+";
        name = name.replaceAll(pattern, "");
        
        System.out.println(name);
	}
	public static void main7(String[] args) {
        String name = "The red sun and red rose";
        name = name.replace("red", "white")
        		    .replace("sun", "moon")
        		    .replace("rose", "paper");
        System.out.println(name);
	}

	public static void main5(String[] args) {

		String[] ar = "hello 10 rj 400 phno 3030".split("\\D+");

		for (String s : ar) {

			System.out.println(s);
		}

	}

	public static void main21(String[] args) {
		String text = "The|     red, sun, 102, hello: world";
		String pattern = "[|, :]";
		String[] ar = text.split(pattern);

		for (String s : ar) {
			if (s.trim().length() != 0)
				System.out.println(s);
		}

	}

	public static void main1(String[] args) {
		String name = "1029";
		String pattern = "\\d+";
		System.out.println(name.matches(pattern));
		name = "392812";
		pattern = "\\d{6}";
		System.out.println(name.matches(pattern));

		name = "aa@aa.com";
		pattern = "\\w+@\\w+[.]\\w+";
		System.out.println(name.matches(pattern));

		name = "3qD";
		pattern = "[123][a-z][ADR]";
		System.out.println(name.matches(pattern));

		name = "14th Floor, Raj Mahel Road";
		pattern = "[\\s\\w.,]{5,200}";
		System.out.println(name.matches(pattern));

		name = "Mr. Rajesh";
		pattern = "[a-zA-Z\\s.]{5,20}";
		System.out.println(name.matches(pattern));

		name = "982342343";
		pattern = "\\d{10,13}";
		System.out.println(name.matches(pattern));

		pattern = "[+]\\d\\d[ ]\\d{10}";
		name = "+91 9876545342";
		System.out.println(name.matches(pattern));

		pattern = "(Black|Yellow|Blue|White)";
		name = "Yellow";
		System.out.println(name.matches(pattern));

	}

}
