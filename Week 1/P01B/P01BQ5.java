/* Practical P01B- Question 5
Eryk Gloginski
27/01/2020
Program P01BQ5 .*/

import java.util.Scanner;

public class P01BQ5
{
   public static void main(String[] args)
   {
      // construct scanner
      Scanner input = new Scanner(System.in);
      // declare/take in variables
      int verseNumber;
      System.out.println("Enter the verse number: ");
      verseNumber = input.nextInt();
      
      displayVerse(verseNumber);
   } //end main method

   public static void displayVerse(int verse)
   {
      switch(verse)
      {
         case 1:
            System.out.println("The wheels on the bus go round and round");
            System.out.println("Round and round, round and round");
            System.out.println("The wheels on the bus go round and round");
            System.out.println("All through the town");
            break;
         case 2:
            System.out.println("The wipers on the bus go Swish, swish, swish,");
            System.out.println("Swish, swish, swish, swish, swish, swish");
            System.out.println("The wipers on the bus go Swish, swish, swish");
            System.out.println("All through the town.");
            break;
         case 3:
            System.out.println("The people on the bus go, chat, chat, chat,");
            System.out.println("cha,chat chat,chat chat ,chat");
            System.out.println("The people on the bus go, chat,chat,chat");
            System.out.println("All through the town.");
            break;
         case 4:
            System.out.println("The horn on the bus go Beep, beep, beep");
            System.out.println("Beep, beep, beep, beep, beep, beep");
            System.out.println("The horn on the bus go Beep, beep, beep");
            System.out.println("All through the town.");
            break;
         case 5:
            System.out.println("The baby on the bus go, wah, wah, wah!");
            System.out.println("wah, wah, wah, wah, wah, wah!");
            System.out.println("The baby on the bus go, “wah, wah, wah!");
            System.out.println("All through the town.");
            break;
         case 6:
            System.out.println("The mummy on the bus go, ssss sh,ssss sh,ssss sh,");
            System.out.println("ssss sh,ssss sh,ssss sh");
            System.out.println("The mummy on the bus go, ssss sh,ssss sh,ssss sh");
            System.out.println("All through the town.");
            break;
         default:
            System.out.println("Invalid Verse");
      }
   }
}
