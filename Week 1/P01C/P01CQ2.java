/* Practical P01C- Question 2
Eryk Gloginski
28/01/2020
Program P01CQ2 .*/

import java.util.Scanner;

public class P01CQ2
{
   public static void main(String[] args)
   {   
      happyBday("Jermaine Cole");
      happyBday("Oprah WInfrey");
      happyBday("Nick Carter");
   } //end main method

   public static void happyBday(String bdayName)
   {
      System.out.println("Happy Birthday to You");
      System.out.println("Happy Birthday to You");
      System.out.println("Happy Birthday Dear " + bdayName);
      System.out.println("Happy Birthday to You");
   }
}
