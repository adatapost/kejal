class Student
{
   private int roll;
   private String name;
 
   public int getRoll() { return roll;}
   public String getName() { return name;}

   //No argument constructor
   public Student()
   {
      roll = 1;
      name = ""; //empty
    }
   //Parameterized constructors
   public Student(int roll,String name)
     {
        this.roll = roll;
        this.name = name;
      }
  public Student(String name,int roll)
     {
        this.roll = roll;
        this.name = name;
      }
}
class TestMain
{
   public static void main(String []args)
    {
         Student s=new Student();
         System.out.println(s.getRoll());
         System.out.println(s.getName());

         Student m=new Student(10,"Mohan");
         System.out.println(m.getRoll() + " " + m.getName());

         Student t;
         t=new Student("Manish",23);
        System.out.println(t.getRoll() + " " + t.getName());
     }
}
