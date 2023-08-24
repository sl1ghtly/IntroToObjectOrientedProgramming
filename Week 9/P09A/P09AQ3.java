/* Practical P09A- P09AQ3 
Eryk Gloginski
22/03/2021
Program P09AQ3 .*/

import java.util.Scanner;
import java.util.ArrayList;

public class P09AQ3
{
   public static void main(String [] args)
   {  
      ArrayList<String> topTeams = new ArrayList<String>();
      Scanner input = new Scanner(System.in);
      String removeTeam;
      
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
      System.out.println("Enter a team to remove:");
      removeTeam = input.nextLine();
      topTeams.remove(removeTeam);
      System.out.println();
      System.out.println("After removal");
      for (int i = 0; i < topTeams.size(); i++)
      {
         System.out.println(topTeams.get(i));
      }
   }
}