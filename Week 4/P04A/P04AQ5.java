/* Practical P04A- Question 5
Eryk Gloginski
16/02/2020
Program P04AQ5 .*/

import java.awt.Rectangle;
import java.util.Scanner;

public class P04AQ5
{
   public static void main(String[] args)
   {
      Rectangle r3 = new Rectangle();
      Scanner input = new Scanner(System.in);
      
      double perimeter, area, h, w;
      int height, width;
      System.out.println("Input the width: ");
      width = input.nextInt();
      System.out.println("Input the height: ");
      height = input.nextInt();
      
      r3.setSize(width + 10, height + 24);
      h = r3.getHeight();
      w = r3.getWidth();
      
      System.out.println("The new width is: " + w);
      System.out.println("The new height is: " + h);
   }
}