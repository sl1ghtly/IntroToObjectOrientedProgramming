/* CA2
Eryk Gloginski - L00157413
22/04/2021
Java Class Technician*/

public class Technician
{
   public String name;
   public int departmentNumber;
   public double salary;
   
   
   public Technician(String nameIn, int departmentNumberIn, double salaryIn)
   {
      name = nameIn;
      departmentNumber = departmentNumberIn;
      salary = salaryIn;
   }
   
   public double getSalary()
   {
      return salary;
   }
   

}