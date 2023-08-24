/* Practical P05C- Question 2
Eryk Gloginski
25/02/2020
Program CurrencyConverter .*/

import java.util.Scanner;

public class CurrencyConverterTester
{
   public static void main(String[] args)
   {
      // create an instance of type Oblong
      Converter myConverter = new Converter();
      Scanner input = new Scanner(System.in);
      int choice;
      double sterlingExchange, sterling, euro, convertedEur, convertedStg;
      
      // use methods to retrieve values of instance variables
      System.out.println("Welcome to Eryk's Currency Exchange. ");
      do
      {
         System.out.println("Please choose 1 option. ");
         System.out.println();
         System.out.println("1. Set Exchange Rate. ");
         System.out.println("2. Exchange Euro to Sterling. ");
         System.out.println("3. Exchange Sterling to Euro. ");
         System.out.println("4. Get Exchange Rate. ");
         System.out.println("5. Exit Program. ");
         System.out.println();
         choice = input.nextInt();
         
         switch(choice)
         {
            
            // set currency exchange
            case 1:
               System.out.println("Enter today's exchange rate: ");
               System.out.println("1 Euro = ? Sterling: ");
               sterling = input.nextDouble();
               myConverter.setExchangeRate(sterling);
               System.out.println();
               break;
            // exchange euro to sterling
            case 2:
               System.out.println("Enter Euro Amount: ");
               euro = input.nextDouble();
               convertedStg = myConverter.toSterling(euro);
               System.out.println(euro + " in Euro is " + convertedStg + " in Sterling. ");
               break;
            // exchange sterling to euro
            case 3:
               System.out.println("Enter Sterling Amount: ");
               sterling = input.nextDouble();
               convertedEur = myConverter.toEuro(sterling);
               System.out.println(sterling + " in Sterling is " + convertedEur + " in Euro. ");
               break;
            // get exchange rate
            case 4:
               System.out.println("Today's exchange rate is: " + myConverter.getExchangeRate());
               System.out.println();
               break;
            // exit program
            case 5:
               System.out.println("Exiting Exchange Program.");
               System.out.println();
               break;
            // invalid option or something
            default:
               System.out.println("Invalid Option.");
               System.out.println();
         }
      } while(choice != 5);
   }
}