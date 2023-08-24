/* Practical P04C- Question 4
Eryk Gloginski
18/02/2020
Program P04CQ4 .*/

import java.util.Scanner;

public class P04CQ4
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      StringBuilder email = new StringBuilder();
      
      String name, surname, college;
      System.out.println("Please enter your first name: ");
      name = input.nextLine();
      System.out.println("Please enter your last name: ");
      surname = input.nextLine();
      System.out.println("Please enter your college name: ");
      college = input.nextLine();
      
      email.append(name + surname + "@" + college + ".ie");
      
      System.out.println("Your email address will be: " + email);
      
      
      
   }
}
