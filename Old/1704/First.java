public class First
{
  public static void main(String []args)
  {
      int a, b = 1;

       a = ++b + ++b + ++b;  //post increment 
               System.out.println(a + " " + b);
  
      
   }
}

/* 
  2 + 3 + 4

  1 + 2 + 3
Post
 
 b = 4

 a =   1  +  2    + 3   
   
 */