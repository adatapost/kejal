
 class Student
 {
    private int roll;
    private String name;

    //getter & setter

    public void setRoll(int v)
    {
       if(v>=1 && v<=100)
          {
             roll = v;
           }
      }
 
    public void setName(String v)
       {
           if(v == null)
             {
                return;
              }

            if(v.length()>=5 && v.length()<=40)
               {
                  name = v;
                }
          }

     public int getRoll() { return roll;}
     public String getName() { return name;}
}


class StudentMain
{
  public static void main(String []args)
   {
 
     Student std = new Student();
     
     std.setRoll(190);
     std.setName("Raj");

     System.out.println(std.getRoll() + " " 
          + std.getName());

     }
}

