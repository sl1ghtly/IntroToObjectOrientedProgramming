/* Practical P04B- Question 5
Eryk Gloginski
17/02/2020
Program P04BQ5 .*/

import java.awt.Rectangle;
import java.util.Scanner;

public class P04BQ5
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle();
      Rectangle r2 = new Rectangle();
      boolean answer;
      
      r1.setSize(50, 100);
      r2.setSize(50, 100);
      r1.setLocation(0, 0);
      r2.setLocation(100, 200);

      answer = r1.equals(r2); // needs to be in the exact same place and same coordinates basically fill in the same space
      System.out.println(answer);
   }
}