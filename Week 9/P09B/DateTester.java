/* Practical P09B- DateTester 
Eryk Gloginski
24/03/2021
Program DateTester .*/

import java.util.Scanner;
import java.util.ArrayList;

public class DateTester
{
   public static void main(String [] args)
   {  
      
      ArrayList<Date> bankHolidays = new ArrayList<Date>();
      
      bankHolidays.add(new Date(1, 1, 2021));
      bankHolidays.add(new Date(17, 3, 2021));
      bankHolidays.add(new Date(5, 4, 2021));
      bankHolidays.add(new Date(3, 5, 2021));
      bankHolidays.add(new Date(7, 6, 2021));
      bankHolidays.add(new Date(2, 8, 2021));
      bankHolidays.add(new Date(25, 10, 2021));
      bankHolidays.add(new Date(25, 12, 2021));
      bankHolidays.add(new Date(26, 12, 2021));
      
      for (Date day : bankHolidays)
      {
         System.out.println(day.toString());
      }
   }
}