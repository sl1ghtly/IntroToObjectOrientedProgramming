/* Practical P02B- Question 4
Eryk Gloginski
02/02/2020
Program P02BQ4 .*/

import java.lang.Math;
import java.util.Scanner;

public class P02BQ4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double num1, num2, hypotenuse;
      System.out.println("Please enter side 1: ");
      num1 = input.nextDouble();
      System.out.println("Please enter side 2: ");
      num2 = input.nextDouble();
      hypotenuse = Math.hypot(num1, num2);
      System.out.println("Hypotenuse: " + hypotenuse);
   }
}
