/* Practical P07C- Customer Class
Eryk Gloginski
10/03/2021
Program Customer Class .*/

public class Customer
{
   //instance variables
   private int customerNumber;
   private String customerName;
   private double creditLimit;
   
   public Customer(int numIn, String nameIn, double limitIn)
   {
      customerNumber = numIn;
      customerName = nameIn;
      creditLimit = limitIn;
   }
   
   //methods
   
   public String toString()
   {
      String str = new String();
      str = str + "Customer number: " + customerNumber;
      str = str + "\nCustomer name: " + customerName;
      str = str + "\nCreditlimit: " + creditLimit;
      return str;
   }
   
   public boolean equals(Customer anotherCustomer)
   {
      return(customerNumber == anotherCustomer.customerNumber
      && customerName == anotherCustomer.customerName
      && creditLimit == anotherCustomer.creditLimit);
   }

   public int getCustNumber()
   {
      return customerNumber;
   }
   
   public String getCustName()
   {
      return customerName;
   }
   
   public double getCustLimit()
   {
      return creditLimit;
   }
}