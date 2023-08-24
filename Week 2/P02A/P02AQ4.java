/* Practical P02A- Question 4
Eryk Gloginski
01/02/2020
Program P02AQ4 .*/

import java.util.Scanner;

public class P02AQ4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      boolean answer;
      int n1;
      
      System.out.print ("Type in your number: ");
      n1 = input.nextInt();
         
      answer = oddOrEven(n1);
      System.out.println("Answer: True = Even | False = Odd");
      System.out.println("The answer is " + answer + ".");
   }
   public static boolean oddOrEven(int num1)
   {
      if(num1 % 2 == 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}
