/* Practical P07A- Bottle Class
Eryk Gloginski
08/03/2021
Program Bottle Class .*/

public class Bottle
{
   //instance variables
   private double capacity;
   private double amount;
   
   public Bottle()
   {
      capacity = 0.75;
   }
   
   public Bottle(double capacityIn)
   {
      capacity = capacityIn;
   }
   
   public void fillBottle()
   {
      amount = capacity;
   }
   
   public void fillBottle(double amountIn)
   {
      if(amountIn > capacity && amountIn + amount > capacity)
      {
         System.out.println("Too much liquid in bottle. ");
      }
      else
      {
         amount = amount + amountIn;
      }
   }
   
   public void emptyBottle()
   {
      amount = amount - amount;
   }
   
   public void pourBottle(double amountIn)
   {
      if(amountIn <= amount && amountIn <= capacity)
      {
         amount = amount - amountIn;
      }
      else
      {
         System.out.println("Not enough liquid in bottle. ");
      }
   }
   
   public double getAmountIn()
   {
      return amount;
   }
   
   public double getAmountNeeded()
   {
      return capacity - amount; 
   }
   
}
