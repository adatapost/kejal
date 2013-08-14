package in.abc;

interface Printer
{
	void print();
}
interface Screen
{
	void preview();
}

class Doc implements Printer,Screen
{

	@Override
	public void preview() {
		System.out.println("Document is viewed on screen");
		
	}

	@Override
	public void print() {
		System.out.println("Document is printed on printed");
		
	}
	
}
public class TestOne {
 
	public static void main(String[] args) {
		 
        Doc doc = new Doc();
        
        Printer p = doc;
        p.print();
        
        Screen s=doc;
        s.preview();
	}

}
