/* Practical P10D- StudentTester Class
Eryk Gloginski
16/04/2021
Program StudentTester Class .*/

import java.util.Scanner;
import java.util.ArrayList;

public class StudentTester
{
   public static void main(String [] args)
   { 
      Scanner input = new Scanner(System.in);
      ArrayList<Student> students = new ArrayList<Student>();
      // add 3 basic students
      students.add(new Student("Max Johnsohn", 1, 30));
      students.add(new Student("Max O'Connor", 2, 70));
      students.add(new Student("Eryk Gloginski", 3, 90));
      
      // display all students
      System.out.println("All Students: ");
      for (Student s : students)
      {
         System.out.println(s.toString());
      }
      
      // number of students in array
      System.out.println();
      System.out.println("Number of students in the ArrayList: " + students.size());
      
      // find a student by id
      System.out.println();
      int studentNumber;
      System.out.println("Enter a student ID to find a student and display them: ");
      studentNumber = input.nextInt();
      for (Student s : students)
      {
         if (studentNumber == s.getIdNumber())
         {
            System.out.println(s.toString());
         }
      }
      if (studentNumber > students.size())
      {
         System.out.println("Not Found! ");
      }
      
      // get average grade of all students
      System.out.println();
      double average = 0;
      for (Student s : students)
      {
         average = average + s.getMark();
      }
      average = average / students.size();
      System.out.println("Average Grade of " + students.size() + " Students: " + average);
      
      // failed
      System.out.println();
      System.out.println("Students who Failed (Under 40%): ");
      for (Student s : students)
      {
         if (s.getMark() < 40)
         {
            System.out.println(s.toString());
         }
      }
      
      // merit
      System.out.println();
      System.out.println("Students with a Merit (Above 70%): ");
      for (Student s : students)
      {
         if (s.getMark() >= 70)
         {
            System.out.println(s.toString());
         }
      }
      
      // find student by name
      System.out.println();
      input.nextLine(); // clear the \n not used by nextInt()
      String name;
      System.out.println("Enter name to find a student by: ");
      name = input.nextLine();
      for (Student s : students)
      {
         if (s.getName().contains(name))
         {
            System.out.println(s.toString());
         }
      }
      
      // find student and remove him/her
      System.out.println();
      System.out.println("Enter a student ID to find a student and remove them: ");
      studentNumber = input.nextInt();
      for (Student s : students)
      {
         Student studentRemove = null;
         if (studentNumber == s.getIdNumber())
         {
            studentRemove = s;
         }
         students.remove(studentRemove);
      }
      if (studentNumber < 0 || studentNumber > students.size())
      {
         System.out.println("Doesn't exist! ");
      }
      
      // display remaining students
      System.out.println();
      System.out.println("Remaining Students: ");
      for (Student s : students)
      {
         System.out.println(s.toString());
      }
   }
}