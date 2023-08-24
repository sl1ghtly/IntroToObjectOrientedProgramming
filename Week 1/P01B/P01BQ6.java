/* Practical P01B- Question 6
Eryk Gloginski
27/01/2020
Program P01BQ6 .*/

import java.util.Scanner;

public class P01BQ6
{
   public static void main(String[] args)
   {
      // construct scanner
      Scanner input = new Scanner(System.in);
      // declare variables
      int num1, num2, num3;
      System.out.println("Enter three numbers to calculate and get average of. ");
      System.out.println("Enter Number 1: ");
      num1 = input.nextInt();
      System.out.println("Enter Number 2: ");
      num2 = input.nextInt();
      System.out.println("Enter Number 3: ");
      num3 = input.nextInt();
      
      
      calcAverage(num1, num2, num3);
   } //end main method

   public static void calcAverage(int n1, int n2, int n3)
   {
      int total;
      double average;
      total = n1 + n2 + n3;
      average = total / 3;
      System.out.println("Total of " + n1 + " + " + n2 + " + " + n3 + " is " + total);
      System.out.println("The average of these is: " + average);
   }
}
