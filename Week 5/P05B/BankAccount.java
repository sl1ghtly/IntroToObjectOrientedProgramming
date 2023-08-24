/* Practical P05B- BankAccount Class
Eryk Gloginski
24/02/2020
Program BankAccount Class .*/

public class BankAccount
{
   // instance variables
   private double balance;
   private long accountNumber;
   
   
   // methods
   public double getBalance()
   {
      return balance;
   }
   
   public void deposit(double amount)
   {
      balance = balance + amount;
   }
   
   public void withdraw(double amount)
   {
      if(amount > balance)
      {
         System.out.println("Amount Exceeds Balance. ");
      }
      else
      {
         balance = balance - amount;
      }
   }
   
   public void setAccountNumber(long number)
   {
      accountNumber = number;
   }
   
   public long getAccountNumber()
   {
      return accountNumber;
   }
}