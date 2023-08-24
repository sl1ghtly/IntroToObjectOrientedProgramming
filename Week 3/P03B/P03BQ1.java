/* Practical P03B- Question 1
Eryk Gloginski
09/02/2020
Program P03BQ1 .*/

import java.util.Scanner;

public class P03BQ1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String name;
      System.out.println("Please enter your full name: ");
      name = input.nextLine();
      
      String[] parts = name.split(" ", 5);
      
      System.out.print("Your initials are ");
      
      for(int i = 0; i < parts.length; i++)
      {
         System.out.print(parts[i].charAt(0));
      }
   }
}