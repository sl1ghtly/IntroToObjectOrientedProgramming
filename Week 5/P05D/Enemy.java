/* Practical P05D- Enemy Class
Eryk Gloginski
25/02/2020
Program Enemy Class .*/

public class Enemy
{
   //instance variables
   private int xPosition;
   private int yPosition;
   
   //methods
   public int getXPosition()
   {
      return xPosition;
   }
   
   public int getYPosition()
   {
      return yPosition;
   }
   
   public void moveLeft()
   {
      xPosition = xPosition - 10;
   }
   
   public void moveRight()
   {
      xPosition = xPosition + 10;
   }
   
   public void moveUp()
   {
      yPosition = yPosition + 10;
   }
   
   public void moveDown()
   {
      yPosition = yPosition - 10;
   }
   
   public void moveToPoint(int xPos, int yPos)
   {
      xPosition = xPos;
      yPosition = yPos;
   }
     
}