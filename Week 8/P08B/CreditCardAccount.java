/* Practical P08B- CreditCardAccount Class
Eryk Gloginski
18/03/2021
Program CreditCardAccount Class .*/

public class CreditCardAccount
{
	//instance variables
   private int accNumber;
   private static int nextAccNo = 1;
   private String customerName;
	private double balance;
   private double creditLimit = 500;
	
	public CreditCardAccount(String nameIn)
	{
		accNumber = nextAccNo++;
		balance = 0.0; 
      customerName = nameIn;
	}
   
	//methods
	public void makePurchase(double amount)
	{
		if(amount <= creditLimit)
      {
			balance = balance + amount;
	   }
      else
      {
         System.out.println("Credit limit passed by " + (amount - creditLimit));
      }
   }
   
   public void makePayment(double amount)
	{
		if(amount >= balance)
	   {
         balance = balance - amount;
      }
	}
   
   public void setCreditLimit(double amount)
   {
      creditLimit = amount;
   }

	public int getAccountNumber()
	{
		return accNumber;	
	}
   
   public double getBalance()
	{
		return balance;	
	}
   
}//end class