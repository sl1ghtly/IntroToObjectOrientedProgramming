/* Practical P04A- Question 6
Eryk Gloginski
16/02/2020
Program P04AQ6 .*/

import java.awt.Rectangle;
import java.util.Scanner;

public class P04AQ6
{
   public static void main(String[] args)
   {
      Rectangle r4 = new Rectangle(10, 20);
      Scanner input = new Scanner(System.in);
      int xCoordinate, yCoordinate;
      double h, w, x, y;
      System.out.println("Input the X: ");
      xCoordinate = input.nextInt();
      System.out.println("Input the Y: ");
      yCoordinate = input.nextInt();
      
      h = r4.getHeight();
      w = r4.getWidth();
      x = r4.getX();
      y = r4.getY();
      
      if(xCoordinate <= w && yCoordinate <= h)
      {
         System.out.println("The rectangle does contain the point (" + xCoordinate + ", " + yCoordinate + ")");
      }
      else
      {
         System.out.println("The rectangle does not contain the point (" + xCoordinate + ", " + yCoordinate + ")");
      }
   }
}