public class SwitchStr
{
  public static void main(String []args)
   {

   java.util.Scanner scan = new                                   java.util.Scanner(System.in);
    
  double rate = 0, interestAmount =0;
  System.out.print("Enter year :");
  int year = scan.nextInt();
  System.out.print("Enter amount : ");
  double amount = scan.nextDouble();

   System.out.print("Calcuate flat interest or compound ? yes or no : ");
   String answer = scan.next();

   switch(answer)
    {

         default:
                System.out.println("Invalid answer");
                break;
         case "yes" : 
         case "Yes" :
         case "YES" :
                 System.out.println("Flat interest");

                  switch(year)
                  {
                      case 1:
                      case 2:
                              rate = 0.02;
                              break;
                      case 3:
                      case 4:
                      case 5:
                              rate = 0.01;
                              break;
                      default:
                              rate = 0.009;
                              break;
                   }
                  interestAmount = amount * rate * year;
                  System.out.println("Interest amount : " + interestAmount);
                 break;
         case "no":
                  System.out.println("Compound Interest");
                 break;

    }
   }
}
