/* Practical P09B- Venue Class
Eryk Gloginski
24/03/2021
Program Venue Class .*/

public class Venue
{
   //instance variables
   private String name;
   private String town;
   private int capacity;
   
   public Venue(String nameIn, String townIn, int capacityIn)
   {
      name = nameIn;
      town = townIn;
      capacity = capacityIn;
   }
   
   public String toString()
   {
      String str = new String();
      str = str + name + ", " + town + " - Capacity: " + capacity;
      return str;
   }
   
   public String getName()
   {
      return name;
   }
   public String getTown()
   {
      return town;
   }
   public int getCapacity()
   {
      return capacity;
   }

}
