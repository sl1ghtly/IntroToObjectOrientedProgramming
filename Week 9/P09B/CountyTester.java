/* Practical P09B- CountyTester 
Eryk Gloginski
24/03/2021
Program CountyTester .*/

import java.util.Scanner;
import java.util.ArrayList;

public class CountyTester
{
   public static void main(String [] args)
   {  
      
      ArrayList<County> counties = new ArrayList<County>();
      
      counties.add(new County("County 1", 50000));
      counties.add(new County("County 2", 100000));
      counties.add(new County("County 3", 100000));
      counties.add(new County("County 4", 100000));
      counties.add(new County("County 5", 150000));
      
      for (County place : counties)
      {
         System.out.println(place.toString());
      }
   }
}