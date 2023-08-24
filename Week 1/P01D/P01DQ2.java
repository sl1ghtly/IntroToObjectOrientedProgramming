/* Practical P01D- Question 2
Eryk Gloginski
14/10/2020
Program P01DQ2 .*/

import java.util.Scanner;

public class P01DQ2
{
   public static void main(String [] args)
   {
      // construct scanner
      Scanner input = new Scanner(System.in);
      double milesTravelled, allowancePerMile;
      
      System.out.println("Enter miles travelled: ");
      milesTravelled = input.nextDouble();
      System.out.println("Enter allowance per mile: ");
      allowancePerMile = input.nextDouble();
      
      calcExpenses(milesTravelled, allowancePerMile);
      
   }// end main method
   public static void calcExpenses(double miles, double allowance)
   {
   
      double expenses, allowanceBonus;
      expenses = miles * allowance; 
   
      // if statement
      if(miles >= 150)
      {  
         allowanceBonus = expenses + 100;
         System.out.println("Payable Expenses to the employee: " + allowanceBonus + " (100+ BONUS)");
      }
      else
      { 
         System.out.println("Payable Expenses to the employee: " + expenses);
      }
   
   }
} // end class
