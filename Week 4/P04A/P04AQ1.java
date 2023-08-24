/* Practical P04A- Question 1
Eryk Gloginski
16/02/2020
Program P04AQ1 .*/

import java.awt.Rectangle;

public class P04AQ1
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle();
      
      r1.setLocation(15, 35);
      r1.setSize(10, 20);
      double x = r1.getX();
      double y = r1.getY();
      
      System.out.println("The x coordinate is: " + x);
      System.out.println("The y coordinate is: " + y);
      double h = r1.getHeight();
      System.out.println("The height is: " + h);
      double w = r1.getWidth();
      System.out.println("The width is: " + w);
   }
}