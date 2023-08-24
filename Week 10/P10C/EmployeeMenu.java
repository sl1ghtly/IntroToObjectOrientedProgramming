/* Practical P10C- Employee
Eryk Gloginski
15/04/2021
Program EmployeeMenu .*/

import java.util.*;

public class EmployeeMenu
{
   public static void main(String [] args)
   {  
	   			  	
		Scanner keyIn = new Scanner(System.in);
		//create an arrayList of employee object
		ArrayList<Employee> empList = new ArrayList<Employee>();
		String name;
		int option, idNo;
		double sal, amount;  
      boolean found;
      double largestYet = 0;
      double smallestYet = 0;
      double totalSal = 0;
      int count = 0;
      char find;
      
      empList.add(new Employee("Max Armstrong", 45000));
      empList.add(new Employee("Max Johnsohn", 35000));
      empList.add(new Employee("Amelia Rock", 35000));
      empList.add(new Employee("Eryk Gloginski", 35000));
      empList.add(new Employee("Erica Lopez", 25000));
		
		do{
			//display menu on screen
			System.out.println("MAIN MENU ");
			System.out.println("1. View all employees");
         System.out.println("2. Add employee");
         System.out.println("3. Remove employee");
         System.out.println("4. Display one employee");
         System.out.println("5. Display highest paid employee");
         System.out.println("6. Display lowest paid employee");
         System.out.println("7. Display total salaries");
         System.out.println("8. Give raise to an employee");
         System.out.println("9. No of employee with name beginning with ‘?’");
         System.out.println("0. Exit");

			System.out.println("Enter your option: "); 
			option = keyIn.nextInt();
			System.out.println();
         
			switch(option)
			{
				case 1:
               if (empList.isEmpty())
               {
                  noEmployees();
               }
               else
               {
                  System.out.println("\nEmployee Details: ");
                  for (Employee a : empList)
                  {
                     System.out.println(a.toString());
                  }
               }
					break;
				case 2:
               if (empList.isEmpty())
               {
                  noEmployees();
               }
               else
               {	
                  System.out.println("Enter employee name: ");
					   keyIn.nextLine();//clears the buffer
					   name = keyIn.nextLine();
					   System.out.println("Enter starting salary: ");
					   sal = keyIn.nextDouble();
					   //create an employee object
					   Employee b = new Employee(name, sal);
					   //add the employee object to the arraylist
					   empList.add(b);
					}
               break;
				case 3:
               if (empList.isEmpty())
               {
                  noEmployees();
               }
               else
               { 
                  //remove employee
				   	System.out.println("Enter employee ID: ");
               	idNo = keyIn.nextInt();
                  //must find employee first
                  Employee empRemove = find(idNo, empList);
                  //then remove
                  empList.remove(empRemove);
                  System.out.println("Successfully removed Employee! ");
					}
               break;
            case 4:
               if (empList.isEmpty())
               {
                  noEmployees();
               }
               else
               {
                  // display one employee
                  System.out.print("Enter employee ID: ");
                  idNo = keyIn.nextInt();
                  Employee empDisplay = find(idNo, empList);
                  System.out.println(empDisplay.toString());
					}
               break;
            case 5:
               if (empList.isEmpty())
               {
                  noEmployees();
               }
               else
               {
                  // display highest paid
                  for (Employee e : empList)
                  {
                     if (largestYet < e.getSalary())
                        largestYet = e.getSalary();
                  }
                  for (Employee e : empList)
                  {
                     if (largestYet == e.getSalary())
                        System.out.println(e.toString());
                  }
				   }
            	break;
            case 6:
               if (empList.isEmpty())
               {
                  noEmployees();
               }
               else
               {
                  // display lowest paid
                  for (Employee f : empList)
                  {
                     smallestYet = f.getSalary();
                     if (smallestYet < f.getSalary())
                        smallestYet = f.getSalary();
                  }
                  for (Employee f : empList)
                  {
                     if (smallestYet == f.getSalary())
                        System.out.println(f.toString());
                  }
					}
               break;
            case 7:
               if (empList.isEmpty())
               {
                  noEmployees();
               }
               else
               {
                  // distlay total sals
                  for (Employee g : empList)
                  {
                     totalSal = totalSal + g.getSalary();
                  }
                  System.out.println("Total Salaries Added: " + totalSal);
                  System.out.println();
				   }
            	break;
            case 8:
               if (empList.isEmpty())
               {
                  noEmployees();
               }
               else
               {
                  // raise salary of 1 employee
                  System.out.print("Enter employee ID: ");
                  idNo = keyIn.nextInt();
                  Employee empRaise = find(idNo, empList);
                  System.out.println("Enter amount to increase salary by: ");
                  amount = keyIn.nextDouble();
                  empRaise.raiseSalary(amount);
                  System.out.println("After Rise");
                  System.out.println(empRaise.toString());
					}
               break;
            case 9:
               if (empList.isEmpty())
               {
                  noEmployees();
               }
               else
               {
                  // find first letter names and count too
                  System.out.println("Enter an a letter of a first name: ");
                  find = keyIn.next().charAt(0);
                  for (Employee i : empList)
                  {
                     if (Character.toUpperCase(find) == i.getName().charAt(0))
                     {
                        count++;
                        System.out.println(i.toString());
                     }
                  }
                  System.out.println("Amount of people with their first name starting with " + find + ": " + count);
                  System.out.println();
                  count = 0;
					}
               break;
				case 0:
					break;
				default:
						System.out.println("Invalid option entered.");
			}//end switch
		}while(option != 0);
	}
   
   public static Employee find(int idNumIn, ArrayList<Employee> listIn)
   {
      for (Employee j : listIn)
      {
         if (idNumIn == j.getEmpNo())
            return j;
      }
      
      return null; // if doesn't exist/not found
   }
   
   public static void noEmployees()
   {
      System.out.println("There are no Employees Entered!");
   }
}