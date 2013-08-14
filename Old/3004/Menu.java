/* Program which allow us to choose options (menu)
   to perform arithmetic tasks
*/

public class Menu
{
   public static void main(String []args)
    {

       int choice = 0;
       double val1 = 0,
              val2 = 0,
              val3 = 0;

       java.util.Scanner scan = new java.util
                                  .Scanner(System.in);

      for(;;)
        {
         System.out.println("1. Addition");
         System.out.println("2. Subtraction");
         System.out.println("3. Multiplication");
         System.out.println("0. Exit");
         System.out.println("Enter choice : ");
         choice = scan.nextInt();
         if(choice  == 0)
          {
             break;
           }
         if(choice != 0)
          {
           System.out.println("Enter two numbers : ");
           val1=scan.nextDouble();
           val2=scan.nextDouble();
           }

          switch(choice)
           {
             case 1:
                     System.out.printf("\nSum of %f and %f                                is %f",val1,val2,val1+val2);
                     break;

            case 2:
                     System.out.printf("\nSub of %f and %f                                is %f",val1,val2,val1-val2);
                     break;
            case 3:
                     System.out.printf("\nMul of %f and %f                                is %f",val1,val2,val1*val2);
                     break;
            default:
                     System.out.println("Invalid choice.");
                     break;
            case 0 : break;
            }

          } /* end of loop */
       } /* end of main */
 } /* end class */
   

          