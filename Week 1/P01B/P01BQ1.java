/* Practical P01B- Question 1
Eryk Gloginski
27/01/2020
Program P01BQ1 .*/

/*
What part of the code do you want to reuse?
Verse Number
What information will differ each time you are reusing this code?
The output will differ each time you input a different verse number
What type of information is this?
String
What will I call this method?
displayVerse
What will I call the information the method will take in?
verseNumber
What is the main advantage of using a method for this?

*/

import java.util.Scanner;

public class P01BQ1
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
            System.out.println("Old MACDONALD had a farm");
            System.out.println("E-I-E-I-O");
            System.out.println("And on his farm he had a cow");
            System.out.println("E-I-E-I-O");
            System.out.println("With a moo moo here");
            System.out.println("And a moo moo there");
            System.out.println("Here a moo, there a moo");
            System.out.println("Everywhere a moo moo");
            System.out.println("Old MacDonald had a farm");
            System.out.println("E-I-E-I-O");
            break;
         case 2:
            System.out.println("Old MACDONALD had a farm");
            System.out.println("E-I-E-I-O");
            System.out.println("And on his farm he had a pig");
            System.out.println("E-I-E-I-O");
            System.out.println("With a oink oink here");
            System.out.println("And a oink oink there");
            System.out.println("Here a oink, there a oink");
            System.out.println("Everywhere a oink oink");
            System.out.println("Old MacDonald had a farm");
            System.out.println("E-I-E-I-O");
            break;
         case 3:
            System.out.println("Old MACDONALD had a farm");
            System.out.println("E-I-E-I-O");
            System.out.println("And on his farm he had a duck");
            System.out.println("E-I-E-I-O");
            System.out.println("With a quack quack here");
            System.out.println("And a quack quack there");
            System.out.println("Here a quack, there a quack");
            System.out.println("Everywhere a quack quack");
            System.out.println("Old MacDonald had a farm");
            System.out.println("E-I-E-I-O");
            break;
         case 4:
            System.out.println("Old MACDONALD had a farm");
            System.out.println("E-I-E-I-O");
            System.out.println("And on his farm he had a horse");
            System.out.println("E-I-E-I-O");
            System.out.println("With a neigh neigh here");
            System.out.println("And a neigh neigh there");
            System.out.println("Here a neigh, there a neigh");
            System.out.println("Everywhere a neigh neigh");
            System.out.println("Old MacDonald had a farm");
            System.out.println("E-I-E-I-O");
            break;
         case 5:
            System.out.println("Old MACDONALD had a farm");
            System.out.println("E-I-E-I-O");
            System.out.println("And on his farm he had a lamb");
            System.out.println("E-I-E-I-O");
            System.out.println("With a baa baa here");
            System.out.println("And a baa baa there");
            System.out.println("Here a baa, there a baa");
            System.out.println("Everywhere a baa baa");
            System.out.println("Old MacDonald had a farm");
            System.out.println("E-I-E-I-O");
            break;
         default:
            System.out.println("Invalid Verse");
      }
   }
}
