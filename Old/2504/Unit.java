public class Unit{

  public static void main(String []args){
 
    int units = 700;
    int remain = 0;
    double amount = 0;

    /*
      0 to 100 : 1.5
    101 to 225 : 2
    226 to 625 : 3.5
               : 5

    */

    if(units>625) {
       remain = units - 625;
       amount =  amount + remain * 5.0;
       units = 625;

       System.out.println(remain + " units with amount : " + (remain*5.0));
    }
 
    if(units>=226){
      remain = units - 225;
      amount =  amount + remain * 3.5;
      units = 225;


     System.out.println(remain + " units with amount : " + (remain*3.5));
    }

    if(units>=101){
      remain = units - 100;
      amount =  amount + remain * 2.0;
      units = 100;      

       System.out.println(remain + " units with amount : " + (remain*2.0));
    }

    if(units<=100){
      amount = amount + units * 1.5;

      System.out.println(units + " units with amount : " + (units*1.5));
    }

    System.out.println(amount);
  }
}




