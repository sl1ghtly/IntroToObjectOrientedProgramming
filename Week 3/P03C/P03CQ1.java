/* Practical P03C- Question 1
Eryk Gloginski
10/02/2020
Program P03CQ1 .*/

import java.util.Scanner;

public class P03CQ1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String word, containsWord;
      boolean condition, condition2;
      System.out.println("Please enter the first String: ");
      word = input.nextLine();
      System.out.println("Please enter the second String: ");
      containsWord = input.nextLine();
      
      condition = word.contains(containsWord);
      condition2 = word.endsWith(containsWord);
      
      if(condition == true)
      {
         System.out.println(word + " contains the text " + containsWord);
      }
      else
      {
         System.out.println(word + " does not contain the text " + containsWord);
      }
      
      if(condition2 == true)
      {
         System.out.println(word + " ends with the text " + containsWord);
      }
      else
      {
         System.out.println(word + " does not ends with the text " + containsWord);
      }
      
   }
}