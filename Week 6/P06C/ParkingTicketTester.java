/* Practical P06C- Question 2
Eryk Gloginski
05/03/2021
Program P06CQ2 .*/

public class ParkingTicketTester
{
   public static void main(String [] args)
   {
      // vars
      ParkingTicketDispenser myDispenser = new ParkingTicketDispenser();
      
      myDispenser.buyTicket(0.40);
      myDispenser.buyTicket(0.50);
      myDispenser.addTickets(50);
      myDispenser.buyTicket(0.40);
      myDispenser.buyTicket(0.50);
      
      System.out.println("Tickets left: " + myDispenser.getTickets());
      System.out.println("Money inside: " + myDispenser.getMoney());
      System.out.println("Coins inside: " + myDispenser.getCoins());
      
      System.out.println();
      
      myDispenser.takeOutCoins();
      
   }   
}