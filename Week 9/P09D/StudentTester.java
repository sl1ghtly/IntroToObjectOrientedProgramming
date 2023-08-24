/* Practical P09C- StudentTester 
Eryk Gloginski
25/03/2021
Program StudentTester .*/

import java.util.Scanner;
import java.util.ArrayList;

public class StudentTester
{
   public static void main(String [] args)
   {  
      Scanner input = new Scanner(System.in);
      ArrayList<Student> students = new ArrayList<Student>();
      String courseName;
      
      students.add(new Student("David", "Games Development", false));
      students.add(new Student("Luke", "Games Development", false));
      students.add(new Student("Emma", "Applied Computing", false));
      students.add(new Student("James", "BSc in Computing", true));
      students.add(new Student("Sarah", "BSc in Computing", false));
      students.add(new Student("Stephan", "Security & Digital Forensics", false));
      students.add(new Student("Anna", "Security & Digital Forensicst", true));
      students.add(new Student("Bob", "Security & Digital Forensics", true));
      
      System.out.println("All Students: "); 
      for (Student s : students)
      {
         System.out.println(s.toString());
      }
      
      System.out.println();
      System.out.println("Full-time Students: ");
      for (Student s : students)
      {
         if (s.getPartTime() == false)
         {   
            System.out.println(s.toString());
         }
      }
      
      System.out.println();
      System.out.println("Part-time Students: ");
      for (Student s : students)
      {
         if (s.getPartTime() == true)
         {   
            System.out.println(s.toString());
         }
      }
      
      System.out.println();
      System.out.println("Please Enter a Course Name: ");
      courseName = input.nextLine();
      for (Student s : students)
      {
         if (s.getCourse() == courseName)
         {   
            System.out.println(s.toString());
         }
      }
   }
}
