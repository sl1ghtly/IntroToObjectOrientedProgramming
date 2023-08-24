/* Practical P03C- Question 5
Eryk Gloginski
10/02/2020
Program P03CQ5 .*/

import java.util.Scanner;

public class P03CQ5
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String name;
      System.out.println("Please enter your full name: ");
      name = input.nextLine();
      
      String[] parts = name.split(" ", 5);
      
      for(int i = 0; i < parts.length; i++)
      {
         System.out.println(parts[i]);
      }
   }
}