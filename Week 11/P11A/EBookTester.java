/* Practical P11A- EBookTester Class
Eryk Gloginski
20/04/2021
Program EBookTester Class .*/

import java.util.Scanner;

public class EBookTester
{
   public static void main(String [] args)
   { 
      Scanner input = new Scanner(System.in);
      EBook book1 = new EBook("War and Peace", 5);
      EBook book2 = new EBook("Good Omens", 2);
      EBook book3 = new EBook("Heads You Lose", 3);

      book1.addAuthor("Leo Tolsoy");
      book2.addAuthor("Neil Gaiman");
      book2.addAuthor("Terry Pratchett");
      book3.addAuthor("Lisa Lutz");
      book3.addAuthor("David Hayward");
      
      System.out.println(book1.toString());
      
      System.out.println(book2.toString());
      
      System.out.println(book3.toString());
   }
}