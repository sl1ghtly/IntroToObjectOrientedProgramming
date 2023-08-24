/* Practical P09B- VenueTester 
Eryk Gloginski
24/03/2021
Program VenueTester .*/

import java.util.Scanner;
import java.util.ArrayList;

public class VenueTester
{
   public static void main(String [] args)
   {  
      
      ArrayList<Venue> venues = new ArrayList<Venue>();
      
      venues.add(new Venue("Croke Park", "Dublin", 82000));
      venues.add(new Venue("Aviva Stadium,", "Dublin", 60000));
      venues.add(new Venue("3 Arena", "Dublin", 13000));
      venues.add(new Venue("Point Theatre", "Dublin", 8500));
      venues.add(new Venue("Mill Street", "Cork", 8000));
      venues.add(new Venue("Olympia Theatre", "Dublin", 1240));
      
      System.out.println("Venues for our tour: "); 
      for (Venue place : venues)
      {
         System.out.println(place.toString());
      }
      
      System.out.println();
      
      System.out.println("Final list of venues: ");
      venues.add(2, new Venue("The O2", "Dublin", 20000));
      venues.remove(1);
      venues.set(5, new Venue("The Balor Theatre", "Ballybofey", 300));
      for (Venue place : venues)
      {
         System.out.println(place.toString());
      }
      
      System.out.println();
      
      System.out.println("Number of venues: " + venues.size());
      System.out.println("First venue: " + venues.get(0));
      System.out.println("Last venue: " + venues.get(venues.size() - 1));
   }
}