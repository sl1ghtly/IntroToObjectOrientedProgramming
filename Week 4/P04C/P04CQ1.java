/* Practical P04C- Question 1
Eryk Gloginski
18/02/2020
Program P04CQ1 .*/

public class P04CQ1
{
   public static void main(String [] args)
   {
      StringBuilder webAddress = new StringBuilder();
      webAddress.append("www.lyit.ie");
      webAddress.append("/courses");
      webAddress.insert(0, "http://");

      System.out.print(webAddress);
   }
}
