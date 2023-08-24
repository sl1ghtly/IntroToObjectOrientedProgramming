/* Practical P02C- Question 3
Eryk Gloginski
03/02/2020
Program P02CQ3 .*/

import java.util.Scanner;

public class P02CQ3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] numbers = {3, 5, 7, 9, 11, 13, 15, 17, 19};
      int numberToFind, ans1, ans2, ans3;
            
      System.out.println("Please enter a value to find: ");
      numberToFind = input.nextInt();
      
      ans1 = findInArray(numbers, numberToFind);
      ans2 = findLargest(numbers);
      ans3 = countValues(numbers, numberToFind);
      
      //display answer 1
      if(ans1 == -1)
      {
         System.out.println("1. Number not found");
      }
      else
      {
         System.out.println("1. Number " + numberToFind + " found at position " + ans1);
      }
      
      //display answer 2
      System.out.println("2. Maximum Value: " + ans2);
      
      //display answer 3
      System.out.println("3. Amount of Value (" + numberToFind + ")s in the array is: " + ans3);
      
   }
   public static int findInArray(int [] array, int value)
   {
      int position = -1;
      int[] numbers = array;
      for(int a = 0; a < array.length; a++)
      {
         if (numbers[a] == value)
         {
            position = a;
         }
      }
      return position;
   }
   public static int findLargest(int [] array)
   {
      int max = array[0];
      for(int b = 0; b < array.length; b++)
      {
         if(array[b] > max)
         {
           max = array[b];
         }
      }
      return max;
   }
   public static int countValues(int [] array, int value)
   {
      int amount = 0;
      for(int c = 0; c < array.length; c++)
      {
         if(array[c] == value)
         {
            amount++;
         }
      }
      return amount;
   }
}
