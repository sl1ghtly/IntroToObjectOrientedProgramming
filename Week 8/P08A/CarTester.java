/* Practical P08A- Question 4
Eryk Gloginski
15/03/2021
Program CarTester Class .*/

import java.util.Scanner;

public class CarTester
{
   public static void main(String [] args)
   {
      Car myCar = new Car(20, 1);
      Scanner input = new Scanner(System.in);
      int choice, account;
      double amount;
      
	   do
      {
         System.out.println();
         System.out.println("1. Display Fuel Level ");
         System.out.println("2. Add Fuel ");
         System.out.println("3. Fill the tank ");
         System.out.println("4. Drive ");
         System.out.println("5. Quit ");
         System.out.println();
         System.out.println("Enter a number 1-5. ");
         choice = input.nextInt();
         
         switch(choice)
         {
            case 1:
               System.out.println("Current Fuel in Car: " + myCar.getFuelLevel());
               break;
            case 2:
               System.out.println("Enter a fuel amount to add: ");
               amount = input.nextDouble();
               myCar.addFuel(amount);
               break;
            case 3:
               myCar.fillUp();
               break;
            case 4:
               myCar.drive();
               break;
            case 5:
               System.out.println("Quitting Program. ");
               break;
            default:
               System.out.println("Invalid Option. ");
         }
         
      }while(choice != 5); 
   }
}