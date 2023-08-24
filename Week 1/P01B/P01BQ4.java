/* Practical P01B- Question 4
Eryk Gloginski
27/01/2020
Program P01BQ4 .*/

import java.util.Scanner;

public class P01BQ4
{
   public static void main(String[] args)
   {
      // construct scanner
      Scanner input = new Scanner(System.in);
      // declare variables
      double costItem, paidAmount;;
      
      System.out.println("Enter Item Cost: ");
      costItem = input.nextDouble();
      System.out.println("Enter Amount Paid: ");
      paidAmount = input.nextDouble();
      
      calcPrice(costItem, paidAmount);
   } //end main method

   public static void calcPrice(double itemCost, double amountPaid)
   {
      final double VAT = 0.135;
      double change, beforeChange, addedVat;
      addedVat = itemCost * VAT;
      beforeChange = itemCost + addedVat;
      change = amountPaid - beforeChange;
      System.out.println("*********************************");
      System.out.println("Price of Item: " + itemCost);
      System.out.println("VAT (13.5%): " + addedVat);
      System.out.println("*********************************");
      System.out.println("Amount Paid: " + amountPaid);
      System.out.println("Change: " + change);
      System.out.println("*********************************");
   }
}
