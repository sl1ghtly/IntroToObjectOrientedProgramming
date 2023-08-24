/* Practical P11A- BoardGame Class
Eryk Gloginski
20/04/2021
Program BoardGame Class .*/

public class BoardGame
{
   private String title;
   private String publisher;
   private int numberOfPlayers;
   
   public BoardGame(String titleIn, String publisherIn, int numberOfPlayersIn)
   {
      title = titleIn;
      publisher = publisherIn;
      numberOfPlayers = numberOfPlayersIn;
   }
   
   public void setNumberOfPlayers(int playersIn)
   {
      playersIn = numberOfPlayers;
   }
   
   public String toString()
   {
      String str = "Title " + title;
      str = str + " Publisher: " + publisher;
      str = str + " Number of players: " + numberOfPlayers;
      return str;
   }
   
   public String getFullTitle()
   {
      String str = new String();
      str = title + " (" + publisher + ")";
      return str; 
   }
}