/* Practical P06C- Question 1
Eryk Gloginski
05/03/2021
Program P06CQ1 .*/

public class EmployeeTester
{
   public static void main(String [] args)
   {
      // vars
      int number = 12345678;
      String name = "Eryk Gloginski";
      double salary = 35000;
      double bonus = 0.05; // percentage = float pointing number so 0.05 = 5%
      double monthWage, weekWage, bonusAmount;
      
      Employee myEmployee = new Employee(number, name);
      myEmployee.setSalary(salary);
      
      int number2 = 87654321;
      String name2 = "David Johnson";
      double salary2 = 45000;
      double bonus2 = 0.05; // percentage = float pointing number so 0.05 = 5%
      double monthWage2, weekWage2, bonusAmount2;
      
      Employee myEmployee2 = new Employee(number2, name2, salary2);
      
      System.out.println("Employee 1 Number: " + myEmployee.getEmployeeNumber());
      System.out.println("Employee 1 Name: " + myEmployee.getEmployeeName());
      System.out.println("Employee 1 Salary: " + myEmployee.getSalary());
      myEmployee.raiseSalary(5000);
      System.out.println("Employee 1 Raised Salary: " + myEmployee.getSalary());
      monthWage = myEmployee.calcMonthWage();
      weekWage = myEmployee.calcWeekWage();
      System.out.println("Employee 1 Monthly Wage: " + monthWage);
      System.out.println("Employee 1 Weekly Wage: " + weekWage);
      bonusAmount = myEmployee.calcPercBonus(bonus);
      System.out.println("Employee 1 5% Salary Bonus: " + bonusAmount);
      
      System.out.println();
      
      System.out.println("Employee 2 Number: " + myEmployee2.getEmployeeNumber());
      System.out.println("Employee 2 Name: " + myEmployee2.getEmployeeName());
      System.out.println("Employee 2 Salary: " + myEmployee2.getSalary());
      myEmployee2.raiseSalary(5000);
      System.out.println("Employee 2 Raised Salary: " + myEmployee2.getSalary());
      monthWage2 = myEmployee2.calcMonthWage();
      weekWage2 = myEmployee2.calcWeekWage();
      System.out.println("Employee 2 Monthly Wage: " + monthWage2);
      System.out.println("Employee 2 Weekly Wage: " + weekWage2);
      bonusAmount2 = myEmployee2.calcPercBonus(bonus2);
      System.out.println("Employee 2 5% Salary Bonus: " + bonusAmount2);
      
   }
}