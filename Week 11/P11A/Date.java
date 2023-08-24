/* Practical P11A- Date Class
Eryk Gloginski
20/04/2021
Program Date Class .*/

public class Date
{
   // instance variables
   private int day;
   private int month;
   private int year;
   
   // constructor
   public Date(int dayIn, int monthIn, int yearIn)
   {
      day = dayIn;
      month = monthIn;
      year = yearIn;
   }
   
   // toString method
   public String toString()
   {
      return day + "/" 
         + month + "/" 
         + year;
   }
   
   public boolean equals(Date anotherDate)
   {
      return day == anotherDate.day
         && month == anotherDate.month
         && year == anotherDate.year;
   }
}