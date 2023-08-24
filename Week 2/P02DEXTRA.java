/* Practical P02D- EXTRA
Eryk Gloginski
03/02/2020
Program P02DEXTRA .*/

import java.lang.Math;
import java.util.Scanner;

public class P02DEXTRA
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double side1, side2, side3, answer;
      System.out.println("Enter Side #1: ");
      side1 = input.nextDouble();
      System.out.println("Enter Side #2: ");
      side2 = input.nextDouble();
      System.out.println("Enter Side #3: ");
      side3 = input.nextDouble();
      
      answer = heronsFormula(side1, side2, side3);
      System.out.println("The answer is: " + answer);
   }
   public static double heronsFormula(double a, double b, double c)
   {
      double s, area;
      s = (a + b + c) / 2;
      area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
      return area;
   }
}
