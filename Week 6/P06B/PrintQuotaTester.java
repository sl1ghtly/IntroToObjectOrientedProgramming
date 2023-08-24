/* Practical P06B- PrintQuotaTester Class
Eryk Gloginski
03/03/2021
Program PrintQuotaTester Class .*/

public class PrintQuotaTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type PrintQuota
	   PrintQuota myPrint1 = new PrintQuota();
      PrintQuota myPrint2 = new PrintQuota(0.06);
      PrintQuota myPrint3 = new PrintQuota(7, 0.07);
      PrintQuota myPrint4 = new PrintQuota();
	   
      char color = 'c';
      
	   // use methods to set instance variables
	   System.out.println("Printer 1 Balance: " + myPrint1.getBalance());
      myPrint1.topUp(5);
      System.out.println("Printer 1 Balance after Top Up: " + myPrint1.getBalance());
      myPrint1.printPages(10);
      System.out.println("Printer 1 Balance after Printing 10 pages: " + myPrint1.getBalance());
      System.out.println("You can still print: " + (int) myPrint1.getPages() + " pages. ");
      
      System.out.println();
      
	   System.out.println("Printer 2 Balance: " + myPrint2.getBalance());
      myPrint2.topUp(6);
      System.out.println("Printer 2 Balance after Top Up: " + myPrint2.getBalance());
      myPrint2.printPages(10);
      System.out.println("Printer 2 Balance after Printing 10 pages: " + myPrint2.getBalance());
      System.out.println("You can still print: " + (int) myPrint2.getPages() + " pages. ");
      
      System.out.println();
      
	   System.out.println("Printer 3 Balance: " + myPrint3.getBalance());
      myPrint3.topUp(7);
      System.out.println("Printer 3 Balance after Top Up: " + myPrint3.getBalance());
      myPrint3.printPages(10);
      System.out.println("Printer 3 Balance after Printing 10 pages: " + myPrint3.getBalance());
      System.out.println("You can still print: " + (int) myPrint3.getPages() + " pages. ");
      
      System.out.println();
      
      System.out.println("Printer 4 Balance: " + myPrint4.getBalance());
      myPrint4.setColor(color);
      myPrint4.topUp(12);
      System.out.println("Printer 4 Balance after Top Up: " + myPrint4.getBalance());
      myPrint4.printPages(10);
      System.out.println("Printer 4 Balance after Printing 10 pages: " + myPrint4.getBalance());
      System.out.println("You can still print: " + (int) myPrint4.getPages() + " pages. ");
   }
}