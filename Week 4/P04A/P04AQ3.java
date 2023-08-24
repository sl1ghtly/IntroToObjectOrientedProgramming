/* Practical P04A- Question 3
Eryk Gloginski
16/02/2020
Program P04AQ3 .*/

import java.awt.Rectangle;
import java.util.Scanner;

public class P04AQ3
{
   public static void main(String[] args)
   {
      Rectangle r2 = new Rectangle();
      Scanner input = new Scanner(System.in);
      double perimeter, area, h, w;
      int height, width;
      System.out.println("Input the height: ");
      height = input.nextInt();
      System.out.println("Input the width: ");
      width = input.nextInt();
      
      r2.setSize(width, height);
      
      h = r2.getHeight();
      w = r2.getWidth();
      
      perimeter = 2 * w + 2 * h;
      area = w * h;
      
      System.out.println("Perimeter of Rectangle: " + perimeter);
      System.out.println("Area of Rectangle: " + area);
   }
}