/* CA1
Eryk Gloginski - L00157413
04/03/2021
Java Program*/

import java.util.Scanner;

public class SentenceReader
{
   public static void main(String [] args)
   {
      // declare scanner
      Scanner input = new Scanner(System.in);
      
      // declare variables
      String sentence = "";
      String reverse = "";
      int word1, word2;
      
      // take input
      System.out.println("Please enter a sentence: ");
      sentence = input.nextLine();
      
      // declare string builder
      StringBuilder builder = new StringBuilder(sentence);
      
      // The number of letters in the sentence
      System.out.println("Your sentence has " + sentence.length() + " letters ");
      
      // The sentence in uppercase letters
      System.out.println("Your sentence in uppercase: " + sentence.toUpperCase());
      
      // The sentence in lowercase letters
      System.out.println("Your sentence in lowercase: " + sentence.toLowerCase());
      
      // The number of words in the sentence
      String[] words = sentence.split(" ", 25);
      System.out.println("Your sentence has " + words.length + " words ");
      
      // The words of the sentence in reverse
      System.out.println("Your sentence in reverse is " + builder.reverse());
      
      // The first word of the sentence
      System.out.println("The first word in your sentence is " + words[0]);
      
      // The last word of the sentence
      System.out.println("The last word in your sentence is " + words[words.length - 1]);
      
      // The first and last words in dictionary order
      String[] order = {words[0], words[words.length - 1]};
      word1 = order[0].indexOf(order[0].charAt(0));
      word2 = order[1].indexOf(order[1].charAt(0));
      
      if(word1 > word2)
      {
         System.out.println(order[0] + " comes before " + order[1] + " in dictionary order");
      }
      else
      {
         System.out.println(order[1] + " comes before " + order[0] + " in dictionary order");
      }
   }
}
   