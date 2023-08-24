/* Practical P11A- Movie Class
Eryk Gloginski
20/04/2021
Program Movie Class .*/

import java.util.ArrayList;
public class Movie
{
   // instance variables
   private String title;
   private Date releaseDate;
   private ArrayList <String> starring;
   
   public Movie(String titleIn, Date releaseDateIn)
   {
      title = titleIn;
      releaseDate = releaseDateIn;
      starring = new ArrayList <String>();  
   }
   
   public Movie(String titleIn, int dayIn, int monthIn, int yearIn)
   {
      title = titleIn;
      releaseDate = new Date(dayIn, monthIn, yearIn);
      starring = new ArrayList <String>();  
   }
   
   public void addStar(String starIn)
   {
      starring.add(starIn);
   }   
   
   public void removeStar(String starIn)
   {
      for(String s: starring)
      {
         if (s == starIn)
            starring.remove(s);
      } 
   }
   
   private void setReleaseDate(Date dateIn)
   {
      releaseDate = dateIn;
   }
   
   public String toString()
   {
      String str = "\nTitle: " + title;
      str = str + "\nStarring: ";
      for(String s: starring)
      {
         str = str + s + ", ";
      }  
      str = str + "\nRelease Date: " + releaseDate.toString();
      return str;
   }  
}