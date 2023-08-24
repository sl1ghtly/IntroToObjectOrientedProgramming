/* Practical P02C- Question 2
Eryk Gloginski
03/02/2020
Program P02CQ2 .*/

import java.util.Scanner;

public class P02CQ2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double bookPrice1, bookPrice2, bookPrice3, answer;
      System.out.println("Please enter Book Price #1: ");
      bookPrice1 = input.nextDouble();
      System.out.println("Please enter Book Price #2: ");
      bookPrice2 = input.nextDouble();
      System.out.println("Please enter Book Price #3: ");
      bookPrice3 = input.nextDouble();
      
      answer = calcPrice(bookPrice1, bookPrice2, bookPrice3);
      System.out.println("Final Price is: " + answer);
   }
   public static double calcPrice(double price1, double price2, double price3)
   {
      double total, finalTotal;
      final double DISCOUNT = 0.1;
      total = price1 + price2 + price3;
      
      if(total >= 50)
      {
         finalTotal = total - (total * DISCOUNT);
      }
      else
      {
         finalTotal = total;
      }
      return finalTotal;
   }
}
