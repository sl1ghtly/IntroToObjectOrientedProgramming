/* Practical P04B- Question 6
Eryk Gloginski
17/02/2020
Program P04BQ6 .*/

import java.util.Scanner;
import java.util.Random;

public class P04BQ6
{
   public static void main(String[] args)
   {
      Random gen = new Random();
      int number = gen.nextInt(6);
      number = number + 1;

      System.out.println("Rolling your dice: " + number);
      
      
   }
}