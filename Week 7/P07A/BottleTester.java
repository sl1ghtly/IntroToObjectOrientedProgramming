/* Practical P07A- Question 2
Eryk Gloginski
08/03/2021
Program P07AQ2 .*/

public class BottleTester
{
   public static void main(String [] args)
   {
      Bottle myBottle1 = new Bottle();
      Bottle myBottle2 = new Bottle(1);
      Bottle myBottle3 = new Bottle(1);
      Bottle myBottle4 = new Bottle(2);
      
      myBottle1.fillBottle();
      System.out.println("Bottle 1 Amount in L: " + myBottle1.getAmountIn());
      myBottle1.pourBottle(1);
      System.out.println("Bottle 1 Amount in L: " + myBottle1.getAmountIn());
      System.out.println();
      
      myBottle2.fillBottle(1);
      System.out.println("Bottle 2 Amount in L: " + myBottle2.getAmountIn());
      myBottle2.pourBottle(1);
      System.out.println("Bottle 2 Amount in L: " + myBottle2.getAmountIn());
      System.out.println();
      
      myBottle3.fillBottle(1);
      System.out.println("Bottle 3 Amount in L: " + myBottle3.getAmountIn());
      myBottle3.emptyBottle();
      System.out.println("Bottle 3 Amount in L: " + myBottle3.getAmountIn());
      System.out.println();
      
      myBottle4.fillBottle(2);
      System.out.println("Bottle 4 Amount in L: " + myBottle4.getAmountIn());
      myBottle4.pourBottle(1);
      System.out.println("Bottle 4 Amount in L: " + myBottle4.getAmountIn());
      System.out.println("Bottle 4 Needed Amount in L: " + myBottle4.getAmountNeeded());
      
   }
}