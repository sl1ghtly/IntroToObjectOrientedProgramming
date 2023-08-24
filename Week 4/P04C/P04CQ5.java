/* Practical P04C- Question 5
Eryk Gloginski
18/02/2020
Program P04CQ5 .*/

import java.util.Scanner;

public class P04CQ5
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      StringBuilder email = new StringBuilder();
      
      String name, surname, college;
      System.out.println("Please enter your first name: ");
      name = input.nextLine().toLowerCase();
      System.out.println("Please enter your last name: ");
      surname = input.nextLine().toLowerCase();
      System.out.println("Please enter your college name: ");
      college = input.nextLine().toLowerCase();
      
      email.append(name + surname + "@" + college + ".ie");
      
      System.out.println("Your email address will be: " + email);
      
      
      
   }
}
