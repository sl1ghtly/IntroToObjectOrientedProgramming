/* Practical P09C- WordList 
Eryk Gloginski
25/03/2021
Program WordList .*/

import java.util.Scanner;
import java.util.ArrayList;

public class WordList
{
   public static void main(String [] args)
   {  
      ArrayList <String> wordList = new ArrayList<String>();
      Scanner input = new Scanner(System.in);
      int choice, position, wordsAmount, longWordLength, shortWordLength;
      String word, longest, shortest;
      char firstLetter;
      boolean exists;
      
      wordList.add("hello");
      wordList.add("how");
      wordList.add("hi");
      wordList.add("hey");
      wordList.add("goodbye");
      wordList.add("greetings");
      
      do
      {
         System.out.println();
         System.out.println("Menu: ");
         System.out.println("1. Add Word. ");
         System.out.println("2. Remove Word.");
         System.out.println("3. View One Word. ");
         System.out.println("4. View All Words. ");
         System.out.println("5. Add Word at Position. ");
         System.out.println("6. Remove Word at Position. ");
         System.out.println("7. View All Words with Length. ");
         System.out.println("8. View All Words beginning with (x) letter. ");
         System.out.println("9. Find Longest and Shortest word in word list. ");
         System.out.println("0. Quit. ");
         System.out.println();
         System.out.println("Enter your Option: ");
         choice = input.nextInt();
         
         switch(choice)
         {
            case 1:
               System.out.println("Enter your word to add to the word list: ");
               input.nextLine();
               word = input.nextLine();
               exists = false;
               
               for (String wordInList : wordList)
               {
                  if (wordInList.equals(word))
                  {
                     System.out.println("Duplicate Entry!!! ");
                     exists = true;
                  }
               }
               if (!exists)
               {
                  wordList.add(word);
               }
               break;
            case 2:
               System.out.println("Enter your word to remove from the word list: ");
               input.nextLine();
               word = input.nextLine();
               wordList.remove(word);
               break;
            case 3:
               System.out.println("View one word in the word list: ");
               position = input.nextInt();
               System.out.println(wordList.get(position - 1));
               break;
            case 4:
               System.out.println("View all words in the word list: ");
               for (String wordInList : wordList)
               {
                  System.out.println(wordInList);
               }
               break;
            case 5:
               System.out.println("Enter your word to add to the word list: ");
               input.nextLine();
               word = input.nextLine();
               System.out.println("Enter the position you would like the word to be at: ");
               position = input.nextInt();
               exists = false;
               
               for (String wordInList : wordList)
               {
                  if (wordInList.equals(word))
                  {
                     System.out.println("Duplicate Entry!!! ");
                     exists = true;
                  }
               }
               if (!exists)
               {
                  wordList.add((position - 1), word);
               }
               
               break;
            case 6:
               System.out.println("Enter the position you would like the word to be at: ");
               position = input.nextInt();
               wordList.remove(position - 1);
               break;
            case 7:
               for (String wordInList : wordList)
               {
                  System.out.println(wordInList + " | Length: " + wordInList.length());
               }
               break;
            case 8:
               System.out.println("Enter a letter to get a list of all words that start with it");
               input.nextLine();
               firstLetter = input.next().charAt(0);
               wordsAmount = 0;
               for (String wordInList : wordList)
               {
                  if (wordInList.charAt(0) == firstLetter)
                  {
                     System.out.println(wordInList);
                     wordsAmount++;
                  }
               }
               System.out.println("Words starting with " + firstLetter + ": " + wordsAmount);
               break;
            case 9:
               System.out.println("View Longest and Shortest words: ");
               longest = wordList.get(0);
               longWordLength = longest.length();
               shortest = wordList.get(0);
               shortWordLength = shortest.length();
               
               for (String wordInList : wordList)
               {
                  if (wordInList.length() > longWordLength)
                  {
                     longWordLength = wordInList.length();
                     longest = wordInList;
                  }
                  
                  if (wordInList.length() < shortWordLength)
                  {
                     shortWordLength = wordInList.length();
                     shortest = wordInList;
                  }
               }
               
               System.out.println("Longest: " + longest + ", Length: " + longWordLength);
               System.out.println("Shortest: " + shortest + ", Length: " + shortWordLength);
               break;
            case 0:
               System.out.println("Quitting Application! ");
               break;
            default:
               System.out.println("Invalid Option! ");
         }
      } while(choice != 0);
   }
}