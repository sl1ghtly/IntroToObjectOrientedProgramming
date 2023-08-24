/* Practical P03A- Question 5
Eryk Gloginski
08/02/2020
Program P03AQ5 .*/

import java.util.Scanner;

public class P03AQ5
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String str;
      boolean answer;
      String guessStr = "Let me in";
      System.out.println("Enter your password: ");
      str = input.nextLine();
      
      answer = str.equals(guessStr);
      
      if(answer == true)
      {
         System.out.println("Password is correct.");
      }
      else
      {
         System.out.println("Incorrect password entered.");
      }
   }
}