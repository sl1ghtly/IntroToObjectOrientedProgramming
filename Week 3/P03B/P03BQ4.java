/* Practical P03B- Question 4
Eryk Gloginski
09/02/2020
Program P03BQ4 .*/

import java.util.Scanner;

public class P03BQ4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String passwordGuess = " ";
      int tries = 3;
      boolean answer = false;
      String password = "open Sesame";
      
      do
      {
         System.out.println("Enter your password: ");
         passwordGuess = input.nextLine();
         
         answer = passwordGuess.equals(password);
         
         if(answer == true)
         {
            System.out.println("Password is correct.");
         }
         else
         {
            System.out.println("Incorrect password entered.");
         }
         tries--;
      }while(answer != true && tries != 0);
      
      if(tries == 0)
      {
         System.out.println("Amount of tries exceeded.");
      }
   }
}