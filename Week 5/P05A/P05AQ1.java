/* Practical P05A- Question 1
Eryk Gloginski
23/02/2020
Program P05AQ1 .*/

public class P05AQ1
{
   public static void main(String[] args)
   {
      // create an instance of type Oblong
      Oblong myOblong = new Oblong();

      // use methods to set instance variables
      myOblong.setHeight(10);
      myOblong.setWidth(25);

      // use methods to retrieve values of instance variables
      System.out.println("Width: " + myOblong.getWidth());
      System.out.println("Height: " + myOblong.getHeight());
   }
}