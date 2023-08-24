/* Practical P08B- BankAccountTester Class
Eryk Gloginski
18/03/2021
Program BankAccountTester Class .*/

import java.util.Scanner;

public class BankAccountTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type BankAccount
	  	BankAccount[] accounts = new BankAccount[5];
      Scanner input = new Scanner(System.in);
      int choice, account;
      double amount;
      
      //load the array with BankAccount objects
      for(int i = 0; i < accounts.length; i++)
      {
         accounts[i] = new BankAccount(0);
      }
      
      do
      {
         System.out.println();
         System.out.println("1. View details of all accounts ");
         System.out.println("2. View details of one account ");
         System.out.println("3. Deposit ");
         System.out.println("4. Withdraw ");
         System.out.println("5. Quit ");
         System.out.println();
         System.out.println("Enter a number 1-5. ");
         choice = input.nextInt();
         
         switch(choice)
         {
            case 1:
               for(int i = 0; i < accounts.length; i++)
               {
                  System.out.println(accounts[i].toString());
               }
               break;
            case 2:
               System.out.println("Enter an account number (1 to " + accounts.length + ") ");
               account = input.nextInt();
               System.out.println(accounts[account - 1].toString());
               break;
            case 3:
               System.out.println("Enter an account number to deposit to (1 to " + accounts.length + "): ");
               account = input.nextInt();
               System.out.println("Enter an amount to deposit: ");
               amount = input.nextDouble();
               accounts[account - 1].deposit(amount);
               break;
            case 4:
               System.out.println("Enter an account number to withdraw from (1 to " + accounts.length + "): ");
               account = input.nextInt();
               System.out.println("Enter an amount to withdraw: ");
               amount = input.nextDouble();
               accounts[account - 1].withdraw(amount);
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