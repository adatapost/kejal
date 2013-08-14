public class TestFive
{
  public static void main(String []args)
  {
    Rect rect = new Rect();

    rect.setLocation(new Point(44,55));
    rect.setSize(new Point(454,55));
    
     System.out.println(rect.getLocation().getX() + "  " + rect.getLocation().getY());

 System.out.println(rect.getSize().getX() + "  " + rect.getSize().getY());


   }
}