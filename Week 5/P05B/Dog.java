/* Practical P05B- Dog Class
Eryk Gloginski
24/02/2020
Program Dog Class .*/

public class Dog
{
   //instance variables
   private int size;
   private String breed;
   
   
   //methods
   public void setSize(int sizeIn)
   {
      size = sizeIn;
   }
   
   public int getSize()
   {
      return size;
   }
   
   public void setBreed(String breedIn)
   {
      breed = breedIn;
   }
   
   public String getBreed()
   {
      return breed;
   }
   
   public String bark()
   {
      if(size < 10)
      {
         return "yap, yap";
      }
      else if(size < 30)
      {
         return "bow, wow";
      }
      else
      {
         return "ruff, ruff";
      }
   }
}