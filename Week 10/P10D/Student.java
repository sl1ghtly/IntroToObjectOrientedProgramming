/* Practical P10D- Student Class
Eryk Gloginski
16/04/2021
Program Student Class .*/

public class Student
{
   private String name;
   private int idNumber;
   private double mark;
   
   public Student(String nameIn, int idNoIn, double markIn) {
      name = nameIn;
      idNumber = idNoIn;
      mark = markIn;
   }
   public String getName()
   {
      return name;
   }
   
   public int getIdNumber()
   {
      return idNumber;
   }
   
   public double getMark(){  
      return mark;
   }
   
   public String toString()
   {
      String str = new String();
      str = str + "Name: " + name + ", ";
      str = str + "Student ID Number: " + idNumber + ", ";
      str = str + "Average Marks: " + mark;
      return str;
   }
   
   public boolean equals(Student anotherStudent)
   {
      return(name == anotherStudent.name
      && idNumber == anotherStudent.idNumber
      && mark == anotherStudent.mark);
   }
}