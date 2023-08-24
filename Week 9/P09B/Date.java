/* Practical P09B- Date Class
Eryk Gloginski
24/03/2021
Program Date Class .*/

public class Date
{
   //instance variables
   private int day;
   private int month;
   private int year;
   
   public Date(int dayIn, int monthIn, int yearIn)
   {
      day = dayIn;
      month = monthIn;
      year = yearIn;
   }
   
   public String toString()
   {
      String str = new String();
      str = str + day + "/" + month + "/" + year;
      return str;
   }
   
   public boolean equals(Date anotherDate)
   {
      return day == anotherDate.day
      && month == anotherDate.month
      && year == anotherDate.year;
   }
   
   public int getDay()
   {
      return day;
   }
   public int getMonth()
   {
      return month;
   }
   public int getYear()
   {
      return year;
   }
}
