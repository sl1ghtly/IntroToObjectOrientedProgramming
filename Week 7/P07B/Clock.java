/* Practical P07B- Clock Class
Eryk Gloginski
09/03/2021
Program Clock Class .*/

public class Clock
{
   private int hrs;     
   private int mins; 
   private int secs;    
   
   
   //constructors
   public Clock()
   {
      hrs = 0;
      mins = 0;
      secs = 0;
   }
   
   public Clock(int h, int m, int s)
   {
      hrs = h;
      mins = m;
      secs = s;
   }
   
   public boolean equals(Clock anotherClock)
   {
      return(hrs == anotherClock.hrs
      && mins == anotherClock.mins
      && secs == anotherClock.secs);
   }
   
   //Method to set the hours
   public void setHours(int hrsIn)
   {
      if (0 <= hrsIn && hrsIn < 24)
         hrs = hrsIn;
      else
         hrs = 0;
   } //end setHours
   
   //Method to set the minutes
   public void setMinutes(int minsIn)
   {
      if (0 <= minsIn && minsIn < 60)  //if time is valid
         mins = minsIn;
      else
         mins = 0;
   } //end setMinutes
   
   //Method to set the seconds
   public void setSeconds(int secsIn)
   {
      if (0 <= secsIn && secsIn < 60)
         secs = secsIn;
      else
         secs = 0;
   } //end setSeconds
   
   public void setTime(int hrsIn, int minsIn, int secsIn)
   {
       	hrs = hrsIn;  
     	   mins = minsIn;
         secs = secsIn;
   }
   
   //Method to return the hours
   public int getHours()
   {
      return hrs;
   }
   
   //Method to return the minutes
   public int getMinutes()
   {
      return mins;
   }
   
   //Method to return the seconds
   public int getSeconds()
   {
      return secs;
   }
    
   //Method to increment the time by one second
   public void tickTock()
   {
      secs++;
   
      if (secs > 59)
      {
         secs = 0;//reset seconds
         mins++; //increment minutes
      }
      if (mins > 59)
      {
         mins = 0;
         hrs++; //increment hours
      }
      if (hrs > 23)
         hrs = 0;  
   }
}