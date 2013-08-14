class MyNumber
{

   private int no;

   public int getNo() { return no;}
   public void setNo(int v) { no=v;}

    
   public boolean isOdd() { return no%2!=0;}

   public boolean isPrime()
    {
        for(int i=2;i<=no/2;i++)
          {
             if(no%i==0)
                  return false;
           }
         return true;
     } 
   public boolean isPerfect()
    {
     return false;
     }
  
   public boolean isPalindrome()
   {
     return false;
    }
  public int reverse()
    {
          return 0;
     }
  public void printFactorial()
   {
     int f=1;
     for(int i=1;i<=no;i++)
        {
          f=f * i;
         }
     System.out.println(f);
    }
  public void printFebonacy()
   {
      int a=0,b=1,c;

        for(int i=1;i<=no;i++)
         {
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;
           }
      }
}

class MyNumberTest
{
  public static void main(String []args)
  {
     MyNumber n = new MyNumber();
     n.setNo(18);

     System.out.println(n.isPrime());
     n.printFebonacy();
  } 
}
