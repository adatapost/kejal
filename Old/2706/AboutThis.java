class AboutThis
{

   int roll;
   String name;

   public void print(){
     System.out.println(this + " " + this.roll + " "  + this.name);
   }
}

class AboutThisTest
{
   public static void main(String []args)
    {
         AboutThis a = new AboutThis();
         AboutThis b = new AboutThis();

         b.roll = 9;
         a.name ="R";
         System.out.println(a);
         a.print();
         System.out.println(b);
         b.print();

     }
}