package in.abc.test;

abstract class Language{
	public abstract void speak();
	public void read(){
		System.out.println("Not Educated");
	}
	public void write(){
		System.out.println("Not Educated");
	}
}
class Hindi extends Language{
	@Override
	public void speak(){
		System.out.println("I can speak Hindi!");
	}
}
class Gujarati extends Language{
	@Override
	public void speak(){
		System.out.println("I can speak Gujarati.");
	}
	@Override
	public void read(){
		System.out.println("I can read Gujrati");
	}
}
abstract class English extends Language{
	
}
class UsaEnglish extends English{
	@Override 
	public void speak(){}
}
public class ExampleOne {
	public static void main(String[] args) {
         Language h= new Hindi();
         h.speak();
         h = new Gujarati();
         h.speak();
         h.read();
	}
}
