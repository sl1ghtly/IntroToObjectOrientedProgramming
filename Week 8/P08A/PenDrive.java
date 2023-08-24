/* Practical P08A- PenDrive Class
Eryk Gloginski
15/03/2021
Program PenDrive Class .*/

public class PenDrive
{
   //instance variables
   private String brand;
   private double storageCapacity;
   private double price;
   
   public PenDrive(String brandIn, double priceIn)
   {
      storageCapacity = 16;
      brand = brandIn;
      price = priceIn;
   }
   
   public PenDrive(double storageIn, String brandIn, double priceIn)
   {
      storageCapacity = storageIn;
      brand = brandIn;
      price = priceIn;
   }
   
   //methods
   
   public String toString()
   {
      String str = new String();
      str = str + "PenDrive Brand: " + brand;
      str = str + "\nStorage Capacity: " + storageCapacity;
      str = str + "\nPrice: " + price;
      return str;
   }
}