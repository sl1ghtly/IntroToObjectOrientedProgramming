/* Practical P04A- Question 2
Eryk Gloginski
16/02/2020
Program P04AQ2 .*/

import java.awt.Rectangle;
import java.util.Scanner;

public class P04AQ2
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle();
      Scanner input = new Scanner(System.in);
      
      System.out.println("Input the X coordinate: ");
      double xCoordinate = input.nextDouble();
      System.out.println("Input the Y coordinate: ");
      double yCoordinate = input.nextDouble();
      
      System.out.println("Input the height: ");
      int height = input.nextInt();
      System.out.println("Input the width: ");
      int width = input.nextInt();
      
      r1.setSize(width, height);
      
      System.out.println("The x coordinate is: " + xCoordinate);
      System.out.println("The y coordinate is: " + yCoordinate);
      double h = r1.getHeight();
      System.out.println("The height is: " + h);
      double w = r1.getWidth();
      System.out.println("The width is: " + w);
   }
}