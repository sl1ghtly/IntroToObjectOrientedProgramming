/* Practical P10B- Activity Class
Eryk Gloginski
14/04/2021
Program Activity Class .*/

public class Activity
{
   //instance variables
   private String activityName;
   private double calsBurnedPerMin;
   
   public Activity(String activityIn, double calsPerMinIn)
   {
      activityName = activityIn;
      calsBurnedPerMin = calsPerMinIn;
   }
   
   public double getCalsBurnedMinute()
   {
      return calsBurnedPerMin;
   }
   public String getActivity()
   {
      return activityName;
   }
   public double getCaloriesBurned(int minsOfActivityIn, int poundsIn)
   {
      return (minsOfActivityIn * poundsIn) * calsBurnedPerMin;
   }
   
   public String toString()
   {
      String str = new String();
      str = str + "Activity: " + activityName + " | ";
      str = str + "Cals Burned p Minute: " + calsBurnedPerMin;
      return str;
   }
   
   public boolean equals(Activity anotherActivity)
   {
      return(activityName == anotherActivity.activityName
      && calsBurnedPerMin == anotherActivity.calsBurnedPerMin);
   }
   
   
}
