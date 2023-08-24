/* Practical P07B- ClockTester Class
Eryk Gloginski
09/03/2021
Program ClockTester Class .*/

public class ClockTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type Clock
	   Clock myclock1 = new Clock();
      Clock myclock2 = new Clock(12, 30, 30);
      Clock myclock3 = new Clock();
      Clock myclock4 = new Clock(12, 30, 30);
      Clock myclock5 = new Clock(12, 30, 30);
      String str1 = new String();
      String str2 = new String();
      String str3 = new String();
      String str4 = new String();
      
      //to see the time have to call all three methods
      System.out.println("1 Time is: " + myclock1.getHours() + ":" + myclock1.getMinutes() + ":" + myclock1.getSeconds());
      
      myclock1.setHours(18);
      myclock1.setMinutes(30);
      myclock1.setSeconds(10);
      System.out.println("1 Time is: " + myclock1.getHours() + ":" + myclock1.getMinutes() + ":" + myclock1.getSeconds());
      
      //System.out.println(myclock);  
		for(int i = 0; i < 10000; i++)
			myclock1.tickTock();
      
      str1 = str1 + myclock1.getHours() + "h:" + myclock1.getMinutes() + "m:" + myclock1.getSeconds() + "s";
      System.out.println("1 Time is: " + str1);
      
      System.out.println();
      System.out.println();
      
      //to see the time have to call all three methods
      System.out.println("2 Time is: " + myclock2.getHours() + ":" + myclock2.getMinutes() + ":" + myclock2.getSeconds());

      //System.out.println(myclock);  
		for(int j = 0; j < 10000; j++)
			myclock2.tickTock();
			
		System.out.println("2 Time is: " + myclock2.getHours() + ":" + myclock2.getMinutes() + ":" + myclock2.getSeconds()); 
      str2 = str2 + myclock2.getHours() + "h:" + myclock2.getMinutes() + "m:" + myclock2.getSeconds() + "s";
      System.out.println("2 Time is: " + str2);
      
      System.out.println();
      System.out.println();
      
      System.out.println("3 Time is: " + myclock3.getHours() + ":" + myclock3.getMinutes() + ":" + myclock3.getSeconds()); 
      myclock3.setTime(10, 15, 15);
		System.out.println("3 Time is: " + myclock3.getHours() + ":" + myclock3.getMinutes() + ":" + myclock3.getSeconds()); 
      
      System.out.println();
      System.out.println();
      
      str3 = str3 + myclock3.getHours() + "h:" + myclock3.getMinutes() + "m:" + myclock3.getSeconds() + "s";
      str4 = str4 + myclock4.getHours() + "h:" + myclock4.getMinutes() + "m:" + myclock4.getSeconds() + "s";
      
      System.out.println("4 Time is: " + str3);
      System.out.println("5 Time is: " + str4);
      
      if(myclock4.equals(myclock5))
      {
         System.out.println("Clock 4 Equals Clock 5. ");
      }
      else
      {
         System.out.println("Clock 4 Does Not Equal Clock 5. ");
      }
   }
}