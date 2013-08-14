class A
{
   int a;
}
class B extends A
{
   int a;
}
class C extends B
{
   int a;
}
class Objs
{
   public static void main(String []args)
    {
        A x = new C();
        x.a = 10;
        B y = x;

     }
}

 












 