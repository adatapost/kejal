public class ArrayEx
{

 public static void main(String []args)
 {
     Student []students=
       {
          new Student(10,"Rajesh"),
          new Student(20,"Majesh"),
          new Student(30,"Tajesh"),

        };

     for(Student s: students){
        System.out.println(s.getRoll() + " " + s.getName());
     }

  }

public static void main2(String []args)
   {
       Student []students;
       students = new Student[3];

       students[0] = new Student(10,"Raj");
       students[2] = new Student(20,"Ram");
       students[2] = new Student(30,"Taj");
       for(Student std: students){
           if(std!=null){
            System.out.println(std.getRoll() + " " + std.getName());
           }
       }

       for(int i=0;i<students.length;i++)
       {
         if(students[i]!=null){
             System.out.println(students[i].getRoll() + " " + students[i].getName());
         }
       }
    }
  public static void main1(String []args)
   {
      String  []cities = 
         {
             "Meh","Patan",
             "Rajkot"
         };

     
       for(String city : cities)
            System.out.println(city);
    }
}