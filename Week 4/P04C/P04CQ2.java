/* Practical P04C- Question 2
Eryk Gloginski
18/02/2020
Program P04CQ2 .*/

import java.util.Scanner;

public class P04CQ2
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      String department;
      
      StringBuilder webAddress = new StringBuilder();
      webAddress.append("www.lyit.ie");
      webAddress.append("/courses");
      webAddress.insert(0, "http://");
      
      System.out.println("Please enter a department name: ");
      department = input.nextLine().toLowerCase();
      webAddress.append("/" + department);

      System.out.print(webAddress);
   }
}
