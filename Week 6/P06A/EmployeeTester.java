/* Practical P06A- Question 1
Eryk Gloginski
01/03/2021
Program P06AQ1 .*/

public class EmployeeTester
{
   public static void main(String [] args)
   {
      Employee myEmployee = new Employee();
      
      // vars
      int number = 12345678;
      String name = "Eryk Gloginski";
      double salary = 35000;
      double bonus = 0.05; // percentage = float pointing number so 0.05 = 5%
      double monthWage, weekWage, bonusAmount;
      
      myEmployee.setEmployeeNumber(number);
      myEmployee.setEmployeeName(name);
      myEmployee.setSalary(salary);
      
      System.out.println("Employee Number: " + myEmployee.getEmployeeNumber());
      System.out.println("Employee Name: " + myEmployee.getEmployeeName());
      System.out.println("Employee Salary: " + myEmployee.getSalary());
      
      myEmployee.raiseSalary(5000);
      
      System.out.println("Employee Raised Salary: " + myEmployee.getSalary());
      
      monthWage = myEmployee.calcMonthWage();
      weekWage = myEmployee.calcWeekWage();
      
      System.out.println("Employee Monthly Wage: " + monthWage);
      System.out.println("Employee Weekly Wage: " + weekWage);
      
      bonusAmount = myEmployee.calcPercBonus(bonus);
      System.out.println("Employee 5% Salary Bonus: " + bonusAmount);
      
   }
}