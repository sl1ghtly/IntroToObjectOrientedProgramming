/* Practical P05C- Question 1
Eryk Gloginski
25/02/2020
Program P05CQ1 .*/

public class P05CQ1
{
   public static void main(String[] args)
   {
      // create an instance of type Oblong
      Circle myCircle = new Circle();
      
      // use methods to retrieve values of instance variables
      System.out.println("Area: " + myCircle.calcArea(10));
      System.out.println("Circumference: " + myCircle.calcCircumference(10));
   }
}