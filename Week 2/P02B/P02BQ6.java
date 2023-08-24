/* Practical P02B- Question 6
Eryk Gloginski
02/02/2020
Program P02BQ6 .*/

import java.lang.Math;
import java.util.Scanner;

public class P02BQ6
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double side1, side2, side3;
      double longest = 0;
      double hypotenuse = 0;
      boolean isRightAngled;
      System.out.println("Please enter side 1: ");
      side1 = input.nextDouble();
      System.out.println("Please enter side 2: ");
      side2 = input.nextDouble();
      System.out.println("Please enter side 3: ");
      side3 = input.nextDouble();
      if(side1 > side2 && side1 > side3)
      {
         longest = side1;
         hypotenuse = Math.hypot(side2, side3);
      }
      else if(side2 > side1 && side2 > side3)
      {
         longest = side2;
         hypotenuse = Math.hypot(side1, side3);
      }
      else
      {
         longest = side3;
         hypotenuse = Math.hypot(side1, side2);
      }
      
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
