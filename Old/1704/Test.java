class Test
{
  public static void main(String []args)
   {
     int a,b;

      b=1;
      a = b++ + b++ + b++;
      System.out.println(a +  " " +  b);
       System.out.println(a);
       System.out.println(b);
       System.out.printf("\n%d   %d",a,b);
    }
}