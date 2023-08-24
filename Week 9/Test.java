import java.util.Scanner;
import java.util.ArrayList;

public class Test
{
   public static void main(String [] args)
   {
      double angle = 45;
      angle %= 360;
      angle = (angle + 360) % 360;
      if (angle > 180)
      {
         angle -= 360;
      }
      
      System.out.println(angle);
   }
}