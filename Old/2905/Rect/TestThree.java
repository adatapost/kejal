public class TestThree
{
  public static void main(String []args)
  {
     Rect rect = new Rect();

     System.out.println(rect.getLocation() + " " + rect.getSize());

      Point p1 = new Point(20,30);
      Point p2 = new Point(34,55);

      rect.setLocation(p1);
      rect.setSize(p2);

     System.out.println(rect.getLocation().getX() + "  " + rect.getLocation().getY());

 System.out.println(rect.getSize().getX() + "  " + rect.getSize().getY());


   }
}