public class TestOne
{
  public static void main(String []args)
  {
     Rect rect = new Rect();

     System.out.println(rect.getLocation() + " " + rect.getSize());

     rect.getLocation().setX(20);

     rect.getSize().setY(300);
     rect.getLocation().setY(4);
     rect.getSize().setX(400);


     System.out.println(rect.getLocation().getX() + "  " + rect.getLocation().getY());

 System.out.println(rect.getSize().getX() + "  " + rect.getSize().getY());


   }
}