/* Practical P05A- Question 3
Eryk Gloginski
23/02/2020
Program P05AQ3 .*/

public class P05AQ3
{
   public static void main(String[] args)
   {
      // create an instance of type Oblong
      Oblong myOblong1 = new Oblong();
      Oblong myOblong2 = new Oblong();

      // use methods to set instance variables
      myOblong1.setHeight(5);
      myOblong1.setWidth(7);
      
      myOblong2.setHeight(10);
      myOblong2.setWidth(14);
      
      // calculate oblong area and put it in a variable
      double area1 = myOblong1.calculateArea();
      double area2 = myOblong2.calculateArea();
      
      System.out.println("The largest area is the Oblong with: ");
      if(area1 > area2)
      {
         System.out.println("Width " + myOblong1.getWidth() + " and Height " + myOblong1.getHeight());
      }
      else
      {
         System.out.println("Width " + myOblong2.getWidth() + " and Height " + myOblong2.getHeight());
      }
   }
}