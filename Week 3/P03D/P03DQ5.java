/* Practical P03D- Question 5
Eryk Gloginski
11/02/2020
Program P03DQ5 .*/

import java.util.Scanner;

public class P03DQ5
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String sentence = "";
      char character;
      int count = 0; 
    
      System.out.println("Please enter a sentence: ");
      sentence = input.nextLine().toLowerCase();
      System.out.println("Please enter a letter of a word to find word/s: ");
      character = input.next().charAt(0);
      
      String[] words = sentence.split(" ", 25);
      
   
      for (String x : words) 
      {
         for (int i = 0; i < x.length(); i++) 
         {
             if(x.charAt(i) == character) 
             {
                 count++;
             }
         }
      }
      System.out.println("Amount of words containing '" + character + "': " + count);
      System.out.println("Words with '" + character + "': ");
      for (String y : words) 
      { 
          if(y.charAt(0) == character)
          {
             System.out.println(y);
          }
          for (int j = 1; j < y.length(); j++) 
          {
             if(y.charAt(j) == character) 
             {
                 System.out.println(y);
             }
          }
      }
   }
}