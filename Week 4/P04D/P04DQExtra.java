/* Practical P04D- Question Extra
Eryk Gloginski
18/02/2020
Program P04DQExtra .*/

import java.util.Scanner;

public class P04DQExtra
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      // vars
      String sentence = "WWw.LYit.com";
      String target = ".com";
      String replacement = ".ie";
      String lowerCaseSentence, replacedLowerCase, address;
      String requiredAddress = "www.lyit.ie";
      boolean beginsWww, endsCom, access;
      
      // to lower case
      lowerCaseSentence = sentence.toLowerCase();
      System.out.println("Lower Case: " + lowerCaseSentence);
      
      // begins with www true or false
      beginsWww = lowerCaseSentence.startsWith("www");
      System.out.println("Begins with WWW: " + beginsWww);
      
      // ends with com true or false
      endsCom = lowerCaseSentence.endsWith(".com");
      System.out.println("Ends with com: " + endsCom);
      if(endsCom == true)
      {
         // prints new parts changing com to ie
         System.out.println("Changing .com to .ie ");
         replacedLowerCase = lowerCaseSentence.replace(target, replacement);
         System.out.println(replacedLowerCase);
      }
      else
      {
         // prints old parts from if last part is ie
         System.out.println(lowerCaseSentence);
      }
      
      // get address and if address is same as access link then print true
      System.out.println("Enter a web address: ");
      address = input.nextLine().toLowerCase();
      access = address.equals(requiredAddress);
      
      if(access == true)
      {
         System.out.println("Welcome to Letterkenny Institute of Technology! ");
      }
      else
      {
         System.out.println("ERROR");
      }
      
      // display all parts split on new line
      String parts[] = address.split(".", 3);
      for (int i = 0; i < parts.length; i++)
      {
         System.out.println("Part" + (i + 1) + ": " + parts[i]);
      }
   }
}