public class TestFour
{
  public static void main(String []args)
  {
    Rect rect = new Rect(new Point(2,3), new Point(22,33));

    
     System.out.println(rect.getLocation().getX() + "  " + rect.getLocation().getY());

 System.out.println(rect.getSize().getX() + "  " + rect.getSize().getY());


   }
}