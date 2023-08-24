/* Practical P04D- Question 1
Eryk Gloginski
18/02/2020
Program P04DQ1 .*/

import java.util.Scanner;

public class P04DQ1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      // vars
      String sentence, firstWord, lastWord;
      boolean isSame;
      int sentenceLength;
      
      // get string input
      System.out.print("Please enter a sentence: ");
      sentence = input.nextLine();
      
      // length of string
      sentenceLength = sentence.length();
      System.out.println("Sentence length: " + sentenceLength);
      
      // get first word
      String words[] = sentence.split(" ", 35);
      firstWord = words[0];
      System.out.println("First word is: " + firstWord);
      System.out.println("First word length is: " + firstWord.length());
      
      // get last word
      lastWord = words[words.length - 1];
      System.out.println("Last word is: " + lastWord);
      System.out.println("Last word length is: " + lastWord.length());
      
      // check if first word == last word
      isSame = firstWord.equals(lastWord);
      
      // display if it's true or not
      if(isSame == true)
      {
         System.out.println("First and last words are the same. ");
      }
      else
      {
         System.out.println("First and last words are not the same. ");
      }
   }
}