/* Practical P05C- Circle Class
Eryk Gloginski
25/02/2020
Program Circle Class .*/

import java.lang.Math;

public class Circle
{
   //instance variables
   private double area;
   
   
   //methods
   public double calcArea(double radius)
   {
      return area = Math.PI * radius * radius;
   }
   
   public double calcCircumference(double radius)
   {
      return Math.PI * 2 * radius;
   }
   
}