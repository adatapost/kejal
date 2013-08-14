public class TestOne
{
  public static void main(String []args)
  {
     Student s1=new Student();

     s1.setNo(10);
     s1.setName("Rajesh");
     s1.getLocalAddress().setCity("Meh");
     s1.getLocalAddress().setPin(349111);
     s1.getPostalAddress().setCity("Pata");
     s1.getPostalAddress().setPin(342222);

    System.out.println(s1.getNo());
    System.out.println(s1.getName());
    System.out.println(s1.getLocalAddress().getCity());
    System.out.println(s1.getLocalAddress().getPin());

    System.out.println(s1.getPostalAddress().getCity());
System.out.println(s1.getPostalAddress().getPin());

 
  }
} 