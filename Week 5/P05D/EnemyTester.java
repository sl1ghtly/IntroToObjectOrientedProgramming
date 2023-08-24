/* Practical P05D- Question 1
Eryk Gloginski
25/02/2020
Program P05DQ1 .*/

public class EnemyTester
{
   public static void main(String [] args)
   {
      // instantiate an Enemy object called ghost
      Enemy ghost = new Enemy();
      
      // call get methods to see position
      System.out.print("Starting position: ");
      System.out.println(ghost.getXPosition()  + ", " + ghost.getYPosition());
    
      // call various move methods
      // each of these methods moves the enemy 10 spaces in the relevant direction
      ghost.moveLeft();
      ghost.moveRight();
      ghost.moveDown();
      ghost.moveRight();
      ghost.moveDown();
      ghost.moveUp();
      
      // call get methods to see position
      System.out.print("After Moving: ");
      System.out.println(ghost.getXPosition()  + ", " + ghost.getYPosition());
         
      // call moveToPoint method which moves the Enemy to a particular position
      ghost.moveToPoint(100, 125);
           
      // call get methods to see position
      System.out.print("Final position: ");
      System.out.println(ghost.getXPosition()  + ", " + ghost.getYPosition()); 

   }
}