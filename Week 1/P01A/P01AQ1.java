/* Practical P01A- Question 1
Eryk Gloginski
26/01/2020
Program P01AQ1 .*/

public class P01AQ1
{
   public static void main(String[] args)
   {
      printSmaller(25, 10);
   } //end main method

   public static void printSmaller(int n1, int n2)
   {
      if (n1 < n2)
      {
         System.out.print("Smallest is: " + n1);
      }
      else
      {
         System.out.print("Smallest is: " + n2);
      }
   }
}
