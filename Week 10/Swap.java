public class Swap
{
   public static void main(String[] args)
   {
      int x = 10;
      int y = 11;
      swap(x, y);
   }
 
   public static void swap( int one, int two)
   {
      int t = one;
      one = two;
      two = t;
      System.out.print( "First number is now " + one);
      System.out.println( " and Second number is now " + two);
   }
}