/* Practical P06B- PrintQuotaProgram Class
Eryk Gloginski
03/03/2021
Program PrintQuotaProgram Class .*/

import java.util.Scanner;

public class PrintQuotaProgram
{
   public static void main(String [] args)
   {  
	   // create an instance of type Oblong
	   PrintQuota myPrint1 = new PrintQuota();
      Scanner input = new Scanner(System.in);
      int choice, amount, pages;
	   
	   do
      {
         System.out.println("Menu");
         System.out.println("1. View Pages"); // in euro and pages
         System.out.println("2. Top Up");
         System.out.println("3. Print Pages");
         System.out.println("4. Quit");
         System.out.println();
         System.out.println("Enter a choice Number: ");
         choice = input.nextInt();
         
         switch(choice)
         {
            case 1:
               System.out.println("You have " + (int) myPrint1.getPages() + " pages left.");
               System.out.println("You have " + myPrint1.getBalance() + " Euro left.");
               break;
            case 2:
               System.out.println("Enter an amount to input in Euro: ");
               amount = input.nextInt();
               myPrint1.topUp(amount);
               break;
            case 3:
               System.out.println("Enter amount of pages to print. ");
               pages = input.nextInt();
               myPrint1.printPages(pages);
               break;
            case 4:
               System.out.println("Exiting the Application.");
               break;
               
         }
         
      }while(choice != 4);
   }
}