/* Practical P07B- BankAccountTester Class
Eryk Gloginski
09/03/2021
Program BankAccountTester Class .*/

public class BankAccountTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type BankAccount
	  	BankAccount myAccount = new BankAccount(145);
	   BankAccount mySav = new BankAccount(456, 1000);

	   System.out.println("My account no " +myAccount.getAccNumber());
		System.out.println("My account Initial Balance " +myAccount.getBalance());		
		 	

		System.out.println("My saving no " +mySav.getAccNumber());
		System.out.println("my saving Initial Balance " +mySav.getBalance());
      
      System.out.println(myAccount.toString());
      System.out.println(mySav.toString());
      
      if(myAccount.equals(mySav))
      {
         System.out.println("Equal");
      }
      else
      {
         System.out.println("Not Equal");
      }
   }
}