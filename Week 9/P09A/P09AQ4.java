/* Practical P09A- P09AQ4 
Eryk Gloginski
22/03/2021
Program P09AQ4 .*/

import java.util.Scanner;
import java.util.ArrayList;

public class P09AQ4
{
   public static void main(String [] args)
   {  
      ArrayList<String> topTeams = new ArrayList<String>();
      Scanner input = new Scanner(System.in);
      int position;
      
      topTeams.add("Man City");
      topTeams.add("Man United");
      topTeams.add("Liverpool");
      topTeams.add("Tottenham Hotspur");
      topTeams.add("Chelsea");
      
      System.out.println("Before removal");
      System.out.println();
      for (int i = 0; i < topTeams.size(); i++)
      {
         System.out.println(topTeams.get(i));
      }
      System.out.println();
      System.out.println("Enter the position to remove it at: (1 - " + topTeams.size() + ")");
      position = input.nextInt();
      topTeams.remove((position - 1));
      System.out.println();
      System.out.println("After removal");
      for (int i = 0; i < topTeams.size(); i++)
      {
         System.out.println(topTeams.get(i));
      }
   }
}