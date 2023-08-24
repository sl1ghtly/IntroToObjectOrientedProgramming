/* Practical P08A- Question 2
Eryk Gloginski
15/03/2021
Program PenDriveTester Class .*/

public class PenDriveTester
{
   public static void main(String [] args)
   {
      // instantiate an Enemy object called ghost
      PenDrive myPenDrive1 = new PenDrive("San Disk", 9.99);
      PenDrive myPenDrive2 = new PenDrive(32, "San Disk", 14.99);
      
      System.out.println(myPenDrive1.toString());
      System.out.println();
      System.out.println(myPenDrive2.toString());
   }
}