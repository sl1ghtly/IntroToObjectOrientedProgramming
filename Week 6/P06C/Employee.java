/* Practical P06C- Employee Class
Eryk Gloginski
05/03/2021
Program Employee Class .*/

public class Employee
{
   //instance variables
   private int employeeNumber;
   private String employeeName;
   private double salary;
   private double raisedSalary;
   private double wage;
   private double bonusSalary;
   
   //constructors
   public Employee(int num, String name)
   {
      employeeNumber = num;
      employeeName = name;
      salary = 0;
   }
   
   public Employee(int num, String name, double sal)
   {
      employeeNumber = num;
      employeeName = name;
      salary = sal;
   }
   
   //methods
   public void setEmployeeName(String name)
   {
      employeeName = name;
   }
   
   public void setSalary(double amount)
   {
      salary = amount;
   }
   
   public int getEmployeeNumber()
   {
      return employeeNumber;
   }
   
   public String getEmployeeName()
   {
      return employeeName;
   }
   
   public double getSalary()
   {
      return salary;
   }
   
   public void raiseSalary(double amount)
   {
      raisedSalary = salary + amount;
   }
   
   public double calcMonthWage()
   {
      return wage = salary / 12;
   }
   
   public double calcWeekWage()
   {
      return wage = salary / 52;
   }
   
   public double calcPercBonus(double bonusPerc)
   {
      return bonusSalary = salary + (salary * bonusPerc);
   }
   
}