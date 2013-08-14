public class PointTest1
{
   public static void main(String []args)
   {
      Point p1 = new Point(10,20);
      Point p2 = new Point(p1);

      System.out.println(p1.getX() + " " + p1.getY());
 System.out.println(p2.getX() + " " + p2.getY());


    }
}