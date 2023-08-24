/* Practical P02C- Question 1
Eryk Gloginski
03/02/2020
Program P02CQ1 .*/

import java.util.Scanner;

public class P02CQ1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double temperature1, temperature2, temperature3;
      String answer;
      System.out.println("Please enter Temperature #1: ");
      temperature1 = input.nextDouble();
      System.out.println("Please enter Temperature #2: ");
      temperature2 = input.nextDouble();
      System.out.println("Please enter Temperature #3: ");
      temperature3 = input.nextDouble();
      
      answer = calcAverageTemp(temperature1, temperature2, temperature3);
      System.out.println(answer);
   }
   public static String calcAverageTemp(double temp1, double temp2, double temp3)
   {
      double averageTemp;
      String avgTempString = " ";
      averageTemp = (temp1 + temp2 + temp3 / 3);
      if(averageTemp < 0)
      {
         avgTempString = "FREEZING";
      }
      else if(averageTemp > 1 && averageTemp < 9)
      {
         avgTempString = "COLD"; 
      }
      else if(averageTemp > 9 && averageTemp < 16)
      {
         avgTempString = "MODERATE";
      }
      else
      {
         avgTempString = "WARM";
      }
      return avgTempString;
   }
}
