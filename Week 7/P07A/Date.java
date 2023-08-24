/* Practical P07A- Date Class
Eryk Gloginski
08/03/2021
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
