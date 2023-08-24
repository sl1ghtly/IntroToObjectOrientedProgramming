/* Practical P03A- Question 3
Eryk Gloginski
08/02/2020
Program P03AQ3 .*/

import java.util.Scanner;

public class P03AQ3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String str;
      System.out.println("Please enter a String: ");
      str = input.nextLine();
      
      System.out.println("Upper Case:" );
      System.out.println(str.toUpperCase());
      System.out.println();
      System.out.println("Lower Case:" );
      System.out.println(str.toLowerCase());
   }    
}     