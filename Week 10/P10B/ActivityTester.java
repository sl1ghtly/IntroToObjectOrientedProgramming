/* Practical P10B- ActivityTester
Eryk Gloginski
14/04/2021
Program MortgageTester .*/

import java.util.Scanner;
import java.util.ArrayList;

public class ActivityTester
{
   public static void main(String [] args)
   {  
      Scanner input = new Scanner(System.in);
      ArrayList<Activity> activities = new ArrayList<Activity>();
      int count = 0;
      double noOfCalories;
      int pounds, minsActivity;
      String name;
      
      activities.add(new Activity("Basketball", 0.063));
      activities.add(new Activity("Walking", 0.037));
      activities.add(new Activity("Bicycling (9.5 mph)", 0.045));
      activities.add(new Activity("Golf", 0.038));
      activities.add(new Activity("Running (8-minute mile) ", 0.095));
      activities.add(new Activity("Sitting Still", 0.009));
      activities.add(new Activity("Swimming", 0.071));
      
      for (Activity a : activities)
      {
         System.out.println(a.toString()); 
      }
      
      System.out.println();
      System.out.println("Enter Number of Calories: (Example: 0.0XX)");
      noOfCalories = input.nextDouble();
      
      for (Activity a : activities)
      {
         if (a.getCalsBurnedMinute() > noOfCalories)
            System.out.println(a.toString()); 
      }
      
      System.out.println();
      System.out.println("Enter body weight in pounds: ");
      pounds = input.nextInt();
      System.out.println("Enter total minutes of activity: ");
      minsActivity = input.nextInt();
      
      for (Activity a : activities)
      {
         System.out.println(a.toString() + " | Calories Burned: " + a.getCaloriesBurned(pounds, minsActivity)); 
      }
      
      input.nextLine(); //throw away the \n not consumed by nextInt()
      
      System.out.println();
      System.out.println("Enter Activity Name: ");
      name = input.nextLine();
      System.out.println("Enter body weight in pounds: ");
      pounds = input.nextInt();
      System.out.println("Enter total minutes of activity: ");
      minsActivity = input.nextInt();
      
      for (Activity a : activities)
      {
         if (a.getActivity() == name)
            System.out.println("Calories Burned for " + name + ": " + a.getCaloriesBurned(pounds, minsActivity)); 
      }
      
   }
}
