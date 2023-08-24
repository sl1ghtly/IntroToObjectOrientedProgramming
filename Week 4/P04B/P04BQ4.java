/* Practical P04B- Question 4
Eryk Gloginski
17/02/2020
Program P04BQ4 .*/

import java.awt.Rectangle;
import java.util.Scanner;

public class P04BQ4
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle();
      Rectangle r2 = new Rectangle();
      Rectangle r3 = new Rectangle();
      Rectangle r4 = new Rectangle();
      
      double width3, height3;
      boolean ans1, ans2, ans3, ans4;
      
      r1.setSize(0, 0);
      r2.setSize(0, 1);
      r3.setSize(1, 0);
      r4.setSize(1, 1);
      
      ans1 = r1.isEmpty(); // true
      ans2 = r2.isEmpty(); // true
      ans3 = r3.isEmpty(); // true
      ans4 = r4.isEmpty(); // true
      
      System.out.println(ans1);
      System.out.println(ans2);
      System.out.println(ans3);
      System.out.println(ans4);
   }
}