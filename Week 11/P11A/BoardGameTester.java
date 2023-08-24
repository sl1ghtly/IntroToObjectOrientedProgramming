/* Practical P11A- BoardGame Class
Eryk Gloginski
20/04/2021
Program BoardGame Class .*/

public class BoardGameTester
{
   public static void main(String [] args)
   {
      BoardGame monopoly = new BoardGame("Monopoly", "Hasbro", 3);
      monopoly.setNumberOfPlayers(4);
      
      System.out.println(monopoly);
      System.out.println("Full title: " + monopoly.getFullTitle());


   }
}