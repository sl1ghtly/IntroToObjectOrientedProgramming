public class BankAccount

{
private int accountNo;
private double balance;
private static int nextAccNo = 1001;
 
//constructor
public BankAccount()
{
   accountNo = nextAccNo++;
   balance = 0;
}

public int getAccountNo()
{
   return accountNo;
}

}