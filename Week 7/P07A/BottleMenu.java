/* Practical P07A- Question 2
Eryk Gloginski
05/03/2021
Program P07AQ2 .*/

import java.util.Scanner;

public class BottleMenu
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      Bottle myBottle1 = new Bottle();
      int choice;
      double amount;
      //myBottle1.fillBottle();
      
      do
      {
         System.out.println("Bottle Menu ");
         System.out.println("1. Fill bottle completely ");
         System.out.println("2. Fill bottle by a certain amount ");
         System.out.println("3. Check amount of water in bottle ");
         System.out.println("4. Check amount of water needed to fill bottle ");
         System.out.println("5. Empty bottle ");
         System.out.println("6. Pour an amount from bottle ");
         System.out.println("7. Quit ");
         System.out.println("Please select your option: ");
         choice = input.nextInt();
         
         switch(choice)
         {
            case 1:
               myBottle1.fillBottle();
               System.out.println("Completely filled bottle. ");
               break;
            case 2:
               System.out.println("Enter amount to fill. ");
               amount = input.nextDouble();
               myBottle1.fillBottle(amount);
               break;
            case 3:
               System.out.println("Amount inside of the bottle: " + myBottle1.getAmountIn());
               break;
            case 4:
               System.out.println("Amount needed to fill the bottle: " + myBottle1.getAmountNeeded());
               break;
            case 5:
               myBottle1.emptyBottle();
               System.out.println("Completely emptied bottle. ");
               break;
            case 6:
               System.out.println("Enter amount to pour. ");
               amount = input.nextDouble();
               myBottle1.pourBottle(amount);
               break;
            case 7:
               System.out.println("Exiting Program! ");
               break;
            default:
               System.out.println("Invalid Option! ");
         }
      }while(choice != 7);
   }
}