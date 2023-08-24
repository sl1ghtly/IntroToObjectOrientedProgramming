import java.util.Scanner;
public class Test
{
   public   static   void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);   
      int largest;   
      int first, second;
      System.out.print( "Type in first number " );
      first = kb.nextInt();
      System.out.print( "Type in second number " );
      second = kb.nextInt();

      largest = max(first, second);
      System.out.println( "The greatest is " + largest);
  }

  public static int max( int num1, int num2)
  {
      if (num1 > num2)
      { 
       return num1;
      }  
      else
      {   
       return num2;
      }
  }
}

