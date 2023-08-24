/* Practical P06A- Pair Class
Eryk Gloginski
01/03/2021
Program Pair Class .*/

public class Pair
{
   //instance variables
   private double num1;
   private double num2;
   private double sum;
   private double difference;
   private double product;
   private double average;
   private double max;
   private double min;
   
   
   //methods
   public void setNum1(double n1)
   {
      num1 = n1;
   }
   
   public void setNum2(double n2)
   {
      num2 = n2;
   }
   
   public double getNum1()
   {
      return num1;
   }
   
   public double getNum2()
   {
      return num2;
   }
   
   public void setNumOneAndTwo(double n1, double n2)
   {
      num1 = n1;
      num2 = n2;
   }
   
   public double calcSum()
   {
      return sum = num1 + num2;
   }
   
   public double calcDifference()
   {
      if(num1 > num2)
      {
         difference = num1 - num2; 
      }
      else
      {
         difference = num2 - num1;
      }
      
      return difference;
   }
   
   public double calcProduct()
   {
      return product = num1 * num2;
   }
   
   public double calcAverage()
   {
      return average = (num1 + num2) / 2;
   }
   
   public double findMax()
   {
      if(num1 > num2)
      {
         max = num1;
      }
      else
      {
         max = num2;
      }
      
      return max;
   }
   
   public double findMin()
   {
      if(num2 > num1)
      {
         min = num1;
      }
      else
      {
         min = num2;
      }
      
      return min;
   }
}