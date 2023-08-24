/* Practical P07B- EmployeeTester Class
Eryk Gloginski
09/03/2021
Program EmployeeTester Class .*/

public class EmployeeTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type Employee
	   Employee emp1 = new Employee(123, "Joe bloggs");
	   Employee emp2 = new Employee(334, "Jane bloggs", 15000);
	   // use methods to check initial values
	   // use methods to retrieve values of instance variables
	   System.out.println("employee no: " + emp1.getEmpNo());
		System.out.println("Name: " + emp1.getName());
	   System.out.println("Salary: " + emp1.getSalary());   
	  
	  // use methods to retrieve values of instance variables
	   System.out.println("employee no: " + emp2.getEmpNo());
		System.out.println("Name: " + emp2.getName());
	   System.out.println("Salary: " + emp2.getSalary());   

	   System.out.println("Employee 1 Details: " + emp1);
      System.out.println("Employee 2 Details: " + emp2);
      
      System.out.println(emp1.toString());
      System.out.println(emp2.toString());
      
      if(emp1.equals(emp2))
      {
         System.out.println("Equal");
      }
      else
      {
         System.out.println("Not Equal");
      }
   }
}