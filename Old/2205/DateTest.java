class Date
{
   private int d,m,y;

   public int getD() { return d;}
   public int getM() { return m;}
   public int getY() { return y;}

   public void setD(int v) 
   {
     d = v;
   }
  public void setM(int v) 
   {
     m = v;
   }
  public void setY(int v) 
   {
     y = v;
   }

   public void set(int dv,int mv,int yv)
   {
      d=dv;
      m=mv;
      y=yv;
    }
   public void printIndia()
   {
      System.out.println(d + "-" + m + "-" + y);
   }
  public void printUsa()
   {
      System.out.println(m + "-" + d + "-" + y);
   }


  public boolean isValidMonth()
  {
     return m>=1 && m<=12;
   }
  public boolean isValidYear()
  {
     return y>=1900 && y<=2099;
   }
  public boolean isLeap()
   {
     return y%4 ==0;
   }

  public boolean days31()
   {
    if(m ==1 | m == 3 | m ==5 | m==7 
             | m==8 | m==10 | m==12)
         {
           return d>=1 && d<=31;  
          }
      return false;
    }
  public boolean days30()
   {
    if(m ==4 | m == 6 | m ==9 | m==11 )
         {
           return d>=1 && d<=30;  
          }
      return false;
    }
  public boolean days28()
   {
    if(m==2 && isLeap())
         {
           return d>=1 && d<=29;  
          }
   if(m==2 && !isLeap())
         {
           return d>=1 && d<=28;  
          }
      
      return false;
    }

  public boolean isValid()
   {
       if(!isValidMonth())
           return false;

       if(!isValidYear())
           return false;
      
        if(days31())
           return true;
        if(days30())
           return true;
        if(days28())
           return true;

        return false;   
    }
}

class DateTest
{
  public static void main(String []args)
   {
       Date date = new Date();
       date.setD(5);
       date.setM(22);
       date.setY(2012);

       Date bdate = new Date();
       bdate.set(31,12,2015);
        
       if(!bdate.isValid())
         System.out.println("In Valid");
       else
          bdate.printIndia();

        System.out.println(date.isValid());
       
    }
}
