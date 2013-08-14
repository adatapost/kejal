class Student
{
   private int roll;
   private String name;
 
   public int getRoll() { return roll;}
   public String getName() { return name;}

    public Student(int roll,String name)
   {
      this.roll = roll>0 ? roll: 1;
      this.name = name==null ? "" : name;
    }
   public Student() 
    {
        this(1,"");  //call the two arg constructor
     }
   public Student(String name,int roll)
    {
        this(roll,name);
     }
}
class StudentMain
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
