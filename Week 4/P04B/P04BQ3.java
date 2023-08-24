/* Practical P04B- Question 3
Eryk Gloginski
17/02/2020
Program P04BQ3 .*/

import java.awt.Rectangle;
import java.util.Scanner;

public class P04BQ3
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle();
      Rectangle r2 = new Rectangle();
      Rectangle r3 = new Rectangle();
      double width3, height3;
      
      r1.setSize(50, 100);
      r2.setSize(50, 100);
      r1.setLocation(0, 0);
      r2.setLocation(300, 600);

      System.out.println("X coordinate of r1 is: " + r1.getX());
      System.out.println("Y coordinate of r1 is: " + r1.getY());
      System.out.println("The width of r1 is: " + r1.getWidth());
      System.out.println("The height of r1 is: " + r1.getHeight());
      System.out.println();
      System.out.println("X coordinate of r2 is: " + r2.getX());
      System.out.println("X coordinate of r2 is: " + r2.getY());
      System.out.println("The width of r2 is: " + r2.getWidth());
      System.out.println("The height of r2 is: " + r2.getHeight());
      
      r3 = r1.intersection(r2);
      width3 = r3.getWidth();
      height3 = r3.getHeight();
      if(width3 > 0 && height3 > 0)
      {
         System.out.println("The dimensions of the intersecting rectangle r3 is: " + r3.toString());
      }
      else
      {
         System.out.println("The rectangle r3 does not intersect. ");
      }
   }
}