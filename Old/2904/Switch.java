public class Switch
{
  public static void main(String []args)
   {

   java.util.Scanner scan = new                                   java.util.Scanner(System.in);
    
   System.out.print("Enter day number : ");
   int day = scan.nextInt();

   switch(day)
    {

         default:
                System.out.println("Invalid day number.");
                break;
         case 7 : 
                 System.out.println("Sunday");
                 
                 break;
         case 1:
                 System.out.println("Monday");
                 break;
                  
        

    }
   }
}
