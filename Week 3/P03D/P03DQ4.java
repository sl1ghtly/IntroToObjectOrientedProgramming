/* Practical P03D- Question 4
Eryk Gloginski
11/02/2020
Program P03DQ4 .*/

import java.util.Scanner;

public class P03DQ4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String sentence;
      char character;
      int count = 0;
      
      System.out.println("Please enter a sentence: ");
      sentence = input.nextLine();
      System.out.println("Please enter a first letter of a word to find: ");
      character = input.next().charAt(0);
      
      String[] words = sentence.split(" ", 25);
      
      for(int i = 0; i < words.length; i++)
      {
         if(words[i].charAt(0) == character)
         {
            count++;
         }
      }
      
      System.out.println("Amount of words starting with " + character + ": " + count);
      
      for(int k = 0; k < words.length; k++)
      {
         if(words[k].charAt(0) == character)
         {
            System.out.println("Words starting with '" + character + "': ");
            System.out.println(words[k]);
         }
      }
   }
}