/* Practical P08B- P08BQ4 Class
Eryk Gloginski
11/03/2021
Program P08BQ4 Class .*/

import java.util.Scanner;
import java.lang.Math;

public class ArrayNumberFinder
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
	   double[] myArray = {3.45, 6.28, 35.6, 9.99, 33.33};
      double toFind;
      int position = 0;
      
      System.out.print("Contents of the array: ");
      for(int i = 0; i < myArray.length; i++)
      {
         System.out.print(myArray[i] + " ");
      }
      
      System.out.println();
      System.out.print("Enter umber you wish to find: ");
      toFind = input.nextDouble();
      
      for(int j = 0; j < myArray.length; j++)
      {
         if(toFind == myArray[j])
         {
            position = j;
         }
      }
      
      System.out.println();
      System.out.println(toFind + " number was found at position " + position);
      System.out.println("Rounded to the nearest whole number: " + Math.round(toFind));
      System.out.println("Square Root: " + Math.sqrt(toFind));
      System.out.println("Square: " + (toFind * toFind));
   }
}