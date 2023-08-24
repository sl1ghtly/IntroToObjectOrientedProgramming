/* Practical P10A- MortgageTester
Eryk Gloginski
13/04/2021
Program MortgageTester .*/

import java.util.Scanner;
import java.util.ArrayList;

public class MortgageTester
{
   public static void main(String [] args)
   {  
      Scanner input = new Scanner(System.in);
      ArrayList<Mortgage> mortgages = new ArrayList<Mortgage>();
      
      mortgages.add(new Mortgage("Max", 250000, 120));
      mortgages.add(new Mortgage("Riley", 100000, 240));
      mortgages.add(new Mortgage("Daphne", 375000, 240));
      mortgages.add(new Mortgage("Reginald", 120000, 120));
      mortgages.add(new Mortgage("Gemima", 70000, 240));

      System.out.println("All Mortgages: ");
      for (Mortgage m : mortgages)
      {
         System.out.println(m.toString());
      }
      
      int choice;
      double amount;
      System.out.println();
      System.out.println("Enter a Mortgage number: ");
      choice = input.nextInt();
      System.out.println("Enter an amount to pay: ");
      amount = input.nextDouble();
         
      for (Mortgage m : mortgages)
      {
         if (choice == m.getAccountNumber())
         {
            m.makePayment(amount);
            System.out.println(m.toString());
         }
      }
      
      double largestYet = 0; 
      double smallestYet = 0;
      
      for (Mortgage m : mortgages)
      {
         smallestYet = m.getBalance();
         if (largestYet < m.getBalance())
            largestYet = m.getBalance();
         if (smallestYet > m.getBalance())
            smallestYet = m.getBalance();
      }
      System.out.println();
      System.out.println("The Highest Balance: " + largestYet);
      System.out.println("The Smallest Balance: " + smallestYet);
      
      int years;
      int count = 0;
      
      System.out.println();
      System.out.println("Enter a mortgage term in years: ");
      years = input.nextInt();
      
      for (Mortgage m : mortgages)
      {
         if ((years * 12) == m.getTerm())
         {
            System.out.println(m.toString());
            count++;
         }  
      }
      System.out.println("There are " + count + " mortgages with a term of " + years + " years. ");
   }
}
