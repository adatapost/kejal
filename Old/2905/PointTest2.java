public class PointTest2
{
   public static void main(String []args)
   {
      Point p1 = new Point(10,20);
      Point p2 = new Point(4,5);

      Point p3;

      p3 = p1.addPoint(p2);

      System.out.println(p3.getX() + " " + p3.getY());
  
    }
}