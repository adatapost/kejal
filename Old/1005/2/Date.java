public class Date
{
   private int day,month, year;

   public void setDay(int v) { day = v; }
   public void setMonth(int v) { month = v; }
   public void setYear(int v) { year = v; }

   public int getDay() { return day;}
   public int getMonth() { return month;}
   public int getYear() { return year;}

   public void set(int mday,int mmonth, int myear)
    {
       day = mday;
       month = mmonth;
       year = myear;
    } 

   public boolean isLeap()
    {
           return year % 4 == 0;
     }
   public int getDaysInYear()
    {
        if(isLeap())
            return 366;
        return 365;
     }
    public boolean is31()
     {
        return month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12;
      }
 public boolean is30()
     {
        return month == 4 | month == 6 | month == 9 | month == 11;
      }
    public boolean isValid()
      {
         if(is31())
           {
              if(day<0 || day>31)
                 {
                  return false;
                  }
            }
         else
         if(is30())
           {
              if(day<0 || day>30)
                 {
                  return false;
                  }
            }
         else
         if(month == 2)
            {
                 if(isLeap())
                   {

                    if(day<0 || day>29)
                       {
                       return false;
                        }
                   }
                   else
                    {

                     if(day<0 || day>28)
                       {
                         return false;
                        }
                     }
             } 
             return true;     

       }
}