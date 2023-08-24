/* Practical P09D- Student Class
Eryk Gloginski
26/03/2021
Program Student Class .*/

public class Student
{
   //instance variables
   private int idNumber;
   private String name;
   private String course;
   private boolean partTime;
   private static int nextIdNumber = 1;
   
   public Student(String nameIn, String courseIn, boolean partTimeIn)
   {
      idNumber = 1000 + nextIdNumber++;
      name = nameIn;
      course = courseIn;
      partTime = partTimeIn;
   }
   
   public String toString()
   {
      String str = new String();
      str = str + "Student ID: " + idNumber + ", ";
      str = str + "Name: " + name + ", ";
      str = str + "Course: " + course + ", ";
      return str;
   }
   
   public boolean getPartTime()
   {
      return partTime;
   }
   
   public String getCourse()
   {
      return course;
   }

}
