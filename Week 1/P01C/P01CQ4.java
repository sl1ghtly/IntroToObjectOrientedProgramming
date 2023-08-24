/* Practical P01C- Question 4
Eryk Gloginski
28/01/2020
Program P01CQ4 .*/

import java.util.Scanner;

public class P01CQ4
{
   public static void main(String[] args)
   {
      // construct scanner
      Scanner input = new Scanner(System.in);
      // declare/take in variables
      double pounds;
      System.out.println("Enter your weight in Pounds: ");
      pounds = input.nextDouble();
      
      calcStone(pounds);
   } //end main method

   public static void calcStone(double weightPounds)
   {
      double stones;
      stones = weightPounds / 14;
      System.out.println("Your weight in Stones is: " + stones);
   }
}
