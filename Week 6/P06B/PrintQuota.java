/* Practical P06B- PrintQuota Class
Eryk Gloginski
03/03/2021
Program PrintQuota Class .*/

public class PrintQuota
{
	//instance variables
   private double balance;
   private double pagesAmount;
   private double costPerPage;
   private String pageColor;
   
   // constructors
   public PrintQuota()
   {
      balance = 0;
      costPerPage = 0.05;
   }
   
   public PrintQuota(double cost)
   {
      balance = 0;
      costPerPage = cost;
   }
   
   public PrintQuota(double bal, double cost)
   {
      balance = bal;
      costPerPage = cost;
   }
   
   // methods
   public void printPages(int amountPages)
   {
      if(balance >= 0.05)
      {
         for(int i = amountPages; i > 0; i--)
         {
            balance = balance - costPerPage;
         }
      }
   }

   public void topUp(double amountMoney)
   {
       balance = balance + amountMoney;
   }

   public double getBalance()
   {
       return balance;
   }
   
   public double getPages()
   {
      if(balance == 0)
      {
         pagesAmount = 0;
      }
      else
      {
         pagesAmount = balance / costPerPage;
      }
      
      return pagesAmount;
   }
   
   public void setColor(char color)
   {
      switch(color)
      {
         case 'b':
         case 'B':
            pageColor = "Black";
            break;
         case 'w':
         case 'W':
            pageColor = "White";
            break;
         case 'c':
         case 'C':
            pageColor = "Color";
            costPerPage = costPerPage + 0.12;
            break;
         default:
            pageColor = "White";
      }
   }
}//end class