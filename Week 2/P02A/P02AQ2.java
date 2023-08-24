/* Practical P02A- Question 2
Eryk Gloginski
01/02/2020
Program P02AQ2 .*/

import java.util.Scanner;

public class P02AQ2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int smallest;
      int n1, n2, n3;
      
      System.out.print ("Type in first number ");
      n1 = input.nextInt();
      System.out.print ("Type in second number ");
      n2 = input.nextInt();
      System.out.print ("Type in third number ");
      n3 = input.nextInt();
      
      smallest = min(n1, n2, n3);
      System.out.println("The number is " + smallest);
   }
   public static int min(int num1, int num2, int num3)
   {
      if (num1 <= num2 && num1 <= num3)
      {
         return num1;
      }
      else if (num2 <= num3 && num2 <= num1)
      {
         return num2;
      }
      else
      {
         return num3;
      }
   }
}
