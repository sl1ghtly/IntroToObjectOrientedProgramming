/* Practical P01C- Question 3
Eryk Gloginski
28/01/2020
Program P01CQ3 .*/

import java.util.Scanner;

public class P01CQ3
{
   public static void main(String[] args)
   {
      // construct scanner
      Scanner input = new Scanner(System.in);
      // declare/take in variables
      double kg, meters;
      System.out.println("Enter your weight in KG: ");
      kg = input.nextDouble();
      System.out.println("Enter your height in meters: ");
      meters = input.nextDouble();
      
      calcBMI(kg, meters);
   } //end main method

   public static void calcBMI(double weight, double height)
   {
      double bmi;
      bmi = weight / (height * height);
      System.out.println("Your Body Mass Index (BMI) is: " + bmi);
   }
}
