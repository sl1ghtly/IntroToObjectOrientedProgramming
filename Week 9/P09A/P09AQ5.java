/* Practical P09A- P09AQ5 
Eryk Gloginski
22/03/2021
Program P09AQ5 .*/

import java.util.Scanner;
import java.util.ArrayList;

public class P09AQ5
{
   public static void main(String [] args)
   {  
      ArrayList<String> teams = new ArrayList<String>();
      Scanner input = new Scanner(System.in);
      int position, choice;
      String teamAdd, teamRemove;
      
      do
      {
         System.out.println();
         System.out.println("League Menu: ");
         System.out.println("1. View all teams. ");
         System.out.println("2. View one team. (based on position) ");
         System.out.println("3. Add a team. (to end of list) ");
         System.out.println("4. Insert a team in list. ");
         System.out.println("5. Remove a team. (use name) ");
         System.out.println("6. Remove a team. (based on position) ");
         System.out.println("0. Exit. ");
         
         System.out.println();
         System.out.println("Enter your choice: ");
         choice = input.nextInt();
         
         switch(choice)
         {
            case 1:
               if (teams.size() == 0)
               {
                  System.out.println("Nothing is currently added. ");
               }
               else
               {
                  for (int i = 0; i < teams.size(); i++)
                  {
                     System.out.println(teams.get(i));
                  }
               }
               break;
            case 2:
               System.out.println("Enter the position to view the team at: (1 - " + teams.size() + ")");
               position = input.nextInt();
               if (position > teams.size())
               {
                  System.out.println("Number larger than list size or a negative number. ");
               }
               else
               {
                  System.out.println(teams.get((position - 1)));
               }
               break;
            case 3:
               System.out.println("Enter a team to add to the end of the list: ");
               input.nextLine();
               teamAdd = input.nextLine();
               teams.add(teamAdd);
               break;
            case 4:
               System.out.println("Enter a team name to add: ");
               input.nextLine();
               teamAdd = input.nextLine();
               System.out.println("Enter a position to add it at: (1 - " + teams.size() + ")");
               position = input.nextInt();
               teams.add((position - 1), teamAdd);
               break;
            case 5:
               System.out.println("Enter a team to remove (name): ");
               input.nextLine();
               teamRemove = input.nextLine();
               teams.remove(teamRemove);
               break;
            case 6:
               System.out.println("Enter a team to remove (position): ");
               position = input.nextInt();
               if (position > teams.size())
               {
                  System.out.println("Number larger than list size or a negative number.  ");
               }
               else
               {
                  teams.remove((position - 1));
               }
               break;
            case 0:
               System.out.println("Exiting application! ");
               break;
            default:
               System.out.println("Invalid option! ");
         }

      } while(choice != 0);
      
   }
}