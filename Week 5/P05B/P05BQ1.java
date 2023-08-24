/* Practical P05B- Question 1
Eryk Gloginski
24/02/2020
Program P05BQ1 .*/

public class P05BQ1
{
   public static void main(String[] args)
   {
      // create an instance of type Oblong
      BankAccount myAcc = new BankAccount();

      // use methods to retrieve values of instance variables
      myAcc.deposit(250.00);
      System.out.println("Balance: " + myAcc.getBalance());
      
      myAcc.withdraw(50.00);
      System.out.println("Balance: " + myAcc.getBalance());
   }
}