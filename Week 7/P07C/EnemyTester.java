/* Practical P07C- Question 1
Eryk Gloginski
10/03/2021
Program EnemyTester Class .*/

public class EnemyTester
{
   public static void main(String [] args)
   {
      // instantiate an Enemy object called ghost
      Enemy ghost = new Enemy();

      // call get methods to see position
      System.out.println(ghost.toString());

      // call various move methods
      ghost.moveLeft();
      ghost.moveLeft(25);
      ghost.moveUp();
      ghost.moveUp(25);
      System.out.println(ghost.toString());
      
      ghost.moveToPoint(125, 125);
      System.out.println(ghost.toString());
      
      ghost.moveLeft();
      ghost.moveLeft(25);
      ghost.moveDown();
      ghost.moveDown(25);
      System.out.println(ghost.toString());
      
   }
}