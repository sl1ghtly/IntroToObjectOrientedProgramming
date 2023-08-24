public class Tester
{
   public static void main(String [] args)
   {
  
      int number1 = -10;
      int number2 = -79;
     
      System.out.println(getLargest(number1, number2));
     
      if(isNegative(number1))
      {
         System.out.println("Number 1 is below 0");
      }

   }
   
   public boolean isNegative(int numIn)
   {
      if(numIn < 0)
         return true;
      else
         return false;
   }
   
   public int getLargest(int numIn1, int numIn2)
   {
      if(numIn1 > numIn2)
         return numIn1;
      else
         return numIn2;
   }
}
