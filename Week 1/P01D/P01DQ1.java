/* Practical P01D- Question 1
Eryk Gloginski
28/01/2020
Program P01DQ1 .*/

import java.util.Scanner;

public class P01DQ1
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
            System.out.println("Baby shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Baby shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Baby shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Baby shark");
            break;
         case 2:
            System.out.println("Mommy shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Mommy shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Mommy shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Mommy shark");
            break;
         case 3:
            System.out.println("Daddy shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Daddy shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Daddy shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Daddy shark");
            break;
         case 4:
            System.out.println("Grandma shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Grandma shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Grandma shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Grandma shark");
            break;
            case 5:
            System.out.println("Grandpa shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Grandpa shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Grandpa shark, doo, doo, doo, doo, doo, doo");
            System.out.println("Grandpa shark");
            break;
            case 6:
            System.out.println("Let's go hunt, doo, doo, doo, doo, doo, doo");
            System.out.println("Let's go hunt, doo, doo, doo, doo, doo, doo");
            System.out.println("Let's go hunt, doo, doo, doo, doo, doo, doo");
            System.out.println("Let's go hunt");
            break;
            case 7:
            System.out.println("Run away, doo, doo, doo, doo, doo, doo");
            System.out.println("Run away, doo, doo, doo, doo, doo, doo");
            System.out.println("Run away, doo, doo, doo, doo, doo, doo");
            System.out.println("Run away");
            break;
            case 8:
            System.out.println("Safe at last, doo, doo, doo, doo, doo, doo");
            System.out.println("Safe at last, doo, doo, doo, doo, doo, doo");
            System.out.println("Safe at last, doo, doo, doo, doo, doo, doo");
            System.out.println("Safe at last");
            break;
            case 9:
            System.out.println("It's the end, doo, doo, doo, doo, doo, doo");
            System.out.println("It's the end, doo, doo, doo, doo, doo, doo");
            System.out.println("It's the end, doo, doo, doo, doo, doo, doo");
            System.out.println("It's the end");
            break;
         default:
            System.out.println("Invalid Verse");
      }
   }
}
