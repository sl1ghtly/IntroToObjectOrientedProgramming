/* Practical P04B- Question 1
Eryk Gloginski
17/02/2020
Program P04BQ1 .*/

import java.awt.Rectangle;
import java.util.Scanner;

public class P04BQ1
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(20, 20);
      Scanner input = new Scanner(System.in);
      int xCoordinate, yCoordinate;
      double x, y;
      System.out.println("Input the X: ");
      xCoordinate = input.nextInt();
      System.out.println("Input the Y: ");
      yCoordinate = input.nextInt();
      
      r1.setLocation(xCoordinate, yCoordinate);
      
      x = r1.getX() + 50;
      y = r1.getY() - 70;
      
      System.out.println("New Coordinates: (" + x + ", " + y + ") ");
      
   }
}