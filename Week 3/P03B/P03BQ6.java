/* Practical P03B- Question 6
Eryk Gloginski
09/02/2020
Program P03BQ6 .*/

import java.util.Scanner;

public class P03BQ6
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String str1, str2;
      char replace, replacement;
      
      System.out.println("Please enter the first String: ");
      str1 = input.nextLine();
      System.out.println("Please enter the second String: ");
      str2 = input.nextLine();
      
      if(str1.contains(str2) == true)
      {
         System.out.println(str1 + " contains the text " + str2);
      }
      else
      {
         System.out.println(str1 + " does not contains the text " + str2);
      }
   }
}