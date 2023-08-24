/* CA1
Eryk Gloginski - L00157413
04/03/2021
Java Class BookTester*/

public class BookTester
{
   public static void main(String [] args)
   {   
      Book classic = new Book("Herman Melville", "Moby Dick", 1851);
      
      // get author name
      System.out.println("Book author: " + classic.getAuthor());
      // get book title
      System.out.println("Book title: " + classic.getTitle());
      // get year written in
      System.out.println("Book written in year: " + classic.getYear());
      System.out.println();
      // set and get book price
      System.out.println("Book Price before price is set: " + classic.getPrice());
      classic.setPrice(20);
      System.out.println("Book Price after price is set: " + classic.getPrice());
      System.out.println();
      // calculate hardback price of book
      System.out.println("Hardback book price: " + classic.calculateHardbackPrice());
      System.out.println();
      // get book details
      System.out.println(classic.getBookDetails());
   }
}