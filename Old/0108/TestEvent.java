interface Message
{
   void show(int oldValue, int newValue);
}

/* Publisher class */
class Test
{
     private int no;
     public Message changed;  /* Event */ 
     public void setNo(int no)
     {
        //Raise the event
       
        if(changed!=null)
         {
           changed.show(this.no,no);  
         }
         this.no = no;
      }
}
   
/* Subscriber class */
class TestEvent
{
    public static void main(String []args)
     {
          Test test = new Test();
          test.changed = new MyMessage();
          test.setNo(100);
          test.setNo(3000);
      }
}
 
/* Create event handler */
class MyMessage implements Message
{ 
    public void show(int o,int n)
     {
         System.out.println(o + " is replaced with " + n);
     }
}

class Hello implements Message
{
   public void show(int oldValue, int newValue)
    {
         for(int i=oldValue;i<=newValue;i++)
          {
             System.out.println(i);
           }
     }
}