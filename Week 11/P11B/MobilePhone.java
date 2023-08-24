/* Practical P11B- MobilePhone Class
Eryk Gloginski
21/04/2021
Program MobilePhone Class .*/

public class MobilePhone
{
   // instance variables
   private double balance;
   private double callCost;
   private double textCost;
   
   // constructors
   public MobilePhone()
   {
      balance = 0;
      callCost = 0.20;
      textCost = 0.10;
   }
   
   public MobilePhone(double balanceIn)
   {
      balance = balanceIn;
      callCost = 0.20;
      textCost = 0.10;
   }
   
   public MobilePhone(double callCostIn, double textCostIn)
   {
      balance = 0;
      callCost = callCostIn;
      textCost = textCostIn;
   }
   
   public MobilePhone(double balanceIn, double callCostIn, double textCostIn)
   {
      balance = balanceIn;
      callCost = callCostIn;
      textCost = textCostIn;
   }
   
   // topping up method
   public void topUp(double amountIn)
   {
      balance = balance + amountIn;
   }
   
   // make a call method
   public void makeCall()
   {
      if (balance >= callCost) // check if enough balance
         {
            balance = balance - callCost;
            System.out.println("Successfully made a call! ");
         }
      else
         System.out.println("Not enough Balance to make a call! ");
   }
   
   // send a text method
   public void sendText()
   {
      if (balance >= textCost) // check if enough balance
         {
            balance = balance - textCost;
            System.out.println("Successfully sent a text! ");
         }
      else
         System.out.println("Not enough Balance to send a text! ");
   }
   
   // basic get balance method
   public double getBalance()
   {
      return balance;
   }
   
   // basic get call cost method
   public double getCallCost()
   {
      return callCost;
   }
   
   // basic get text cost method
   public double getTextCost()
   {
      return textCost;
   }
   
   // to string method
   public String toString()
   {
      String str = new String();
      str = str + "Balance: " + balance + ", Cost Per Call: " + callCost + ", Cost Per Text: " + textCost;
      return str;
   }
   
   // equals method
   public boolean equals(MobilePhone anotherMobilePhone)
   {
      return (balance == anotherMobilePhone.balance
      && callCost == anotherMobilePhone.callCost
      && textCost == anotherMobilePhone.textCost);
   }
}