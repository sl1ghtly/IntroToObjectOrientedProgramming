/* Practical P05A- Question 6
Eryk Gloginski
23/02/2020
Program P05AQ6 .*/

import java.util.Scanner;

public class P05AQ6
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
      
      // ask for more input
      System.out.println("Enter the height that you want to add: ");
      int addingHeight = input.nextInt();
      System.out.println("Enter the width that you want to add: ");
      int addingWidth = input.nextInt();
      
      myOblong.addHeight(addingHeight);
      myOblong.addWidth(addingWidth);

      // use methods to retrieve values of instance variables
      System.out.println("Height: " + myOblong.getHeight());
      System.out.println("Width: " + myOblong.getWidth());
   }
}