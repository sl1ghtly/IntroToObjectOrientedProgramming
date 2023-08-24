/* Practical P08A- Car Class
Eryk Gloginski
15/03/2021
Program Car Class .*/

public class Car
{
   //instance variables
   private double fuel;
   private double fuelCapacity;
   private double milesPerGal;
   private double milesDriven = 0;
   
   public Car(double capacityIn, double milesPerGalIn)
   {
      fuelCapacity = capacityIn;
      milesPerGal = milesPerGalIn;
   }
   
   //methods
   
   public double getFuelLevel()
   {
      return fuel;
   }
   
   public void addFuel(double amountIn)
   {
      if(amountIn >= fuelCapacity && amountIn <= (fuelCapacity - fuel))
      {
         fuel = fuel + amountIn;
         System.out.println("Successfully added " + amountIn + " fuel! ");
      }
      else
      {
         System.out.println("Not enough Capacity. ");
      }
   }
   
   public void fillUp()
   {
      if(fuel != fuelCapacity)
      {
         fuel = fuelCapacity;
         System.out.println("Successfully filled the Tank! ");
      }
      else
      {
         System.out.println("Tank is already full. ");
      }
   }
   
   public void drive()
   {
      if(fuel > 0)
      {
         fuel = fuel - milesPerGal;
         milesDriven = milesDriven + 4;
         System.out.println("Vroom... \nMiles Driven: " + milesDriven);
      }
      else
      {
         System.out.println("Not enough fuel... ");
      }
   }
}