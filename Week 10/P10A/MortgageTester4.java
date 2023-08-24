/* Practical P10A- MortgageTester
Eryk Gloginski
13/04/2021
Program MortgageTester .*/

import java.util.Scanner;
import java.util.ArrayList;

public class MortgageTester4
{
   public static void main(String [] args)
   {  
      Scanner input = new Scanner(System.in);
      ArrayList<Mortgage> mortgages = new ArrayList<Mortgage>();
      int years;
      int count = 0;
      
      mortgages.add(new Mortgage("Max", 250000, 120));
      mortgages.add(new Mortgage("Riley", 100000, 240));
      mortgages.add(new Mortgage("Daphne", 375000, 240));
      mortgages.add(new Mortgage("Reginald", 120000, 120));
      mortgages.add(new Mortgage("Gemima", 70000, 240));
      
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
