/* Practical P11A- EBook Class
Eryk Gloginski
20/04/2021
Program EBook Class .*/

// class representing an electronic Book
import java.util.ArrayList;
public class EBook
{
   // instance variables
   private String title;
   private int sizeInMegabytes;
   private ArrayList <String> authors;
   
   public EBook(String titleIn, int sizeInMegabytesIn)
   {
      title = titleIn;
      sizeInMegabytes = sizeInMegabytesIn;
      authors = new ArrayList <String>();  
   }
   
   public void addAuthor(String authorIn)
   {
      authors.add(authorIn);
   }   
   
   public void printAuthors()
   {
      for(String s: authors)
      {
         System.out.print(s + " ");
      } 
   }
   
   public String toString()
   {
      String str = "\nTitle: " + title;
      str = str + "\nSize: " + sizeInMegabytes + " mb";
      str = str + "\nAuthors: ";
      for(String s: authors)
      {
         str = str + s + ", ";
      }  
      
      return str;
   }  
}