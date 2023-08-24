/* Practical P04C- Question 7
Eryk Gloginski
18/02/2020
Program P04CQ7 .*/

import java.util.Scanner;

public class P04CQ7
{
   public static void main(String [] args)
   {
   
      Scanner input = new Scanner(System.in);
      StringBuilder builder = new StringBuilder();
      String sentence;
      
      System.out.println("Please enter a sentence: ");
      sentence = input.nextLine();
      builder.append(sentence + ", that's all folks");
      
      System.out.println(builder);
      System.out.println("There are " + builder.length() + " letters in that sentence");
      builder.insert(20, " or maybe not,");
      System.out.println(builder);
      builder.delete(0, 13);
      System.out.println(builder);
      builder.reverse();
      System.out.println(builder);
   }
}
