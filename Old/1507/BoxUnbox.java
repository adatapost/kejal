class A {
   int x;
}
class B extends A{
   int x;
}
class C extends A{
   int x;
}

class BoxUnbox
{
   public static void main(String []args)
    {
        A a; //super ref var

        B b = new B();
        C c = new C();
        b.x = 10;
        //Boxing
        a = b;

        //Unboxing

       // C y = (C)a;  // Invalid casting
        B y = (B) a;   // Valid casting
        System.out.println(y.x);
        ((B)a).x = 100;
        System.out.println(  ((B)a).x );

    }
} 