/* Practical P08B- CreditCardAccountTester Class
Eryk Gloginski
18/03/2021
Program CreditCardAccountTester Class .*/

import java.util.Scanner;

public class CreditCardAccountTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type BankAccount
	  	CreditCardAccount myCreditCard = new CreditCardAccount("Eryk Gloginski");
      Scanner input = new Scanner(System.in);
      int choice, account;
      double amount;
      
      do
      {
         System.out.println();
         System.out.println("1. Make Purchase ");
         System.out.println("2. Make Payment (on balanceDue) ");
         System.out.println("3. View Balance Due ");
         System.out.println("4. View account details ");
         System.out.println("5. Exit System ");
         System.out.println();
         System.out.println("Enter a number 1-5. ");
         choice = input.nextInt();
         
         switch(choice)
         {
            case 1:
               System.out.println("Enter the amount to purchase something for: ");
               amount = input.nextDouble();
               myCreditCard.makePurchase(amount);
               break;
            case 2:
               System.out.println("Enter the credit you would like pay back: ");
               amount = input.nextDouble();
               myCreditCard.makePayment(amount);
               break;
            case 3:
               System.out.println("Balance due: Euro " + myCreditCard.getBalance());
               break;
            case 4:
               System.out.println("Account Number: " + myCreditCard.getAccountNumber());
               System.out.println("Balance due: Euro " + myCreditCard.getBalance());
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