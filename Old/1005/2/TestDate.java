public class TestDate
{
  public static void main(String []args)
   {
      Date date = new Date();
      

      date.set(31,12,2003);

      System.out.println(date.getDay() + "-" + date.getMonth() + "-" + date.getYear());

      date.setMonth(3); 

       System.out.println(date.isLeap());
       date.setYear(2012);
       System.out.println(date.isLeap());
       System.out.println(date.getDaysInYear());
        date.setDay(29);
        date.setMonth(2);
        date.setYear(2011);
        System.out.println(date.isValid());
    }
}