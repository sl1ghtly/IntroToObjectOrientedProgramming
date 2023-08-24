/* Practical P03C- Question 3
Eryk Gloginski
10/02/2020
Program P03CQ3 .*/

import java.util.Scanner;

public class P03CQ3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String number, country, area, exchange, num;
      System.out.println("Input 14 digit phone number: ");
      number = input.nextLine();
      
      country = number.substring(0, 5);
      area = number.substring(5, 7);
      exchange = number.substring(7, 9);
      num = number.substring(9, 14);
      
      
      System.out.println("Country Code \t\t\t Area Code \t\t\t Exchange \t\t\t Number");
      System.out.println(country +" \t\t\t\t\t 0" + area + " \t\t\t\t\t " + exchange + " \t\t\t\t\t " + num);
      
   }
}