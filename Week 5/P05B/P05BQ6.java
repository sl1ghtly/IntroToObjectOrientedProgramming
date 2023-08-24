/* Practical P05B- Question 6
Eryk Gloginski
24/02/2020
Program P05BQ6 .*/

public class P05BQ6
{
   public static void main(String[] args)
   {
      // create an instance of type Dog
      Dog luna = new Dog();
      luna.setBreed("Husky");
      luna.setSize(32);
      System.out.println("Luna says: " + luna.bark());
      System.out.println("Luna is a: " + luna.getBreed());
      System.out.println("Luna's size is: " + luna.getSize());
      
      System.out.println();
      
      Dog bella = new Dog();
      bella.setBreed("German Sheppard");
      bella.setSize(18);
      System.out.println("Bella says: " + bella.bark());
      System.out.println("Bella is a: " + bella.getBreed());
      System.out.println("Bella's size is: " + bella.getSize());
      
      System.out.println();
      
      Dog puddle = new Dog();
      puddle.setBreed("Puddle");
      puddle.setSize(8);
      System.out.println("Puddle says: " + puddle.bark());
      System.out.println("Puddle is a: " + puddle.getBreed());
      System.out.println("Puddle's size is: " + puddle.getSize());
   }
}