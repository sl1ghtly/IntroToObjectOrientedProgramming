/* Practical P03C- Question 2
Eryk Gloginski
10/02/2020
Program P03CQ2 .*/

import java.util.Scanner;

public class P03CQ2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String word1, word2;
      System.out.println("Please enter the first String: ");
      word1 = input.nextLine();
      System.out.println("Please enter the second String: ");
      word2 = input.nextLine();
      
      int first1 = word1.indexOf(word1.charAt(0));
      int first2 = word2.indexOf(word2.charAt(0));
      
      if(first1 > first2)
      {
         System.out.println(word2 + " comes before " + word1);
      }
      else
      {
         System.out.println(word1 + " comes before " + word2);
      }
      
   }
}