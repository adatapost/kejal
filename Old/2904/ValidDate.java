public class ValidDate
{
  public static void main(String []args)
   {

   java.util.Scanner scan = new                                   java.util.Scanner(System.in);
    
   System.out.print("Enter day, month and year : ");
   int day = scan.nextInt();
   int month = scan.nextInt();
   int year = scan.nextInt();

    boolean valid=true;
    boolean leap = year % 4 == 0;


if(year>=1900 && year<=2099)
{

 switch(month)
  {
   case 1:
   case 3:
   case 5:
   case 7:
   case 8:
   case 10:
   case 12:
             if(day<1 || day>31){
                 valid= false;
              }
             break;

   case 4:
   case 6:
   case 9:
   case 11:

             if(day<1 || day>30){
                 valid= false;
              }
             break;

   case 2:
            if(leap){
                if(day<1 || day>29){  
                    valid = false;
                 }
            }else{
                if(day<1 || day>28){  
                    valid = false;
                 }
            } 
            break;
    default: valid=false; break;
  } /*--- End of switch ---*/

}else{
  valid = false;
} /*---- End of year if ------*/ 

  if(valid){
      System.out.println("Date is valid");
  }else{
      System.out.println("Invalid date");
  }
  
 } /*---- End of main ------*/
}
