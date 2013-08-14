class TestTwo
{
  public static void main(String []args)
   {
     int a,b;

      b=1;
      a=2;

      a = a++ + ++b + b++;


     System.out.println(a + "   " + b);

     b=1;
     a = --b + b++ + b--;
     System.out.println(a + "   " + b);
    }
}
