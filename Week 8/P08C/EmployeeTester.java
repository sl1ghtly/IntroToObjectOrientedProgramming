/* Practical P08C- EmployeeTester Class
Eryk Gloginski
19/03/2021
Program EmployeeTester Class .*/

import java.util.Scanner;

public class EmployeeTester
{
   public static void main(String [] args)
   {  
      Scanner input = new Scanner(System.in);
      Employee[] employees = new Employee[10];
      int toFind;
      int position = 0;
      double salary = 0;
      
      // populate the employee array
      for (int i = 0; i < employees.length; i++)
      {
         employees[i] = new Employee();
      }
      // display the employee array
      for (int i = 0; i < employees.length; i++)
      {
         System.out.println(employees[i].toString());
         System.out.println();
      }
      // calculate salary
      for (int i = 0; i < employees.length; i++)
      {
         if (employees[i].getStartDate() >= 2015)
         {
            employees[i].getSalary() = employees[i].getSalary() * (0.03 / 100);
         }
      }
      // calculate all employee's salary
      for (int i = 0; i < employees.length; i++)
      {
         salary = salary + employees[i].getSalary();
      }
      System.out.println("All the employee's salary combined is: Euro " + salary);
      // display full details of specified employee ID
      System.out.println("Enter an ID to display a class: ");
      toFind = input.nextInt();
      if (toFind > employees.length)
      {
         System.out.println("Enter a number that's " + employees.length + " or less than " + employees.length + ". ");
      }
      else  
      {
         System.out.println(employees[toFind - 1].toString());
      }
   }
}