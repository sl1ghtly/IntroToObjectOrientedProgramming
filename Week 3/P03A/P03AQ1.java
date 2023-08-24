/* Practical P03A- Question 1
Eryk Gloginski
08/02/2020
Program P03AQ1 .*/

import java.util.Scanner;

public class P03AQ1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String name;
      System.out.println("Please enter your name: ");
      name = input.nextLine();
      int count = 0;
      
      for(int i = 0; i < name.length(); i++)
      {
         if(name.charAt(i) != ' ')
         count++;
      }
      System.out.println(name + " has " + count + " characters.");
   }    
}     