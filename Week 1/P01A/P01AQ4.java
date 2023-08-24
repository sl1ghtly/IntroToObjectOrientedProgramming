/* Practical P01A- Question 4
Eryk Gloginski
26/01/2020
Program P01AQ4 .*/

import java.util.Scanner;

public class P01AQ4
{
   public static void main(String[] args)
   {
      // construct scanner
      Scanner input = new Scanner(System.in);
      // declare variables
      int starting, ending;
      
      System.out.println("Enter the starting number: ");
      starting = input.nextInt();
      System.out.println("Enter the ending number: ");
      ending = input.nextInt();
      
      displayNumbers(starting, ending);
   } //end main method

   public static void displayNumbers(int start, int end)
   {
      for(int i = start; i <= end; i++)
      {
         System.out.println(i);
      }
   }
}
