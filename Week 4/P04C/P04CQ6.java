/* Practical P04C- Question 6
Eryk Gloginski
18/02/2020
Program P04CQ6 .*/

import java.util.Scanner;

public class P04CQ6
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      StringBuilder address = new StringBuilder();
      
      String street, town, postcode;
      String northOrRepublic = " ";
      System.out.println("Please enter your street: ");
      street = input.nextLine();
      System.out.println("Please enter your town: ");
      town = input.nextLine();
      System.out.println("Please enter your postcode: ");
      postcode = input.nextLine();
      
      address.append(street + ", " + town);
      
      if(postcode.charAt(0) == 'B' && postcode.charAt(1) == 'T')
      {
         northOrRepublic = "Northern Ireland";
      }
      else
      {
         northOrRepublic = "Republic of Ireland";
      }
      
      address.append(", " + northOrRepublic + ", " + postcode);
      
      System.out.println(address);
   }
}
