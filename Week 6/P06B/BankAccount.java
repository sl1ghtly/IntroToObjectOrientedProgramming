/* Practical P06B- BankAccount Class
Eryk Gloginski
03/03/2021
Program BankAccount Class .*/

public class BankAccount
{
	//instance variables
	private double balance;
   	private int accountNumber;
	
   //constructors
  	public BankAccount(int number, double amount)
   {
      balance = amount;
	   accountNumber = number;
   }
   
   public BankAccount(int number)
   {
   	balance = 0;
	   accountNumber = number;
   }
   
	//methods
	public double getBalance()
	{
		return balance;
	}
	
	public void withdraw(double amount)
	{
	   if(amount <= balance)
		{
         balance = balance - amount;
      }
	}
   
	public void deposit(double amount)
	{
		balance = balance + amount;	
	}

	public int getNumber()
	{
		return accountNumber;
	}
	
	

}//end class