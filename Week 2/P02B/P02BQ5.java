/* Practical P02B- Question 5
Eryk Gloginski
02/02/2020
Program P02BQ5 .*/

import java.lang.Math;
import java.util.Scanner;

public class P02BQ5
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double num1, num2, longest, hypotenuse;
      boolean isRightAngled;
      System.out.println("Please enter side 1: ");
      num1 = input.nextDouble();
      System.out.println("Please enter side 2: ");
      num2 = input.nextDouble();
      System.out.println("Please enter longest side: ");
      longest = input.nextDouble();
      hypotenuse = Math.hypot(num1, num2);
      if(longest == hypotenuse)
      {
         isRightAngled = true;
      }
      else
      {
         isRightAngled = false;
      }
      System.out.println("Is this right angled: " + isRightAngled);
   }
}
