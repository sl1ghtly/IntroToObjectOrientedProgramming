/* Practical P05A- Question 2
Eryk Gloginski
23/02/2020
Program P05AQ2 .*/

import java.util.Scanner;

public class P05AQ2
{
   public static void main(String[] args)
   {
      // create scanner instance
      Scanner input = new Scanner(System.in);
      
      // create an instance of type Oblong
      Oblong myOblong = new Oblong();
      
      // ask for input
      System.out.println("Enter the height: ");
      int height = input.nextInt();
      System.out.println("Enter the width: ");
      int width = input.nextInt();

      // use methods to set instance variables
      myOblong.setHeight(height);
      myOblong.setWidth(width);

      // use methods to retrieve values of instance variables
      System.out.println("Width: " + myOblong.getWidth());
      System.out.println("Height: " + myOblong.getHeight());
      System.out.println("Area: " + myOblong.calculateArea());

   }
}