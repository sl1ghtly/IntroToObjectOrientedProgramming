/* Practical P07A- Question 1
Eryk Gloginski
08/03/2021
Program P07AQ1 .*/

public class DateTester
{
   public static void main(String [] args)
   {
      Date paddysDay = new Date(17, 3, 2021);
      System.out.println("The day is: " + paddysDay.getDay());
      System.out.println("The month is: " + paddysDay.getMonth());
      System.out.println("The year is: " + paddysDay.getYear());
   }
}