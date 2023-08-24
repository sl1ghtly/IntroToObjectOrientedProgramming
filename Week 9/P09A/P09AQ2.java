/* Practical P09A- P09AQ2 
Eryk Gloginski
22/03/2021
Program P09AQ2 .*/

import java.util.Scanner;
import java.util.ArrayList;

public class P09AQ2
{
   public static void main(String [] args)
   {  
      ArrayList<String> topTeams = new ArrayList<String>();
      Scanner input = new Scanner(System.in);
      String addTeam;
      int position;
      
      topTeams.add("Man City");
      topTeams.add("Man United");
      topTeams.add("Liverpool");
      topTeams.add("Tottenham Hotspur");
      topTeams.add("Chelsea");
      
      System.out.println("Before addition");
      System.out.println();
      for (int i = 0; i < topTeams.size(); i++)
      {
         System.out.println(topTeams.get(i));
      }
      System.out.println();
      System.out.println("Enter a team to add:");
      addTeam = input.nextLine();
      System.out.println("Enter the position to add it at: (1 - " + topTeams.size() + ")");
      position = input.nextInt();
      topTeams.add((position - 1), addTeam);
      System.out.println();
      System.out.println("After addition");
      for (int i = 0; i < topTeams.size(); i++)
      {
         System.out.println(topTeams.get(i));
      }
   }
}