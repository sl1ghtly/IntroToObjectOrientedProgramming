/* Practical P07C- Song Class
Eryk Gloginski
10/03/2021
Program Song Class .*/

public class Song
{
   //instance variables
   private String artist;
   private String title;
   private int year;
   private int seconds;
   
   public Song(String nameIn, String titleIn, int yearIn, int secIn)
   {
      artist = nameIn;
      title = titleIn;
      year = yearIn;
      seconds = secIn;
   }
   
   //methods
   
   public String toString()
   {
      String str = new String();
      str = str + "Artist: " + artist;
      str = str + "\nSong Title: " + title;
      str = str + "\nYear: " + year;
      str = str + "\nDuration (S): " + seconds;
      return str;
   }
   
   public boolean equals(Song anotherSong)
   {
      return(artist == anotherSong.artist
      && title == anotherSong.title
      && year == anotherSong.year
      && seconds == anotherSong.seconds);
   }

   public String getArtist()
   {
      return artist;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public int getYear()
   {
      return year;
   }
   
   public int getDuration()
   {
      return seconds;
   }
   
   
}