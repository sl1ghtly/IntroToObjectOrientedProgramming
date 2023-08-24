/* Practical P07C- Enemy Class
Eryk Gloginski
10/03/2021
Program Enemy Class .*/

public class Enemy
{
   //instance variables
   private int xPosition;
   private int yPosition;
   
   //methods
   
   
   public String toString()
   {
      String str = new String();
      str = str + "Position X: " + xPosition + " | Position Y: ";
      str = str + yPosition;
      return str;
   }
   
   
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
   
   public void moveLeft(int moveX)
   {
      xPosition = xPosition - moveX;
   }
   
   public void moveRight()
   {
      xPosition = xPosition + 10;
   }
   
   public void moveRight(int moveX)
   {
      xPosition = xPosition + moveX;
   }
   
   public void moveUp()
   {
      yPosition = yPosition + 10;
   }
   
   public void moveUp(int moveY)
   {
      yPosition = yPosition + moveY;
   }
   
   public void moveDown()
   {
      yPosition = yPosition - 10;
   }
   
   public void moveDown(int moveY)
   {
      yPosition = yPosition - moveY;
   }
   
   public void moveToPoint(int xPos, int yPos)
   {
      xPosition = xPos;
      yPosition = yPos;
   }
     
}