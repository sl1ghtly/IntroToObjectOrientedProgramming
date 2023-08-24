/* Practical P03D- Question 2
Eryk Gloginski
11/02/2020
Program P03DQ2 .*/

import java.util.Scanner;

public class P03DQ2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String sentence;
      System.out.println("Please enter a sentence: (Start with a Space)");
      sentence = input.nextLine();
      
      String[] parts = sentence.split(" ", 35);
      
      for(int i = parts.length - 1; i > 0; i--)
      {
         System.out.println(i + ". " + parts[i]);
      }
   }
}