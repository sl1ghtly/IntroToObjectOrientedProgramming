/* Practical P07B- OblongTester Class
Eryk Gloginski
09/03/2021
Program OblongTester Class .*/

public class OblongTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type Oblong
	   Oblong o1 = new Oblong();
	   Oblong o2 = new Oblong(-10, 5);
	   
	   System.out.println(o1);
      System.out.println(o2);
      
      if(o1 == o2)
      {
         System.out.println("These oblongs are the same");
      }
      
      System.out.println(o1.toString());
      System.out.println(o2.toString());
      
      if(o1.equals(o2))
      {
         System.out.println("Equal");
      }
      else
      {
         System.out.println("Not Equal");
      }
         
   }
}