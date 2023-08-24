/* Practical P01C- Question 1
Eryk Gloginski
28/01/2020
Program P01CQ1 .*/

import java.util.Scanner;

public class P01CQ1
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
            System.out.println("If you're happy and you know it");
            System.out.println("Clap your hands");
            System.out.println("If you're happy and you know it");
            System.out.println("Clap your hands");
            System.out.println("If you're happy and you know it");
            System.out.println("Then your face will surely show it");
            System.out.println("If you're happy and you know it");
            System.out.println("Clap your hands");
            break;
         case 2:
            System.out.println("If you're happy and you know it");
            System.out.println("Stomp your feet");
            System.out.println("If you're happy and you know it");
            System.out.println("Stomp your feet");
            System.out.println("If you're happy and you know it");
            System.out.println("Then your face will surely show it");
            System.out.println("If you're happy and you know it");
            System.out.println("Stomp your feet");
            break;
         case 3:
            System.out.println("If you're happy and you know it");
            System.out.println("Shout hooray");
            System.out.println("If you're happy and you know it");
            System.out.println("Shout hooray");
            System.out.println("If you're happy and you know it");
            System.out.println("Then your face will surely show it");
            System.out.println("If you're happy and you know it");
            System.out.println("Shout hooray");
            break;
         case 4:
            System.out.println("If you're happy and you know it");
            System.out.println("Do all three");
            System.out.println("If you're happy and you know it");
            System.out.println("Do all three");
            System.out.println("If you're happy and you know it");
            System.out.println("Then your face will surely show it");
            System.out.println("If you're happy and you know it");
            System.out.println("Do all three");
            break;
         default:
            System.out.println("Invalid Verse");
      }
   }
}
