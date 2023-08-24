/* Practical P02A- Question 1
Eryk Gloginski
01/02/2020
Program P02AQ1 .*/

import java.util.Scanner;

public class P02AQ1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int largest;
      int first, second;
      
      System.out.print ("Type in first number ");
      first = input.nextInt();
      System.out.print ("Type in second number ");
      second = input.nextInt();
      largest = max(first, second);
      System.out.println("The number is " + largest);
   }
   public static int max(int num1, int num2)
   {
      if (num1 > num2)
      {
         return num1;
      }
      else
      {
         return num2;
      }
   }
}
