/* Practical P01B- Question 3
Eryk Gloginski
27/01/2020
Program P01BQ3 .*/

import java.util.Scanner;

public class P01BQ3
{
   public static void main(String[] args)
   {
      // construct scanner
      Scanner input = new Scanner(System.in);
      // declare variables
      int starting, ending;
      
      System.out.println("Start Number: ");
      starting = input.nextInt();
      System.out.println("End number: ");
      ending = input.nextInt();
      
      displayNumbers(starting, ending);
   } //end main method

   public static void displayNumbers(int start, int end)
   {
      for(int i = start; i >= end; i--)
      {
         System.out.print(i + " ");
      }
   }
}
