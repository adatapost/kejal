class Test
{
  public int getNo()
   {
      return 10;  //or return (10);
    }
  public float getAmount()
   {
     return 10.10f;
   }

  public double getSquare(double no)
   {
     return no*no;
   }

  public void doPrint(int no)
   {
      for(int i=1;i<=no;i++)
       {
          System.out.println(i);
       }
    }
}

class TestMain
{
  public static void main(String []args)
   {
      Test a = new Test();
      
      int no=0;
      no=a.getNo();

      //no = a.getAmount(); --- float return type
      float h = a.getAmount();
  
     // no=a.getSquare(5);
      double b = a.getSquare(5);

      System.out.println(no + " " + h + " " + b);
     // no=a.doPrint(5);
        a.doPrint(5);
    }
}
   