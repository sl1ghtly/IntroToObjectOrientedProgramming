/* Practical P07C- Question 2
Eryk Gloginski
10/03/2021
Program CustomerTester Class .*/

public class CustomerTester
{
   public static void main(String [] args)
   {
      Customer myCustomer1 = new Customer(12345678, "Eryk Gloginski", 500);
      Customer myCustomer2 = new Customer(12345678, "Eryk Gloginski", 500);
      Customer myCustomer3 = new Customer(87654321, "Eryk Gloginski", 500);
      
      if(myCustomer1.equals(myCustomer2))
      {
         System.out.println("Cust1 Equals Cust2");
      }
      else
      {
         System.out.println("Cust2 Doesn't Equal Cust1");
      }
      
      System.out.println();
      
      System.out.println(myCustomer3.toString());
      
      
   }
}