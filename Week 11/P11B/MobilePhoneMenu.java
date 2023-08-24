/* Practical P11B- MobilePhoneMenu Class
Eryk Gloginski
21/04/2021
Program MobilePhoneMenu Class .*/

import java.util.Scanner;

public class MobilePhoneMenu
{
   public static void main(String [] args)
   {
      MobilePhone phone = new MobilePhone();
      Scanner input = new Scanner(System.in);
      int option;
      
      do
      {
         System.out.println("Mobile Phone Menu ");
			System.out.println("1. Make a call");
         System.out.println("2. Send a text");
         System.out.println("3. Top up");
         System.out.println("4. Check balance");
         System.out.println("5. Check cost of text");
         System.out.println("6. Check cost of call");
         System.out.println("0. Quit");
         
         System.out.println("Enter your option: "); 
			option = input.nextInt();
			System.out.println();
         
         switch (option)
         {
            case 1:
               phone.makeCall();
               break;
            case 2:
               phone.sendText();
               break;
            case 3:
               System.out.println("Enter an amount to top up by: "); 
               double amount = input.nextInt();
               phone.topUp(amount);
               break;
            case 4:
               System.out.println("Balance: " + phone.getBalance());
               break;
            case 5:
               System.out.println("Text Cost: " + phone.getTextCost());
               break;
            case 6:
               System.out.println("Call Cost: " + phone.getCallCost());
               break;
            case 0:
               System.out.println("Quitting the Application! ");
               break;
            default:
               System.out.println("Invalid Option! ");
         }
      
      } while (option != 0);
      
   }
}