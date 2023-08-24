/* Practical P03B- Question 2
Eryk Gloginski
09/02/2020
Program P03BQ2 .*/

import java.util.Scanner;

public class P03BQ2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String word, wordNew;
      char replace, replacement;
      
      System.out.println("Please enter a string of text: ");
      word = input.nextLine();
      System.out.println("Please enter letter to replace: ");
      replace = input.next().charAt(0);
      System.out.println("Please enter replacement letter: ");
      replacement = input.next().charAt(0);
      
      wordNew = word.replace(replace, replacement);
      
      System.out.println(wordNew);

   }
}