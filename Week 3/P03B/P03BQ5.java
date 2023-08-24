/* Practical P03B- Question 5
Eryk Gloginski
09/02/2020
Program P03BQ5 .*/

import java.util.Scanner;

public class P03BQ5
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String str1, str2;
      char replace, replacement;
      
      System.out.println("Please enter a string of text: ");
      str1 = input.nextLine();
      System.out.println("Please enter another string of text: ");
      str2 = input.nextLine();
      
      String str3 = str1.concat(str2);
      
      System.out.println(str3);

   }
}