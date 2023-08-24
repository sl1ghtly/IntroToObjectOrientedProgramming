/* Practical P05B- Question 4
Eryk Gloginski
24/02/2020
Program BankAccountTester .*/

import java.util.Scanner;

public class BankAccountTester
{
   public static void main(String[] args)
   {
      // create an instance of type Bank Account
      BankAccount myAcc = new BankAccount();
      Scanner input = new Scanner(System.in);
      int choice;
      long number;
      double amount;

      // use methods to retrieve values of instance variables
      do
      {
         System.out.println("*****LyIT Bank****");
         System.out.println();
         System.out.println("1. Deposit ");
         System.out.println("2. Withdraw ");
         System.out.println("3. Get balance ");
         System.out.println("4. Set Bank Account Number ");
         System.out.println("5. Get Account Number ");
         System.out.println("6. Quit ");
         System.out.println();
         System.out.println("Please select option: ");
         choice = input.nextInt();
         
         switch(choice)
         {
            case 1:
               System.out.println("Choose an amount to Deposit: ");
               amount = input.nextDouble();
               myAcc.deposit(amount);
               break;
            case 2:
               System.out.println("Choose an amount to Withdraw: ");
               amount = input.nextDouble();
               myAcc.withdraw(amount);
               break;
            case 3:
               System.out.println("Your current balance is: " + myAcc.getBalance());
               break;
            case 4:
               System.out.println("Set your Bank Account Number: ");
               number = input.nextLong();
               myAcc.setAccountNumber(number);
               break;
            case 5:
               System.out.println("Your Bank Account Number is: " + myAcc.getAccountNumber());
               break;
            case 6:
               System.out.println("Quitting the program.");
               break;
            default:
               System.out.println("Invalid Option.");
         }
         System.out.println();
            
      } while(choice != 6);
   }
}