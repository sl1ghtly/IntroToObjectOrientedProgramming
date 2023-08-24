/* Practical P02A- Question 5
Eryk Gloginski
01/02/2020
Program P02AQ5 .*/

import java.util.Scanner;

public class P02AQ5
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int years;
      double amountInput, amountInterest, gained;
      double answer;
      
      System.out.print("Input your amount: ");
      amountInput = input.nextDouble();
      System.out.print("Input years: ");
      years = input.nextInt();
      System.out.print("Input interest rate in %: ");
      amountInterest = input.nextDouble();
      
      answer = calcCompountInterest(amountInput, years, amountInterest);
      gained = answer - amountInput;
      System.out.println("Amount Gained: " + gained);
      System.out.println("Final Amount: " + answer);
      
   }
   public static double calcCompountInterest(double amount, int years, double interest)
   {
      for (int count = 0; count <= years; count++)
      {
         amount = amount + (amount * interest);
      }
      return amount;
   }
}
