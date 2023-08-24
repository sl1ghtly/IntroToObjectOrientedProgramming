/* Practical P08C- Employee Class
Eryk Gloginski
19/03/2021
Program Employee Class .*/

public class Employee
{
	// instance variables
	private int employeeID;
   private static int nextEmployeeID = 1;
	private double salary;
	private String name;
   private static double bonusRate;
   private int startDate;
   // constructor
	public Employee(String nameIn, int dateIn)
	{
		employeeID = nextEmployeeID++;
		name = nameIn;
		salary = 0;
      startDate = dateIn;
	}
	// constructor
	public Employee(String nameIn, double salaryIn, int dateIn)
	{
		employeeID = nextEmployeeID++;
		name = nameIn;
		salary = salaryIn;
      startDate = dateIn;
	}
   // constructor
   public Employee()
	{
		employeeID = nextEmployeeID++;
		name = "N/A";
		salary = 24000;
      startDate = 2010;
	}

	// methods
	// overloaded tostring method
   public String toString()
   {
      String str = new String();
      str = str + "Employee ID: " + employeeID;
      str = str + "\nName: " + name;
      str = str + "\nSalary: " + salary;
      str = str + "\nStart Date: " + startDate;
      return str;
   }
   // overloaded equals method
   public boolean equals(Employee anotherEmployee)
   {
      return(employeeID == anotherEmployee.employeeID
      && name == anotherEmployee.name
      && salary == anotherEmployee.salary
      && startDate == anotherEmployee.startDate);
   }
	// get employee number
	public int getEmpNo()
	{	
		return employeeID;		
	}
	// get employee name
	public String getName()
	{	
		return name;
	}
   // get employee salary
   public double getSalary()
	{	
		return salary;		
	}
   public int getStartDate()
   {
      return startDate;
   }
   // set employee start date in year format
   public void setStartDate(int dateIn)
   {
      startDate = dateIn;
   }
	// set employee bonus rate
   public static void setBonusRate(double bonusIn)
   {
      bonusRate = bonusIn;
   }
   // set employee name
   public void setName(String nameIn)
	{	
		name  = nameIn;		
	}
   // set employee salary
	public void setSalary(double salaryIn)
	{	
		salary  = salaryIn;		
	}
	// raise employee salary
	public void raiseSalary(double raise)
	{
		salary += raise;
	}
	// reduce employee salary
	public void reduceSalary(double reduction)
	{
		salary -= reduction;
	}
   // calculate employee monthly pay
	public double calcMonthlyPay()
	{
		return salary/12;
	}
	// calculate employee weekly pay
	public double calcWeeklyPay()
	{
		return salary/52;
	}
   // calculate employee bonus
	public double calcBonus(double percentBonus)
	{
		return salary * (percentBonus / 100);
	}
   // calculate set employee bonus (overloaded method)
   public double calcBonus()
	{
		return salary * (bonusRate / 100);
	}
}// end of class