/* Practical P06A- Book Class
Eryk Gloginski
02/03/2021
Program Book Class .*/

public class Book
{
   //instance variables
   private String title;
   private String author;
   private int year;
   
   public Book(String titleIn, String authorIn)
   {
      title = titleIn;
      author = authorIn;
      year = 2021;
   }
   
   public Book(String titleIn, String authorIn, int yearIn)
   {
      title = titleIn;
      author = authorIn;
      year = yearIn;
   }
   
   public String getTitle()
   {
      return title;
   }

   public String getAuthor()
   {
      return author;
   }

   public int getYear()
   {
      return year;
   }
}