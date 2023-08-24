/* Practical P03A- Question 4
Eryk Gloginski
08/02/2020
Program P03AQ4 .*/

import java.util.Scanner;

public class P03AQ4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String str;
      int strLength;
      System.out.println("Please enter a String: ");
      str = input.nextLine();
      strLength = str.length();
      
      System.out.println("First Letter");
      System.out.println(str.charAt(0));
      System.out.println();
      System.out.println("Last Letter");
      System.out.println(str.charAt(strLength - 1));
   }
}