class Test{
  public static void main(String []args){
    java.util.Scanner sc=new java.util.Scanner(System.in);
     
   System.out.print("Enter the day no : ");
   int day  = sc.nextInt();

   if(day == 1){
      System.out.println("Monday");
   }else if(day == 2){
       System.out.println("Tueday");
   }else{
       System.out.println("Invalid day number");
    } 

  }
}