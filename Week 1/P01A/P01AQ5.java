/* Practical P01A- Question 5
Eryk Gloginski
26/01/2020
Program P01AQ5 .*/

import java.util.Scanner;

public class P01AQ5
{
   public static void main(String[] args)
   {
      // construct scanner
      Scanner input = new Scanner(System.in);
      // declare variables
      char grade;
      
      System.out.println("Enter a Grade: (A, B, C, D, E, F only!) ");
      grade = input.next().charAt(0);
      
      printGrade(grade);
   } //end main method

   public static void printGrade(char g)
   {
      switch(g)
      {
         case 'A':
         case 'a':
            System.out.println("Excellent Student");
            break;
         case 'B':
         case 'b':
            System.out.println("Good Student");
            break;
         case 'C':
         case 'c':
         case 'D':
         case 'd':
            System.out.println("OK student");
            break;
         default:
            System.out.println("FAIL");
      }
   }
}
