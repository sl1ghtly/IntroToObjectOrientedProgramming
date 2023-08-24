/* CA2
Eryk Gloginski - L00157413
22/04/2021
Java Class TechnicianList*/

import java.util.*;

public class TechnicianList
{
   public static void main(String [] args)
   {
      // declare an arraylist of technicians
      ArrayList<Technician> technicianList = new ArrayList<Technician>();
      
      // declare three different technicians
      Technician first = new Technician("Jake Harrison", 1, 125000);
      Technician second = new Technician("Eryk Gloginski", 1, 100000);
      Technician third = new Technician("Aaron Jones", 2, 75000);
      int count = 0;
      double averageSal = 0;
      
      // add technicians to arraylist
      technicianList.add(first);
      technicianList.add(second);
      technicianList.add(third);
      
      // get and display display all salaries
      for (Technician t : technicianList)
      {
         count++;
         System.out.println(count + " Salary: " + t.getSalary());
      }
      
      // get and display average salary
      for (Technician t : technicianList)
      {
         averageSal = averageSal + t.getSalary();
      }
      
      averageSal = averageSal / technicianList.size();
      
      System.out.println("Average Salary for " + technicianList.size() + " technicians: " + averageSal);
      
      
      
      
      
   }
}