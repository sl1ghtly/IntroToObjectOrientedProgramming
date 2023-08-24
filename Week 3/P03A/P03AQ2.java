/* Practical P03A- Question 2
Eryk Gloginski
08/02/2020
Program P03AQ2 .*/

import java.util.Scanner;

public class P03AQ2
{    
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);  
      String str1, str2;
      int count1 = 0;
      int count2 = 0;
      
      System.out.println("Please enter the first String: ");
      str1 = input.nextLine();
      System.out.println("Please enter the second String: ");
      str2 = input.nextLine(); 
            
      for(int i = 0; i < str1.length(); i++)
      {
         if(str1.charAt(i) != ' ')
         count1++;    
      }
      
      for(int i = 0; i < str2.length(); i++)
      {
         if(str2.charAt(i) != ' ')
         count2++;    
      }
      
      if(count1 > count2)
      {
         System.out.println(str1 + " is the longest String."); 
      }
      else
      {
         System.out.println(str2 + " is the longest String."); 
      }
   }    
}     