/* Practical P03D- Question 3
Eryk Gloginski
11/02/2020
Program P03DQ3 .*/

import java.util.Scanner;

public class P03DQ3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String sentence;
      String word = "";
      String largest = "";
      int length = 0;
      
      System.out.println("Please enter a sentence: ");
      sentence = input.nextLine();
      
      String[] parts = new String[100];
      
      for(int i = 0; i < sentence.length(); i++)
      {
         if(sentence.charAt(i) != ' ')
         {
            word = word + sentence.charAt(i);
         }
         else
         {
            parts[length] = word;    
            length++;    
            word = ""; 
         }
      }
      
      largest = parts[0];
      
      for(int k = 0; k < length; k++)
	   {
         if(largest.length() < parts[k].length())
         {
            largest = parts[k];
         }
      }
      
      System.out.println("Largest word: " + largest); 
   }
}