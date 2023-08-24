/* Practical P09B- County Class
Eryk Gloginski
24/03/2021
Program County Class .*/

public class County
{
   //instance variables
   private String name;
   private int population;
   
   public County(String nameIn, int populationIn)
   {
      name = nameIn;
      population = populationIn;
   }
   
   public String toString()
   {
      String str = new String();
      str = str + "County Name: " + name + "\nPopulation: " + population;
      return str;
   }
   
   public String getName()
   {
      return name;
   }
   public int getPopulation()
   {
      return population;
   }

}
