public class TestDate
{
  public static void main(String []args)
   {
      Date date = new Date();

      date.setDay(3);
      date.setMonth(5);
      date.setYear(2012);

      System.out.println(date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
    }
}