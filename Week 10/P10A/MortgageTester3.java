/* Practical P10A- MortgageTester
Eryk Gloginski
13/04/2021
Program MortgageTester .*/

import java.util.ArrayList;

public class MortgageTester3
{
   public static void main(String [] args)
   {  
      ArrayList<Mortgage> mortgages = new ArrayList<Mortgage>();
      
      mortgages.add(new Mortgage("Max", 250000, 120));
      mortgages.add(new Mortgage("Riley", 100000, 240));
      mortgages.add(new Mortgage("Daphne", 375000, 240));
      mortgages.add(new Mortgage("Reginald", 120000, 120));
      mortgages.add(new Mortgage("Gemima", 70000, 240));
      
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
      
      System.out.println("The Highest Balance: " + largestYet);
      System.out.println("The Smallest Balance: " + smallestYet);
      
      
   }
}
