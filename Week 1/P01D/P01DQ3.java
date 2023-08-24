/* Practical P01D- Question 3
Eryk Gloginski
28/01/2021
Program P01DQ3 .*/

import java.util.Scanner;

public class P01DQ3
{
   public static void main(String [] args)
   {
      // construct scanner
      Scanner input = new Scanner(System.in);
      double hoursWorked, rateOfPay;
      System.out.println("Enter hours worked: ");
      hoursWorked = input.nextDouble();
      System.out.println("Enter Rate of Pay: ");
      rateOfPay = input.nextDouble();
      
      caclWages(hoursWorked, rateOfPay);
   }// end main method
   public static void caclWages(double amountWorked, double payRate)
   {
      double normalPay, overtimeHours, bonusRateOfPay, overPay, finalPay;
      normalPay = amountWorked * payRate;
      overtimeHours = amountWorked - 38;
      bonusRateOfPay = payRate * 1.5;
      
      if(amountWorked > 38)
      {  
         normalPay = normalPay - (overtimeHours * payRate);
         overPay = overtimeHours * bonusRateOfPay;
         finalPay = overPay + normalPay;
         System.out.println("Hours worked " + amountWorked + " | Money Paid: " + finalPay);
      }
      else
      { 
         System.out.println("Hours worked " + amountWorked + " | Money Paid: " + normalPay);
      }
   
   }
} // end class
