/* Practical P02B- Question 3
Eryk Gloginski
02/02/2020
Program P02BQ3 .*/

import java.lang.Math;
import java.util.Scanner;

public class P02BQ3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double num, squareRoot, cubeRoot;
      System.out.println("Please enter a double value: ");
      num = input.nextDouble();
      squareRoot = Math.sqrt(num);
      cubeRoot = Math.cbrt(num);
      System.out.println("Square root: " + squareRoot);
      System.out.println("Cube root: " + cubeRoot);
   }
}
