public class ArrayMethods
{
   public static void main(String [] args)
   {
      int[] items = {4, 2};
      System.out.println(isSorted(items));     
   }

 

   public static boolean isSorted(int [] array)
   {  
      if(array[0] < array[1])
      {
         return true;
      }
      else
      {
         return false;
      }  
   }

}