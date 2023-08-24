/* Practical P01A- Question 2
Eryk Gloginski
26/01/2020
Program P01AQ2 .*/

import java.util.Scanner;

public class P01AQ2
{
   public static void main(String[] args)
   {
      // construct scanner
      Scanner input = new Scanner(System.in);
      // declare variables
      int num1, num2;
      
      System.out.println("Enter Number 1: ");
      num1 = input.nextInt();
      System.out.println("Enter Number 2: ");
      num2 = input.nextInt();
      
      printSmaller(num1, num2);
   } //end main method

   public static void printSmaller(int n1, int n2)
   {
      if (n1 < n2)
      {
         System.out.print("Smallest is: " + n1);
      }
      else
      {
         System.out.print("Smallest is: " + n2);
      }
   }
}
