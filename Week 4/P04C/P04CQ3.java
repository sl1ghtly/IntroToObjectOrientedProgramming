/* Practical P04C- Question 3
Eryk Gloginski
18/02/2020
Program P04CQ3 .*/

import java.util.Scanner;

public class P04CQ3
{
   public static void main(String [] args)
   {
      String sentence = new String();
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter a sentence: ");
      sentence = input.nextLine();

      StringBuilder sbSentence = new StringBuilder();
      sbSentence.append(sentence);
      System.out.print(sbSentence); 
   }
}
