/* Practical P02B- Question 2
Eryk Gloginski
02/02/2020
Program P02BQ2 .*/

import java.lang.Math;
import java.util.Scanner;

public class P02BQ2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double num, roundedUp, roundedDown, nearestNum;
      System.out.println("Please enter a double value: ");
      num = input.nextDouble();
      roundedUp = Math.ceil(num);
      roundedDown = Math.floor(num);
      nearestNum = Math.round(num);
      System.out.println("Rounded up: " + roundedUp);
      System.out.println("Rounded down: " + roundedDown);
      System.out.println("Rounded to the nearest whole number: " + nearestNum);
   }
}
