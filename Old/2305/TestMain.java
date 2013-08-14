class Date
  {
     private int d,m,y;

     public void set(int d,int m,int y)
        {
           this.d=d;
           this.m=m;
           this.y=y;
         }
     public void print()
       {
         System.out.println(d + " " + m + " " + y);
        }
   }


class TestMain
{
   public static void main(String []args)
    {
         Date m=new Date();
m.set(10,2,2003);
m.print(); //will prints 0 0 0 
      }
 }
