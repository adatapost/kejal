public class ArrayEx
{
  public static void main(String []args)
  {
      Point []array = new Point[3];
      
      array[0] = new Point();
      array[1] = new Point();
      array[2] = new Point();
      for(int i=0;i<array.length;i++)
        {
           System.out.println(array[i]);
         }

       for(Point p : array)
          System.out.println(p);
   }
}
class Emp
{

   public void setFirstName(String firstName)
    {
      
      if(firstName == null)
            return ;

       if(firstName.length()>=1 && firstName.length()<=30)
             this.firstName = firstName;
