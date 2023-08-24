/* Practical P10A- Mortgage Class
Eryk Gloginski
13/04/2021
Program Mortgage Class .*/

public class Mortgage
{
   //instance variables
   private int accountNumber;
   private String customerName;
   private double balance;
   private int term;
   private static int nextAccountNumber = 1;
   
   public Mortgage(String nameIn, double balanceIn, int termIn)
   {
      accountNumber = 1000 + nextAccountNumber++;
      customerName = nameIn;
      balance = balanceIn;
      term = termIn;
   }
   
   public int getAccountNumber()
   {
      return accountNumber;
   }
   public double getBalance()
   {
      return balance;
   }
   public int getTerm()
   {
      return term;
   }
   public void makePayment(double amountIn)
   {
      if (balance > 0 && amountIn <= balance)
         balance = balance - amountIn;
   }
   
   public String toString()
   {
      String str = new String();
      str = str + "Account Number: " + accountNumber + ", ";
      str = str + "Customer Name: " + customerName + ", ";
      str = str + "Term: " + term + ", ";
      str = str + "Balance: " + balance;
      return str;
   }
   
   
}
