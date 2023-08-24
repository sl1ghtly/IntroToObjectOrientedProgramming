/* Practical P01C- Question 5
Eryk Gloginski
28/01/2020
Program P01CQ5 .*/

import java.util.Scanner;

public class P01CQ5
{
   public static void main(String[] args)
   {
      // construct scanner
      Scanner input = new Scanner(System.in);
      // declare/take in variables
      int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      
      searchArray(7, numArray);
   } //end main method

   public static void searchArray(int value, int [] theArray)
   {
      for (int i = 0; i < theArray.length; i++)
      {
         if (theArray[i] == value)
         {
            System.out.println("Value " + value + " located in the " + i + " position!"); 
         }
      }
   }
}
