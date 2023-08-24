/* Practical P02A- Question 3
Eryk Gloginski
01/02/2020
Program P02AQ3 .*/

import java.util.Scanner;

public class P02AQ3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int largest;
      int n1, n2, n3;
      
      System.out.print ("Type in first number ");
      n1 = input.nextInt();
      System.out.print ("Type in second number ");
      n2 = input.nextInt();
      System.out.print ("Type in third number ");
      n3 = input.nextInt();
      
      largest = max(n1, n2, n3);
      System.out.println("The number is " + largest);
   }
   public static int max(int num1, int num2, int num3)
   {
      if (num1 >= num2 && num1 >= num3)
      {
         return num1;
      }
      else if (num2 >= num3 && num2 >= num1)
      {
         return num2;
      }
      else
      {
         return num3;
      }
   }
}
