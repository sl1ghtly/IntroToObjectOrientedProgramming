/* Practical P07C- Question 3
Eryk Gloginski
10/03/2021
Program SongTester Class .*/

public class SongTester
{
   public static void main(String [] args)
   {
      // instantiate an Enemy object called ghost
      Song mySong1 = new Song("MGK", "Rap Devil", 2018, 287);
      Song mySong2 = new Song("Eminem", "Killshot", 2018, 253);
      Song mySong3 = new Song("Eminem", "Killshot", 2021, 253);
      
      if(mySong2.equals(mySong3))
      {
         System.out.println("Song 2 Equals Song 3");
      }
      else
      {
         System.out.println("Song 2 Doen't Equal Song 3");
      }
      
      System.out.println();
      System.out.println(mySong1.toString());
      System.out.println();
      
      System.out.println("Artist: " + mySong2.getArtist() + " | Song: " + mySong2.getTitle() + " | Year Released: " + mySong2.getYear() + " | Duration in Seconds: " + mySong2.getDuration());
      
      
      
   }
}