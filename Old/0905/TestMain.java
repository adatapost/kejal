class Test
{
   int a;
   byte b;
   short c;
   long d;
   float p;
   double q;
   boolean y;
   char x;

   //reference variable
   String name;
}

class TestMain
{
  public static void main(String []args)
  {

     Test a = new Test();
     System.out.println(a.a + " " + a.b + " " + a.c 
                + " " + a.d + " " + a.p + " " + a.q
                + " " + a.y + " " + a.x + " " + a.name);
    }
}
  
Output the following
=====================

class Test
{
   int a;
}

class TestMain
{
  public static void main(String []args)
  {

     Test x = new Test();
     Test y = x;
   
     x.a = 10;
     y.a = 20;

     System.out.println(x.a + " " + y.a);
    }
}
  