public class TestTwo
{
  public static void main(String []args)
  {
     Point p1=new Point();
     Point p2=new Point();

     Rect rect = new Rect(p1,p2);

     System.out.println(rect.getLocation() + " " + rect.getSize());

     rect.getLocation().setX(20);

     rect.getSize().setY(300);
     rect.getLocation().setY(4);
     rect.getSize().setX(400);


     System.out.println(rect.getLocation().getX() + "  " + rect.getLocation().getY());

 System.out.println(rect.getSize().getX() + "  " + rect.getSize().getY());


   }
}