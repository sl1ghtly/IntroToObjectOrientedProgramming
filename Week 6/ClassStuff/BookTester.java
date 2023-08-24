/* Practical P06A- Question 1
Eryk Gloginski
02/03/2021
Program P06AQ1 .*/

public class BookTester
{
   public static void main(String [] args)
   {
      String title = "My Title";
      String author = "Eryk";
      int year = 2000;
      
      Book myBook1 = new Book(title, author);
      Book myBook2 = new Book(title, author, year);
      
      System.out.println("Book 1 Title: " + myBook1.getTitle());
      System.out.println("Book 1 Author: " + myBook1.getAuthor());
      System.out.println("Book 1 Year: " + myBook1.getYear());
      
      System.out.println();
      
      System.out.println("Book 2 Title: " + myBook2.getTitle());
      System.out.println("Book 2 Author: " + myBook2.getAuthor());
      System.out.println("Book 2 Year: " + myBook2.getYear());
      
   }  
}