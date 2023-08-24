/* Practical P04A- Question 4
Eryk Gloginski
16/02/2020
Program P04AQ4 .*/

import java.awt.Rectangle;
import java.util.Scanner;

public class P04AQ4
{
   public static void main(String[] args)
   {
      Rectangle r = new Rectangle(100, 100, 200, 200);
      Scanner input = new Scanner(System.in);
      
      // sends the coordinates X and Y, width and height back at us.
      System.out.println(r.toString());
      
   }
}