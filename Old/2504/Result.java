public class Result{
 
 public static void main(String []args){

   int m1=66,m2=3,m3=6,m4=2,m5=90,failCount=0;

    
   if(m1 < 35){
      failCount++;
   }

   if(m2 < 35){
      failCount++;
   }

   if(m3 < 35){
      failCount++;
   }

  if(m4 < 35){
      failCount++;
   }

  if(m5 < 35){
      failCount++;
   }


   if(failCount == 0){
       System.out.println("Pass");
   }
   else
   if(failCount ==1 | failCount == 2){
       System.out.println("ATKT");
   }
   else{
        System.out.println("Fail");
   }
 }
}

   
 
   