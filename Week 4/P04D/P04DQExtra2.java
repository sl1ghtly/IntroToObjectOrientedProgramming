/* Practical P04D- Question Extra2
Eryk Gloginski
18/02/2020
Program P04DQExtra2 .*/

import java.util.Scanner;

public class P04DQExtra2
{
   public static void main(String[] args)
   {
      // vars
      String temp;
      String str[] = new String[] {"Unintelligent aquatic weird fox", "Bad aquatic quick fox"};
      
      // sort strings
      for (int i = 0; i < str.length; i++) 
      {
         for (int j = i + 1; j < str.length - 1; j++) 
         { 
            if (str[i].compareToIgnoreCase(str[j])>0) 
            {
               temp = str[i];
               str[i] = str[j];
               str[j] = temp;
            }
         }
      }
      // display in sorted order
      System.out.println("Strings in Sorted Order: ");
      for (int k = 0; k <= str.length - 1; k++) 
      {
         System.out.println(str[k]);
      }
   }
}