/* Practical P02B- Question 1
Eryk Gloginski
02/02/2020
Program P02BQ1 .*/

import java.lang.Math;
import java.util.Scanner;

public class P02BQ1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double num, roundedUp;
      System.out.println("Please enter a double value: ");
      num = input.nextDouble();
      roundedUp = Math.ceil(num);
      System.out.println("Rounded up: " + roundedUp);
   }
}
