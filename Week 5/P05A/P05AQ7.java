/* Practical P05A- Question 7
Eryk Gloginski
23/02/2020
Program P05AQ7 .*/

import java.util.Scanner;

public class P05AQ7
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
      
      // get diagonal
      double answer = myOblong.getDiagonal(width, height);
      System.out.println("Diagonal length: " + answer);
   }
}