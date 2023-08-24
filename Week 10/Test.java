import java.util.Scanner;
public class Test
{
   public   static   void main(String[] args)
   {
   String s = "IOOP May 2021";
   if( s.contains("2021") )
      s=s.concat(", This year");
   else
      s=s.concat(", Previous year");
   System.out.println(s);
   }
}