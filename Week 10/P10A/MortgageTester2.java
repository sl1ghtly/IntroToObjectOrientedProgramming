/* Practical P10A- MortgageTester
Eryk Gloginski
13/04/2021
Program MortgageTester .*/

import java.util.Scanner;
import java.util.ArrayList;

public class MortgageTester2
{
   public static void main(String [] args)
   {  
      Scanner input = new Scanner(System.in);
      ArrayList<Mortgage> mortgages = new ArrayList<Mortgage>();
      int choice, amount;
      
      mortgages.add(new Mortgage("Max", 250000, 120));
      mortgages.add(new Mortgage("Riley", 100000, 240));
      mortgages.add(new Mortgage("Daphne", 375000, 240));
      mortgages.add(new Mortgage("Reginald", 120000, 120));
      mortgages.add(new Mortgage("Gemima", 70000, 240));

      System.out.println("Enter a Mortgage number: ");
      choice = input.nextInt();
      System.out.println("Enter an amount to pay: ");
      amount = input.nextInt();
         
      for (Mortgage m : mortgages)
      {
         if (choice == m.getAccountNumber())
         {
            m.makePayment(amount);
            System.out.println(m.toString());
         }
      }
         
   }
}
