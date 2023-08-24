/* Practical P03A- Question 6
Eryk Gloginski
08/02/2020
Program P03AQ6 .*/

import java.util.Scanner;

public class P03AQ6
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String name, surname;
      System.out.println("Please enter your first name: ");
      name = input.nextLine();
      System.out.println("Please enter your surname name: ");
      surname = input.nextLine();
      
      char first = name.charAt(0);
      char second = surname.charAt(0);
      System.out.println("Your initials are " + first + second);
   }
}