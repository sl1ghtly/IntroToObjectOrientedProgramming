/* Practical P05B- Question 5
Eryk Gloginski
24/02/2020
Program P05BQ5 .*/

public class P05BQ5
{
   public static void main(String[] args)
   {
      // create an instance of type Dog
      Dog luna = new Dog();
      luna.setBreed("Husky");
      luna.setSize(23);
      System.out.println("Luna says: " + luna.bark());
      System.out.println("Luna is a: " + luna.getBreed());
      System.out.println("Luna's size is: " + luna.getSize());
   }
}