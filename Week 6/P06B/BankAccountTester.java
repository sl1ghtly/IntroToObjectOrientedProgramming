/* Practical P06B- BankAccountTester Class
Eryk Gloginski
03/03/2021
Program BankAccountTester Class .*/

public class BankAccountTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type BankAccount
	   BankAccount myAccount = new BankAccount(12345678);
      BankAccount myAccount2 = new BankAccount(87654321, 100);
	   	
		System.out.println("Account Number: " + myAccount.getNumber());
		System.out.println("Initial Balance: " + myAccount.getBalance());
		myAccount.deposit(100);   
		System.out.println("After calling deposit(100) balance is:  " + myAccount.getBalance());
		myAccount.withdraw(15);   
		System.out.println("After calling withdraw(15) balance is:  " + myAccount.getBalance());
      System.out.println();

		System.out.println("Account Number: " + myAccount2.getNumber());
      System.out.println("Initial Balance: " + myAccount2.getBalance());
		myAccount2.deposit(100);   
		System.out.println("After calling deposit(100) balance is:  " + myAccount2.getBalance());
		myAccount2.withdraw(15);   
		System.out.println("After calling withdraw(15) balance is:  " + myAccount2.getBalance());

   }
}