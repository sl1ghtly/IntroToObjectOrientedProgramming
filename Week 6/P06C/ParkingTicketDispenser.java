/* Practical P06C- ParkingTicketDispenser Class
Eryk Gloginski
05/03/2021
Program ParkingTicketDispenser Class .*/

public class ParkingTicketDispenser
{
   //instance variables
   private int tickets;
   public static double money;
   private double coins;
   private double ticketsCount = 0;
   
   public void addTickets(int ticketAmount)
   {
      tickets = ticketAmount;
   }
   
   public void buyTicket(double money)
   {
      if(money >= 0.50 && tickets > 0)
      {
         tickets--;
         ticketsCount++;
         money = money + 0.50;
         System.out.println("Successfully purchased a ticket. ");
      }
      else if(tickets == 0 && money < 0.50)
      {
         System.out.println("Not enough money to purchase a ticket and not enough tickets in ticket dispenser. ");
      }
      else if(tickets == 0)
      {
         System.out.println("Not enough tickets in ticket dispenser. ");
      }
      else if(money < 0.50)
      {
         System.out.println("Not enough money to purchase a ticket. ");
      }
   }
   
   public int getTickets()
   {
      return tickets;
   }
   
   public double getMoney()
   {
      return money;
   }
   
   public double getCoins()
   {
      coins = money / ticketsCount;
      return coins;
   }
   
   public void takeOutCoins()
   {
      System.out.println("Coins taken out: " + coins);
      coins = 0;
      System.out.println("Amount in money taken out: " + money);
      money = 0;
      ticketsCount = 0;
   }
}