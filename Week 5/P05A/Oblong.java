/* Practical P05A- Oblong Class
Eryk Gloginski
23/02/2020
Program Oblong Class .*/

import static java.lang.Math.sqrt;

public class Oblong
{
   // instance variables
   private double height;
   private double width;
   private double diagonal;
   
   // methods
   public double getHeight()
   {
      return height;
   }
   
   public double getWidth()
   {
      return width;
   }
   
   public void setWidth(double widthIn)
   {
      width = widthIn;
   }
   
   public void setHeight(double heightIn)
   {
      height = heightIn;
   }
   
   public double calculateArea()
   {
      return width * height;
   } 
   
   public double calculatePerimeter()
   {
      return (width * 2) + (height * 2);
   }
   
   public boolean isSquare()
   {
      if(width == height)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public void addWidth(double widthIn)
   {
      width = width + widthIn;
   }
   
   public void addHeight(double heightIn)
   {
      height = height + heightIn;
   }
   
   public double getDiagonal(double widthIn, double heightIn)
   {
      return diagonal = Math.sqrt(((widthIn * widthIn) + (heightIn * heightIn)));
   }
}