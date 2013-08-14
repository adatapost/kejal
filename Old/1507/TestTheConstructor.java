class A
{ 
   public A(){
      System.out.println("A::NoArg");
    }
   public A(int n){
      System.out.println("A::IntArg");
    }
}
class B extends A
{
    public B(){
      super();
      System.out.println("B::NoArg");
    }
   public B(int n){
      super(n);
      System.out.println("B::IntArg");
    }
   
   public B(String n){
       super(1);
      System.out.println("B::StrArg");

    }
}

class TestTheConstructor
{
   public static void main(String []args)
     {
        B b1 = new B();
        B b2 = new B(10);
        B b3 = new B("Hello");
     }
}

