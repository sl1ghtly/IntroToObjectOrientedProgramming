/* Practical P03D- Question 1
Eryk Gloginski
11/02/2020
Program P03DQ1 .*/

import java.util.Scanner;

public class P03DQ1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String sentence;
      System.out.println("Please enter a sentence: ");
      sentence = input.nextLine();
      
      String[] parts = sentence.split(" ", 35);
      
      for(int i = 0; i < parts.length; i++)
      {
         System.out.println((i + 1) + ". " + parts[i]);
      }
   }
}