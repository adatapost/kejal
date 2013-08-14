class Student
{
   private int roll;
   private String name;
   private int eng,math,guj,hindi,sci;

 
   public int getRoll() { return roll;}
   public String getName() { return name;}
   public int getEng() { return eng;}
   public int getMath() { return math;}
   public int getGuj() { return guj;}
   public int getHindi() { return hindi;}
   public int getSci() { return sci;}

   public void setRoll(int roll) { this.roll = roll;}
   public void setName(String name) { this.name = name;}
   public void setEng(int eng) { this.eng=eng;}
   public void setMath(int math) { this.math=math;}
   public void setGuj(int guj) { this.guj=guj;}
   public void setHindi(int hindi) { this.hindi=hindi;}
   public void setSci(int sci) { this.sci=sci;}

   public int getTotal() { return eng + math + guj + hindi + sci;}
   
   public double getPercent() { return getTotal()/5.0;}
   public String getGrade()
    {
      double p = getPercent();
      if(p>=70) return "A";
      if(p>=60) return "B";
      if(p>=50) return "C";
      return "D";
     }  
     

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


    public void inputStudent()
    {
       java.util.Scanner sc=new java.util.Scanner(System.in);

       System.out.print("Enter Roll :");
       roll = sc.nextInt();
       System.out.print("Enter Name :");
       name = sc.next();

       System.out.print("English :");
       eng = sc.nextInt();
       System.out.print("Maths :");
       math = sc.nextInt();
      System.out.print("Science :");
       sci = sc.nextInt();
      System.out.print("Hindi :");
       hindi = sc.nextInt();
      System.out.print("Gujrati :");
       guj = sc.nextInt();
      
     }

    public void printMarksheet()
    {
       System.out.printf("\nRoll       :%d",roll);
       System.out.printf("\nName       :%s",name);
       System.out.printf("\n-------Marks------------\n");
       System.out.printf("\nEnglish    :%d",eng);
       System.out.printf("\nMaths      :%d",math);
       System.out.printf("\nScience    :%d",sci);
       System.out.printf("\nGujarati   :%d",guj);
       System.out.printf("\nHindi      :%d",hindi);
       System.out.printf("\n-------Result-----------\n");
       System.out.printf("\nTotal      :%d",getTotal());
       System.out.printf("\nPercentage :%f",getPercent());
       System.out.printf("\nGrade      :%s",getGrade());
       
     }
}
class StudentMark
{
   public static void main(String []args)
    {
        /* Student s=new Student(10,"Rajesh");
         s.setEng(33);
         s.setHindi(77); 
         s.setGuj(55);
         s.setMath(55);
         s.setSci(77);  

        Student s=new Student();
        s.inputStudent();
         System.out.println(s.getRoll());
         System.out.println(s.getName());
         System.out.println(s.getTotal() + " " 
     + s.getPercent()   + " " + s.getGrade()); */


        Student a=new Student();
        a.inputStudent();
        a.printMarksheet();
      }
}
