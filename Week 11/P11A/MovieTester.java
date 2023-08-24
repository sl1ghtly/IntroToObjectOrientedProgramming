/* Practical P11A- MovieTester Class
Eryk Gloginski
20/04/2021
Program MovieTester Class .*/

public class MovieTester
{
   public static void main(String [] args)
   { 
      Date date1 = new Date(7, 6, 1996);
      Date date2 = new Date(21, 5, 1994);
      Movie movie1 = new Movie("The Rock", date1);
      Movie movie2 = new Movie("Pulp Fiction", date2);
      Movie movie3 = new Movie("Infinity War", new Date(23, 4, 2018));
      Movie movie4 = new Movie("Avengers Endgame", 25, 4, 2019);

      movie1.addStar("Nicholas Cage");
      movie1.addStar("Sean Connery");
      movie2.addStar("Samuel L Jackson");
      movie2.addStar("John Travolta");
      movie2.addStar("Uma Thurman");
      movie2.addStar("Bruce Willis");
      
      System.out.println(movie1.toString());
      
      System.out.println(movie2.toString());
      
      System.out.println(movie3.toString());
      
      System.out.println(movie4.toString());
      
   }
}