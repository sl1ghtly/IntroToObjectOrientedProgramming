/* Practical P07B- Employee Class
Eryk Gloginski
09/03/2021
Program Employee Class .*/

public class Employee
{
	// instance variables
	private int empNo;
	private double salary;
	private String name;

	public Employee(int empNoIn, String nameIn)
	{
		empNo = empNoIn;
		name = nameIn;
		salary = 0.0; 
	}
	
	public Employee(int empNoIn, String nameIn, double salaryIn)
	{
		empNo = empNoIn;
		name = nameIn;
		salary = salaryIn;
	}

	
	// methods
	
   public String toString()
   {
      String str = new String();
      str = str + "Employee Number: " + empNo + " | Name: ";
      str = str + name + " | Salary: ";
      str = str + salary;
      return str;
   }
   
   public boolean equals(Employee anotherEmployee)
   {
      return(empNo == anotherEmployee.empNo
      && name == anotherEmployee.name
      && salary == anotherEmployee.salary);
   }
   
	
	public int getEmpNo()
	{	
		return empNo;		
	}

	public void setName(String nameIn)
	{	
		name  = nameIn;		
	}
	
	public String getName()
	{	
		return name;		
	}
	
	public void setSalary(double salaryIn)
	{	
		salary  = salaryIn;		
	}
	
	public double getSalary()
	{	
		return salary;		
	}
	
	public void raiseSalary(double raise)
	{
		salary += raise;
	}
	
	public void reduceSalary(double reduction)
	{
		salary -= reduction;
	}
	public double calcMonthlyPay()
	{
		return salary/12;
	}
	
	public double calcWeeklyPay()
	{
		return salary/52;
	}
	public double calcBonus(double percentBonus)
	{
		return  salary * (percentBonus/100);
	}


}// end of class