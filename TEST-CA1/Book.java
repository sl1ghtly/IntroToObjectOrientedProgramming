/* CA1
Eryk Gloginski - L00157413
04/03/2021
Java Class Book*/

public class Book
{
   // instance variables
   private String author;
   private String title;
   private int year;
   private double price;
   
   // constructor - do not change this code
   public Book(String authorIn, String titleIn, int yearIn)
   {
      author = authorIn;
      title = titleIn;
      year = yearIn; 
      price = 0;  
   }
   
   // methods
   // get author method
   public String getAuthor()
   {
      return author;
   }
   
   // get title method
   public String getTitle()
   {
      return title;
   }
   
   // get year method
   public int getYear()
   {
      return year;
   }
   
   // get price method
   public double getPrice()
   {
      return price;
   }
   
   // set price method
   public void setPrice(double priceIn)
   {
      price = priceIn;
   }
   
   // calculate hardback price method 
   public double calculateHardbackPrice()
   {
      return price = price + (price * 0.20);
   }
   
   // get book details method
   public String getBookDetails()
   {
      String[] surname = author.split(" ", 3);
      return surname[surname.length - 1] + " (" + year + "), " + title;
   }
   
}