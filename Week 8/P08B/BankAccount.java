/* Practical P08B- BankAccount Class
Eryk Gloginski
18/03/2021
Program BankAccount Class .*/

public class BankAccount
{
	//instance variables
	private double balance;
	private int accNumber;
   private static int nextAccNo = 1;
	
	public BankAccount()
	{
		accNumber = nextAccNo++;
		balance = 0.0; 
	}

	public BankAccount(double openBal)
	{
		accNumber = nextAccNo++;
		balance = openBal; 
	}
	//methods


   public String toString()
   {
      String str = new String();
      str = str + "Account Number: " + accNumber + "\nAccount Balance: ";
      str = str + balance;
      return str;
   }
   
   public boolean equals(BankAccount anotherBankAccount)
   {
      return(accNumber == anotherBankAccount.accNumber
      && balance == anotherBankAccount.balance);
   }
   

	//return the balance
	public double getBalance()
	{
		return balance;
	}
	
	//reduce the balance by amount
	public void withdraw(double amount)
	{
		if(amount <= balance) //if enough money
			balance = balance - amount; //balance -=amount
	}
   
	//increase the balance by amount
	public void deposit(double amount)
	{
		balance = balance + amount;	
	}
	
	public int getAccNumber()
	{
		return accNumber;	
	}
}//end class